package com.example.contadorIncremental.contador;

import org.springframework.stereotype.Service;

@Service
public class ContadorService {

    private Contador contador = new Contador();

    public int getVisitas(){

        return contador.getNumeroPeticiones();
    }

    public void incrementaVisita(){

        contador.setNumeroPeticiones(contador.getNumeroPeticiones() + 1);

    }


}