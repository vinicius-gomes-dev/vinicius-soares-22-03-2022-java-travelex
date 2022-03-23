package br.com.confidencecambio.javabasico.entities;

import java.util.Arrays;
import java.util.List;

import br.com.confidencecambio.javabasico.exceptions.PerfilException;

public class Perfil {
	private String[] nome;
	
	private static final String ERRO_NULO = "Null!";
	private static final String ERRO_VAZIO = "Vazio!";
	
	List<String> preposicoes = Arrays.asList("de", "do", "da", "dos", "das");
	
	
	public Perfil(String nome) {
		
		if(nome == null)
			throw new PerfilException(ERRO_NULO);
		else if(nome.isBlank())
			throw new PerfilException(ERRO_VAZIO);
		else {
			nome = nome.trim();
			this.nome = nome.split(" ");
		}
	
		
	}

	public String getNome() {
		return String.join(" ", nome).toUpperCase();
	}

	
	public void setNome(String nome) {
		if(nome == null)
			throw new PerfilException(ERRO_NULO);
		else if(nome.isBlank())
			throw new PerfilException(ERRO_VAZIO);
		else {
			nome = nome.trim();
			this.nome = nome.split(" ");
		}
	}
	
	public String getPrimeiroNome() {
		return nome[0].toUpperCase();
	}
	
	public String getSobrenome() {
		String sobrenome = "";
		for(int i = 0; i < nome.length; i++)
			if(i != 0) sobrenome += nome[i] + " ";
		
		return sobrenome.toUpperCase();
	}
	
	public String getNomeAbreviado() {
		boolean isPreposicao = false;
		
		for(int i = 0; i < nome.length; i++) {
			String nomeTemp = nome[i];
			isPreposicao = preposicoes.stream().anyMatch(prep -> prep.equals(nomeTemp));
			
			if(i != 0 && i != (nome.length -1) && !isPreposicao ) 
				nome[i] = nome[i].replace(nome[i], nome[i].substring(0, 1) + ".");
		}
		
		return String.join(" ", nome).toUpperCase();
	}
	
	

}
