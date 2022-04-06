/*
  Andrés Carmona Navarro
  ced: 11671-0799	
  }*/

package test;

import carros.CarroBase;
import carros.Crossover;
import carros.Pickup;
import carros.Sedan;
import motores.MotorGasolina;

public class Test {
	
	
	

	public static void main(String[] args) {
	     //CarroBase carro = new CarroBase(); //composition
	     //carro.imprimirCategoria();
		 //System.out.println("*****hello world 2*****");
	       
		/*MotorGasolina motorGasolina = new MotorGasolina();//composicion
		
		//inyectando una instancia de motor gasolina al carro sedan
		//esto lo permite el polimorfismo
		CarroBase carro = new Sedan(motorGasolina);//polimorfismo
		carro.imprimirCategoria();*/
		
		
		
		
		
		
		
		MotorGasolina motorGasolina = new MotorGasolina();
		CarroBase carro = new Pickup(motorGasolina);//polimorfismo
		carro.imprimirCategoria();
		
		
		carro = new Sedan(motorGasolina);
		carro.imprimirCategoria();
		
		carro = new Crossover(motorGasolina);
		carro.imprimirCategoria();
		
		
		
		
		
		
		
	}
	
}
