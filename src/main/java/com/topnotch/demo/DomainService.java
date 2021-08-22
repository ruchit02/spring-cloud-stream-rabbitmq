package com.topnotch.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;

@Service
public class DomainService {

	@Autowired
	private StreamBridge bridge;
	
	private static final String domainStart = "https://api.domainsdb.info/v1/domains/search?domain=" ;
	private static final String domainEnd   = "&zone=com" ;

	public Flux<Domain> serveDomains(String name) {

		Flux<DomainList> domainList = WebClient.builder().build().get()
				.uri( domainStart + name + domainEnd )
				.accept(MediaType.APPLICATION_JSON).retrieve().bodyToFlux(DomainList.class);

		Flux<Domain> domains = domainList.flatMap(list -> {

			Flux<Domain> domain = Flux.fromStream(list.getDomains().stream());
			return domain;
		});

		domains.subscribe(domain -> bridge.send("tnDomainSupplier-out-0", domain));

		return domains;
	}

}
