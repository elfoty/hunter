package br.edu.unifei.ecot12.hunter;

import java.util.ArrayList;
import java.util.List;

public class Procurados {
	private int grauDificuldade;
	private List<Hunter> procurados = new ArrayList<Hunter>();
	public int getGrauDificuldade() {
		return grauDificuldade;
	}
	public void setGrauDificuldade(int grauDificuldade) {
		this.grauDificuldade = grauDificuldade;
	}
	public List<Hunter> getProcurados() {
		return procurados;
	}
	public void setProcurados(List<Hunter> procurados) {
		this.procurados = procurados;
	}
}