package com.ads.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.ads.web.service.interfaces.ProductoService;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping({"/inventario","/"})
    public String listarInventario(Model modelo) {
		modelo.addAttribute("productos", productoService.listarProductos());
		return "inventario";
    }
    @GetMapping("/inventario/registrarProducto")
    public String registrarProducto(Model modelo) {
		modelo.addAttribute("productos", productoService.listarProductos());
		return "RegistrarProducto";
    }
}
