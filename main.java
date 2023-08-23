package Actividad2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

			
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa una opción (cuadrado, circulo): ");
		String opcion = scanner.nextLine();
		
		switch(opcion) {
		case "cuadrado":
			System.out.println("Ingresa el valor de tu ID: ");
			double cba = scanner.nextDouble();
			cuadrado micuadrado2 = new cuadrado(cba/100); //el tamaño del lado se define aqui
			micuadrado2.calcularDiagonalid();
			micuadrado2.calcularPerimetroid();
			micuadrado2.calcularAreaid();
			break;
		case "circulo":

			System.out.println("Ingresa el valor de tu ID: ");
			double bac = scanner.nextDouble();
			circulo micirculo2 = new circulo(bac/100);
			micirculo2.calculcarCircunid();
			micirculo2.calcularAreaid();
			break;
		default : System.out.println("Esa no es una opción.");
	}
	}
}
