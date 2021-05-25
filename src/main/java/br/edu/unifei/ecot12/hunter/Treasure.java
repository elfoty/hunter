package br.edu.unifei.ecot12.hunter;

import java.util.ArrayList;
import java.util.List;

public class Treasure extends Hunter {
	private String descricao;
	private int estrelas;
	private List<Tesouro> tesouros = new ArrayList<Tesouro>();
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
	public List<Tesouro> getTesouros() {
		return tesouros;
	}
	public void setTesouros(List<Tesouro> tesouros) {
		this.tesouros = tesouros;
	}
	
}
