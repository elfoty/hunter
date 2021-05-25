package br.edu.unifei.ecot12.hunter;

import java.util.ArrayList;
import java.util.List;

public class Arqueologo extends Hunter {
	private String descricao;
	private int estrelas;
	private List<Descoberta> descobertas = new ArrayList<Descoberta>();
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getEstrelas() {
		return estrelas;
	}
	public void setEstrelas(int estrelas) {
		this.estrelas = estrelas;
	}
	public List<Descoberta> getDescobertas() {
		return descobertas;
	}
	public void setDescobertas(List<Descoberta> descobertas) {
		this.descobertas = descobertas;
	}
	
}
