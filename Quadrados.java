package com.mod.principal;

public class Quadrados extends Gerador {
	
	public void gerar(int qtd) {
		for(int i=0;i<=qtd;i++) {
			if(Math.sqrt(i)==(int)Math.sqrt(i)) {
				System.out.println(i);
			}
		}
	}
}
