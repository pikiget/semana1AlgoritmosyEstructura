package clases;

public class Persona {
	//ATRIBUTOS
	public String nombre;
	public String apellido;
	public int edad;
	public double estatura;
	public double peso;
	
	//METODOS
	public String Calcularedad() {
		if(edad>=18) {
			return ("Mayor Edad");
		}
		else {
			return ("Menor Edad");
		}
	}
	
	public double masaCorporal() {
		return peso / (estatura*estatura);
	}
}
