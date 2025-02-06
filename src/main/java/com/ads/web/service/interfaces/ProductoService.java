package com.ads.web.service.interfaces;

import java.util.List;

import com.ads.web.entities.Producto;

public interface ProductoService {

    public List<Producto> listarProductos();
	
	public Producto guardarProducto(Producto producto);
	
	public Producto actualizarProducto(Producto producto);
	
	public void eliminarProducto(Long id);
}
