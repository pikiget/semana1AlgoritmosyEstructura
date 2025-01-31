/*Propuesto_1_4*/
package clases;

public class Caja {
	public double largo, ancho, alto, pesoBalanza;
	
	public Caja(double lar,double an, double al, double peso) {
		largo = lar;
		ancho = an;
		alto = al;
		pesoBalanza = peso;
	}
	
	public double volumenCaja() {
		return (largo * ancho * alto);
	}
	public double pesoVolumetrico() {
		return volumenCaja() / 5000;
	}
	public double pesoFacturable() {
		return Math.max(pesoBalanza, pesoVolumetrico());
	}
}
