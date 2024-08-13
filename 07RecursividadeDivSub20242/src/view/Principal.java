package view;

import controller.DivideSub;

public class Principal {

	public static void main(String[] args) {
		DivideSub divs = new DivideSub();
		int dividendo = 30;
		int divisor = 8;
		int resultado = divs.divideSub(dividendo, divisor);
		System.out.println(resultado);
	}

}
