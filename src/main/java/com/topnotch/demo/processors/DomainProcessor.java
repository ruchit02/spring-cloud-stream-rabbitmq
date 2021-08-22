package com.topnotch.demo.processors;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.topnotch.demo.adapters.Domain;

import reactor.core.publisher.Flux;

@Configuration
public class DomainProcessor {

	// cant convert from Flux<DomainList> to Flux<Domain>
	// only intermediate operations can be handled by this function
	@Bean
	public Function<Flux<Domain>, Flux<Domain>> tnDomainProcessor() {

		return domainFlux -> {

			return domainFlux.filter(domain -> !domain.isDead()).share();
		};
	}
}
