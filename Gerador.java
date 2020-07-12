package com.mod.principal;

import java.util.LinkedList;
import java.util.List;

public abstract class Gerador {
	private List<Integer> sequencia=new LinkedList<Integer>();

	public List<Integer> getSequencia() {
		return sequencia;
	}

	public void setSequencia(Integer sequencia) {
		this.sequencia.add(sequencia);
	}
	
	public abstract void gerar(int qtd);

	
}
