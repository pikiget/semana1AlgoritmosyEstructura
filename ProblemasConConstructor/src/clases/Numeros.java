/*Propuesto_1_3*/
package clases;

import java.util.Arrays;

public class Numeros {
	//ATRIBUTOS
	public int numero1,numero2,numero3;

	//CONSTRUCTOR
	public Numeros(int num1, int num2, int num3) {
		numero1 = num1;
		numero2 = num2;
		numero3 = num3;
	}
	
	//METODOS
	public int numeroMenor() {
		if(numero1<numero2 && numero1<numero3)
			return numero1;
		else if (numero2<numero1 && numero2<numero3)
			return numero2;
		else 
			return numero3;
	
	}
	public int numeroMayor() {
		if(numero1>numero2 && numero1>numero3)
			return numero1;
		else if (numero2>numero1 && numero2>numero3)
			return numero2;
		else 
			return numero3;
	
	}
	public int numeroMedio() {
		int [] numeros = {numero1,numero2,numero3};	
		Arrays.sort(numeros);
		return numeros[1];
	}
}
