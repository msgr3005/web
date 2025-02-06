package com.ads.web.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ads.web.entities.Operador;
import com.ads.web.repository.OperadorRepository;

@Service
public class OperadorService {
 @Autowired
    private OperadorRepository operadorRepository;

    public List<Operador> obtenerOperadores() {
        return operadorRepository.findAll();
    }

    public Operador guardarOperador(Operador operador) {
        return operadorRepository.save(operador);
    }
}
