package br.edu.unifei.ecot12.hunter;

import java.util.ArrayList;
import java.util.List;

public class Cozinheiro extends Hunter {
	private String descricao;
	private float nivelPaladar;
	private String temperoFavorito;
	private int estrelas;
	private List<Receita> receitas = new ArrayList<Receita>();
	public List<Receita> getReceitas() {
		return receitas;
	}
	public void setReceitas(List<Receita> receitas) {
		this.receitas = receitas;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getNivelPaladar() {
		return nivelPaladar;
	}
	public void setNivelPaladar(float nivelPaladar) {
		this.nivelPaladar = nivelPaladar;
	}
	public String getTemperoFavorito() {
		return temperoFavorito;
	}
	public void setTemperoFavorito(String temperoFavorito) {
		this.temperoFavorito = temperoFavorito;
	}
	public int getEstrelas() {
		return estrelas;
	}
	public void setEstrelas(int estrelas) {
		this.estrelas = estrelas;
	}
	
}
