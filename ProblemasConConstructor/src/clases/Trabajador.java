/*Propuesto_1_2*/
package clases;

public class Trabajador {
	//ATRIBUTOS
	public int codigo;
	public String nombre;
	public int horas;
	public double tarifa;
	
	//CONSTRUCTOR
	public Trabajador(int cod, String nom, int ho, double tar) {
		codigo = cod;
		nombre = nom;
		horas = ho;
		tarifa = tar;
	}
	
	//METODOS
	public double sueldo() {
		return horas*tarifa;
	}
}
