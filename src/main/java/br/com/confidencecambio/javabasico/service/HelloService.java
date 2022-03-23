package br.com.confidencecambio.javabasico.service;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class HelloService {

    private static final String valorPadrao = "Mundo";
    private static final String valorPadraoImc = "inválido";

    public String retornaValorValido(@Nullable String nome) {
        return Optional.ofNullable(nome).orElse(valorPadrao);
    }
    
    public String retornaCalculoImc(@Nullable Double peso, @Nullable Double altura, @Nullable String imc) {
    	if(peso != null && altura != null) imc = String.valueOf(peso / (altura * altura)) ;
    	
		return Optional.ofNullable(imc).orElse(valorPadraoImc);
    }
}
