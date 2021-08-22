package com.topnotch.demo.consumers;

import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.topnotch.demo.adapters.Domain;
import com.topnotch.demo.models.DBDomain;
import com.topnotch.demo.repositories.DomainRepository;

import reactor.core.publisher.Flux;

@Configuration
public class DomainConsumer {

	@Autowired
	private DomainRepository repository;

	@Bean
	public Consumer<Flux<Domain>> tnDomainConsumer() {

		return domainFlux -> {

			domainFlux.subscribe(domain -> {

				System.out.println("CONSUMER : " + domain.getDomain());
				
				DBDomain dbDomain = new DBDomain();
				dbDomain.setDomain( domain.getDomain() );
				dbDomain.setCreate_date( domain.getCreate_date() );
				dbDomain.setUpdate_date( domain.getUpdate_date() );
				dbDomain.setCountry( domain.getCountry() );
				dbDomain.setIs_dead( domain.isDead() );
				dbDomain.setA( domain.getA() );
				dbDomain.setNS( domain.getNS() );
				dbDomain.setCNAME( domain.getCNAME() );
				dbDomain.setMX( domain.getMX() );
				dbDomain.setTXT( domain.getTXT() );
				
				repository.saveAndFlush( dbDomain );

				return;
			});

			return;
		};
	}
}
