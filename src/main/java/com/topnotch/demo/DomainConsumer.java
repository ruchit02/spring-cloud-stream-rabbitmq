package com.topnotch.demo;

import java.util.function.Consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import reactor.core.publisher.Flux;

@Configuration
public class DomainConsumer {

	@Bean
	public Consumer<Flux<Domain>> tnDomainConsumer() {

		return domainFlux -> {

			domainFlux.subscribe((domain -> System.out
					.println("CONSUMER : " + domain.getDomain() + " | IS DEAD? " + domain.isDead())));
		};
	}
}
