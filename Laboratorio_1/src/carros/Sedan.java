/*
  Andr�s Carmona Navarro
  ced: 11671-0799	
  }*/

package carros;

import motores.Motor;

public class Sedan extends CarroBase {

	public Sedan(Motor motor) {
		super(motor);
	}

	@Override
	public void imprimirCategoria() {
		System.out.println("Soy Sedan");
		imprimirMotor();
	}
}