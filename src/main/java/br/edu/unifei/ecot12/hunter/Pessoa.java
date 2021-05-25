package br.edu.unifei.ecot12.hunter;

import java.util.Random;

public class Pessoa {
	private String nome;
	private int idade;
	private Nen nen = new Nen();
	public Nen getNen() {
		return nen;
	}
	public void setNen(Nen nen) {
		this.nen = nen;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
