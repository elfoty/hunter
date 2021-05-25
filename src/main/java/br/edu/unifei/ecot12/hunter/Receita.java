package br.edu.unifei.ecot12.hunter;

import java.util.ArrayList;
import java.util.List;

public class Receita {
	private String nomeReceita;
	private int dificuldade;
	private List<String> ingredientes = new ArrayList<String>();
	public String getNomeReceita() {
		return nomeReceita;
	}
	public void setNomeReceita(String nomeReceita) {
		this.nomeReceita = nomeReceita;
	}
	public int getDificuldade() {
		return dificuldade;
	}
	public void setDificuldade(int dificuldade) {
		this.dificuldade = dificuldade;
	}
	public List<String> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(List<String> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
}
