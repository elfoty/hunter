package br.edu.unifei.ecot12.hunter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hunter extends Pessoa{
	private String numeroIdentificacao;
	private List<Missao> missoes = new ArrayList<Missao>();

	public String getNumeroIdentificacao() {
		return numeroIdentificacao;
	}
	public void setNumeroIdentificacao(String numeroIdentificacao) {
		this.numeroIdentificacao = numeroIdentificacao;
	}
	public List<Missao> getMissoes() {
		return missoes;
	}
	public void setMissoes(List<Missao> missoes) {
		this.missoes = missoes;
	}

	public Hunter examehunter(Pessoa p) {

		this.setNome(p.getNome());
		this.setIdade(p.getIdade());
		
		return this;
	}
}
