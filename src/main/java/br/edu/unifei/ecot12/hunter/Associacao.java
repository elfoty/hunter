package br.edu.unifei.ecot12.hunter;

import java.util.ArrayList;
import java.util.List;

public class Associacao {
	private String presidente;
	private List<Hunter> zodiacos = new ArrayList<Hunter>();
	private List<Hunter> hunters = new ArrayList<Hunter>();
	private List<Procurados> lista = new ArrayList<Procurados>();
	
	public void addProcurados(Hunter procurado, Hunter alvo) {
		if(procurado.getNumeroIdentificacao().equals(alvo.getNumeroIdentificacao()) ) {
			Associacao a = new Associacao();
			Procurados p = new Procurados();
			p.getProcurados().add(alvo);
			a.getLista().add(p);
		}
	}
	
	public String getPresidente() {
		return presidente;
	}
	public void setPresidente(String presidente) {
		this.presidente = presidente;
	}
	public List<Hunter> getZodiacos() {
		return zodiacos;
	}
	public void setZodiacos(List<Hunter> zodiacos) {
		this.zodiacos = zodiacos;
	}
	public List<Hunter> getHunters() {
		return hunters;
	}
	public void setHunters(List<Hunter> hunters) {
		this.hunters = hunters;
	}
	public List<Procurados> getLista() {
		return lista;
	}
	public void setLista(List<Procurados> lista) {
		this.lista = lista;
	}
	
	
}
