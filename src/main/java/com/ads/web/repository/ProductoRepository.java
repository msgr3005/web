package com.ads.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ads.web.entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto,Long>{

}
