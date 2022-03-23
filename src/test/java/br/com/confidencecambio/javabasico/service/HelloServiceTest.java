package br.com.confidencecambio.javabasico.service;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloServiceTest {

	@Autowired
    private HelloService service;

    @Before
    public void init(){
         service = new HelloService();
    }


    @Test
    public void quandoPassarUmNomeQueroEleDeResposta(){
        var nome = "Meu Nome";
        String valorValido = service.retornaValorValido(nome);
        assertEquals(nome,valorValido);
    }

    @Test
    public void quandoPassarNuloQueroOPadrao(){

        String valorValido = service.retornaValorValido(null);
        assertEquals("Mundo",valorValido);
    }
    

    @Test
    public void parametroValorCalcularImc(){
    	var peso = 75.0;
    	var altura = 100.0;
    	
    	String valorValido = service.retornaCalculoImc(peso, altura, null);
    	assertEquals("0.0075",valorValido);
    }
    
    @Test
    public void parametroNuloCalcularImc(){
    	String valorValido = service.retornaCalculoImc(null, null, null);
    	assertEquals("inválido",valorValido);
    }
}