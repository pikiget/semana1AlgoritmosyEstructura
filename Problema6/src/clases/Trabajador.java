/*Propuesto_1_2*/
package clases;

public class Trabajador {
	//ATRIBUTOS
	public int codigo;
	public String nombre;
	public int horas;
	public double tarifa;
	
	//METODOS
	public double Sueldo() {
		return horas * tarifa;
	}
}
