package com.java.br;

public class conta {
	int numero;
	double saldo;
	
	cliente cliente =new cliente();
	
	public double recuperarSaldo() {
		return saldo;
		
	}
	
	public void depositar(double valor) {
		saldo=saldo+valor;
	}
}
