/*Propuesto_1_1*/
package clases;

public class Expositor {
	//ATRIBUTOS
	public int codigo;
	public String nombre;
	public int horas;
	public double tarifa;
	
	//CONSTRUCTOR
	public Expositor(int cod, String nom, int ho, double tar) {
		codigo = cod;
		nombre = nom;
		horas = ho;
		tarifa = tar;
	}
	
	//METODOS
	public double sueldoBruto() {
		return horas * tarifa;
	}
	public double descuentoAFP() {
		return sueldoBruto() * 0.1;
	}
	public double descuentoEPS() {
		return sueldoBruto() * 0.05;
	}
	public double sueldoNeto() {
		return (sueldoBruto() - descuentoAFP() - descuentoEPS());
	}
}
