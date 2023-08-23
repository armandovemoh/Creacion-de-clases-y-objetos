package Actividad2;

public class circulo {
	double rad, circun, area;
	public circulo(double rad){
		this.rad = rad;
	}
	public void calculcarCircunid() {
		this.circun = 2*3.14159265*rad;
		System.out.println("La circunferencia es de: "+this.circun);
	}
	public void calcularAreaid() {
		this.area = 3.14159265*(rad*rad);
		System.out.println("El area del circulo es de: "+this.area);
	}
}