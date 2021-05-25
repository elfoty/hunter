package br.edu.unifei.ecot12.hunter;

public class Medico extends Hunter{
	private String descricao;
	private String areaEspecializacao;
	private int estrelas;
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getAreaEspecializacao() {
		return areaEspecializacao;
	}
	public void setAreaEspecializacao(String areaEspecializacao) {
		this.areaEspecializacao = areaEspecializacao;
	}
	public int getEstrelas() {
		return estrelas;
	}
	public void setEstrelas(int estrelas) {
		this.estrelas = estrelas;
	}
	
}
