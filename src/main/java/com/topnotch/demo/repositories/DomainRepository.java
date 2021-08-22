package com.topnotch.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.topnotch.demo.models.DBDomain;

@Repository
public interface DomainRepository extends JpaRepository<DBDomain, String>{

}
