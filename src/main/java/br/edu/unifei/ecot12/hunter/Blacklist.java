package br.edu.unifei.ecot12.hunter;

import java.util.List;
import java.util.ArrayList;

public class Blacklist extends Hunter{
	private String descricao;
	private int estrelas;
	private int numMortos;
	private String numIdentificacaoAlvo;
	private List<Procurados> lista = new ArrayList<Procurados>();
	
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

	public int getNumMortos() {
		return numMortos;
	}

	public void setNumMortos(int numMortos) {
		this.numMortos = numMortos;
	}

	public String getNumIdentificacaoAlvo() {
		return numIdentificacaoAlvo;
	}

	public void setNumIdentificacaoAlvo(String numIdentificacaoAlvo) {
		this.numIdentificacaoAlvo = numIdentificacaoAlvo;
	}

	public List<Procurados> getLista() {
		return lista;
	}

	public void setLista(List<Procurados> lista) {
		this.lista = lista;
	}

	public boolean verificarAlvo(Hunter alvo, Hunter suspeito) {
		if(alvo.getNumeroIdentificacao().equals(suspeito.getNumeroIdentificacao())) {
			Procurados p = new Procurados();
			p.getProcurados().add(suspeito);
			return true;
		}else {
			return false;
		}
	}
}
