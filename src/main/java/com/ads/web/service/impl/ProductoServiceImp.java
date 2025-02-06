package com.ads.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ads.web.entities.Producto;
import com.ads.web.repository.ProductoRepository;
import com.ads.web.service.interfaces.ProductoService;
@Service
public class ProductoServiceImp implements ProductoService{
    @Autowired
    private ProductoRepository productoRepository;
    @Override
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
        // TODO Auto-generated method stub
    }

    @Override
    public Producto guardarProducto(Producto producto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'guardarProducto'");
    }

    @Override
    public Producto actualizarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);
    }

}
