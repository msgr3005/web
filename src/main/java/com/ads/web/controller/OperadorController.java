package com.ads.web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.ads.web.service.OperadorService;



@Controller
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
