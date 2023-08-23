package Actividad2;

public class cuadrado {
	double lado, diagonal, perimetro, area;
	public cuadrado(double lado){
		this.lado = lado;
	}

	public void calcularDiagonalid() {
		this.diagonal =Math.sqrt((lado*lado)+(lado*lado));
		System.out.println("la hipotenusa es "+this.diagonal);
	}
	public void calcularPerimetroid() {
		perimetro = 4*lado;
		System.out.println("el perimetro es "+this.perimetro);
	}
	public void calcularAreaid() {
		area = lado * lado;
		System.out.println("el area es "+this.area);
	}
}
