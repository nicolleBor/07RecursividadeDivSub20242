package controller;

public class DivideSub {

	public DivideSub() {
		super();
	}
	
	public int divideSub(int dividendo, int divisor) {
		//Comando de parada
		if(dividendo < divisor) {
			return dividendo;
		} else {
			return divideSub(dividendo - divisor, divisor); //Chamada da Função
		}
	}

}
