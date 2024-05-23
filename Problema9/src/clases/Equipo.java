/*Propuesto_1_5*/
package clases;

public class Equipo {
	//ATRIBUTOS
	public int codigo;
	public String marca;
	public String color;
	public double precioD;
	
	//METODOS
	public double precioSoles() {
		return precioD * 3.73;
	}
	
	public double precioEuro() {
		return precioD * 0.92;
	}
}
