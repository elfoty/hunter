package br.edu.unifei.ecot12.hunter;

import java.util.ArrayList;
import java.util.List;

public class Missao {
	private String localizacao;
	private String objetivo;
	private List<Hunter> hunters = new ArrayList<Hunter>();
	public List<Hunter> getHunters() {
		return hunters;
	}
	public void setHunters(List<Hunter> hunters) {
		this.hunters = hunters;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public String getObjetivo() {
		return objetivo;
	}
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	
}
