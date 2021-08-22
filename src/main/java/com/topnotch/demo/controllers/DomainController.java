package com.topnotch.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.topnotch.demo.adapters.Domain;
import com.topnotch.demo.services.DomainService;

import reactor.core.publisher.Flux;

@RestController
public class DomainController {

	@Autowired
	private DomainService supplier;

	@GetMapping("/lookup/{name}")
	public String lookupDomain(@PathVariable String name) {

		Flux<Domain> domains = supplier.serveDomains(name);
		domains.subscribe(domain -> System.out.println(domain.getDomain()));

		return "We have crawled your data!";
	}
}