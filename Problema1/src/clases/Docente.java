package clases;

public class Docente {
	//ARIBUTOS
	public int codigo;
	public String nombre;
	public int horas;
	public double tarifa;

	//METODOS
	public double sueldoBruto() {
		return (horas*tarifa);
	}
	
	public double calcularDescuento() {
		if(sueldoBruto()<4500) {
			return 0.12*sueldoBruto();
		}
		else if(sueldoBruto()>=4500 && sueldoBruto()<6500) {
			return 0.14*sueldoBruto();
		}
		else {
			return 0.16*sueldoBruto();
		}
	}
	
	public double sueldoNeto() {
		return sueldoBruto() - calcularDescuento();
	}
}
