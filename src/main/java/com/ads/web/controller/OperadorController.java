package com.ads.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ads.web.entities.Operador;

import com.ads.web.service.OperadorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class OperadorController {
@Autowired
    private OperadorService operadorService;

/*@GetMapping
    public List<Operador> obtenerOperadores() {
        return operadorService.obtenerOperadores();
    }

    @PostMapping
    public Operador guardarOperadores(@RequestBody Operador operador) {
        return operadorService.guardarOperador(operador);
    }
    */
    
}
