package br.edu.unifei.ecot12.hunter;

import java.util.ArrayList;
import java.util.List;

public class Musical extends Hunter{
	private float nivelAudicao;
	private int estrelas;
	private String descricaoHabilidade;
	private List<Instrumento> instrumentos = new ArrayList<Instrumento>();
	public float getNivelAudicao() {
		return nivelAudicao;
	}
	public void setNivelAudicao(float nivelAudicao) {
		this.nivelAudicao = nivelAudicao;
	}
	public int getEstrelas() {
		return estrelas;
	}
	public void setEstrelas(int estrelas) {
		this.estrelas = estrelas;
	}
	public List<Instrumento> getInstrumentos() {
		return instrumentos;
	}
	public void setInstrumentos(List<Instrumento> instrumentos) {
		this.instrumentos = instrumentos;
	}
	public String getDescricaoHabilidade() {
		return descricaoHabilidade;
	}
	public void setDescricaoHabilidade(String descricaoHabilidade) {
		this.descricaoHabilidade = descricaoHabilidade;
	}
	
}
