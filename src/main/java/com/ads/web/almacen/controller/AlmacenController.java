package com.ads.web.almacen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ads.web.almacen.entities.MovimientoInventario;
import com.ads.web.almacen.entities.Producto;
import com.ads.web.almacen.repository.ProductoRepository;
import com.ads.web.almacen.service.AlmacenService;

@Controller
@RequestMapping("/almacen")
public class AlmacenController {

    @Autowired
    private AlmacenService almacenService;

    @Autowired
    private ProductoRepository productoRepository;

    // Registrar ingreso de productos
    @PostMapping("/ingreso")
    public ResponseEntity<String> registrarIngreso(@RequestParam Long productoId, @RequestParam int cantidad) {
        Producto producto = productoRepository.findById(productoId)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

        almacenService.registrarIngreso(producto, cantidad);
        return ResponseEntity.ok("Ingreso registrado correctamente");
    }

    // Registrar salida de productos
    @PostMapping("/salida")
    public ResponseEntity<String> registrarSalida(@RequestParam Long productoId, @RequestParam int cantidad) {
        Producto producto = productoRepository.findById(productoId)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

        almacenService.registrarSalida(producto, cantidad);
        return ResponseEntity.ok("Salida registrada correctamente");
    }

    // Obtener el inventario actual
    /*@GetMapping("/inventario")
    public ResponseEntity<List<Producto>> obtenerInventario() {
        return ResponseEntity.ok(almacenService.obtenerInventario());
    }*/
    @GetMapping("/inventario")
    public String obtenerInventario(Model modelo) {
        List<Producto> listaProductos = almacenService.obtenerInventario();
        modelo.addAttribute("listaProductos", listaProductos);
        return "productos";
    }

    // Obtener el historial de movimientos
    @GetMapping("/historial")
    public ResponseEntity<List<MovimientoInventario>> obtenerHistorial() {
        return ResponseEntity.ok(almacenService.obtenerHistorial());
    }
}

