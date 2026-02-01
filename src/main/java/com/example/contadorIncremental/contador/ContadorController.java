package com.example.contadorIncremental.contador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContadorController {

    private final ContadorService contadorService;

    public ContadorController(ContadorService contadorService){
        this.contadorService = contadorService;
    }

    @GetMapping("/")
    public int getVisitas(){
        return contadorService.getVisitas();
    }

    @PostMapping("/inc")
    public void nuevaVisita(){
        contadorService.incrementaVisita();
    }


}
