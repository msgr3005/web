package com.ads.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ads.web.entities.Cliente;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long>{

}
