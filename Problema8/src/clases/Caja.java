/*Propuesto_1_4*/
package clases;

public class Caja {
	//ATRIBUTOS
	public double largo, ancho, alto, pesoBanlanza;
	
	//METODOS
	public double volumenCaja() {
		return largo * ancho * alto;
	}
	public double pesoVolumetrico() {
		return volumenCaja() / 5000;
	}
	public double pesoFacturable() {
		return Math.max(pesoBanlanza, pesoVolumetrico());
	}
}
