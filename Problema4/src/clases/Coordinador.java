package clases;

public class Coordinador {
	public int codigo;
	public String nombre;
	public int categoria;
	public int celular;
	
	public double Sueldo() {
		if(categoria == 0) {
			return 8500;
		}
		else if(categoria == 1) {
			return 6850;
		}
		else if(categoria == 2) {
			return 5500;
		}
		return categoria;
	}
}
