package br.edu.unifei.ecot12.hunter;

import java.util.ArrayList;
import java.util.List;

public class Faccao {
	private String nomeFaccao;
	private String indole;
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	private List<Missao> missoes = new ArrayList<Missao>();
	public String getNomeFaccao() {
		return nomeFaccao;
	}
	public void setNomeFaccao(String nomeFaccao) {
		this.nomeFaccao = nomeFaccao;
	}
	public String getIndole() {
		return indole;
	}
	public void setIndole(String indole) {
		this.indole = indole;
	}
	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	public List<Missao> getMissoes() {
		return missoes;
	}
	public void setMissoes(List<Missao> missoes) {
		this.missoes = missoes;
	}
}
