package br.com.confidencecambio.javabasico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.confidencecambio.javabasico.entities.Cliente;
import br.com.confidencecambio.javabasico.entities.Gerente;
import br.com.confidencecambio.javabasico.entities.Perfil;
import br.com.confidencecambio.javabasico.entities.Robo;

@SpringBootApplication
public class JavaBasicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaBasicoApplication.class, args);
		
		Perfil perfil = new Perfil("    João Soares Silva dos Santos Costa    ");
		System.out.println();
		System.out.println("perfil.getNome(): " + perfil.getNome());
		System.out.println("perfil.getPrimeiroNome(): " + perfil.getPrimeiroNome());
		System.out.println("perfil.getSobrenome(): " + perfil.getSobrenome());
		System.out.println("perfil.getNomeAbreviado(): " + perfil.getNomeAbreviado());
		
		Perfil cliente = new Cliente("    João Soares Silva dos Santos Costa    ");
		System.out.println();
		System.out.println("cliente.getNome(): " + cliente.getNome());
		System.out.println("cliente.getPrimeiroNome(): " + cliente.getPrimeiroNome());
		System.out.println("cliente.getSobrenome(): " + cliente.getSobrenome());
		System.out.println("cliente.getNomeAbreviado(): " + cliente.getNomeAbreviado());
		
		Perfil gerente = new Gerente("    João Soares Silva dos Santos Costa    ");
		System.out.println();
		System.out.println("gerente.getNome(): " + gerente.getNome());
		System.out.println("gerente.getPrimeiroNome(): " + gerente.getPrimeiroNome());
		System.out.println("gerente.getSobrenome(): " + gerente.getSobrenome());
		System.out.println("gerente.getNomeAbreviado(): " + gerente.getNomeAbreviado());
		
		Perfil robo = new Robo("    João Soares Silva dos Santos Costa    ");
		System.out.println();
		System.out.println("robo.getNome(): " + robo.getNome());
		System.out.println("robo.getPrimeiroNome(): " + robo.getPrimeiroNome());
		System.out.println("robo.getSobrenome(): " + robo.getSobrenome());
		System.out.println("robo.getNomeAbreviado(): " + robo.getNomeAbreviado());
	}

}
