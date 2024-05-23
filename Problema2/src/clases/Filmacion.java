package clases;

public class Filmacion {
	//ATRIBUTOS
	public int codigo;
	public String titulo;
	public int minutos;
	public double soles;
	
	//METODOS
	public double precioDolares() {
		return soles * 3.7;
	}
}
