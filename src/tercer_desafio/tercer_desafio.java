package tercer_desafio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tercer_desafio {
	
	//es el segundo por las dudas :D

	static int numero1;

	static int numero2;

	public static void numeros() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el primer numero:");
		numero1 = entrada.nextInt();

		System.out.println("\nIngrese el segundo numero");
		numero2 = entrada.nextInt();
	}

	public static int Suma(int a, int b) {
		int suma = a + b;

		return suma;
	}

	public static int Resta(int a, int b) {
		int resta = a - b;

		return resta;
	}

	public static int Multiplicacion(int a, int b) {
		int Multiplicacion = a * b;

		return Multiplicacion;
	}

	public static int Division(int a, int b) {
		int division = a / b;

		return division;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		try {

			String ope;
			
			String respuesta;

			boolean repe = false;

			while (repe == false) {

				numeros();

				System.out.println("\nQue operación matematica desea hacer? ");
				ope = entrada.next();

				switch (ope) {

				case "suma":
					Suma(numero1, numero2);

					System.out.println("El resultado es: " + Suma(numero1, numero2));
					
					System.out.println("Desea continuar maistro? si/no ");
					respuesta = entrada.next();
					
					switch(respuesta) {
					
					case "si":
						
						System.out.println("\nAdelante");
						
					break;
					
					case "no":
						
						System.out.println("\nPrograma finalizado,tenga buen dia!");
					
						repe = true;
					}
					break;

				case "resta":
					Resta(numero1, numero2);

					System.out.println("El resultado es: " + Resta(numero1, numero2));
					
					System.out.println("Desea continuar maistro? si/no ");
					respuesta = entrada.next();
					
					switch(respuesta) {
					
					case "si":
						
						System.out.println("\nAdelante");
						
					break;
					
					case "no":
						
						System.out.println("\nPrograma finalizado,tenga buen dia!");
					
						repe = true;
					}

					break;

				case "multiplicacion":
					Multiplicacion(numero1, numero2);

					System.out.println("El resultado es: " + Multiplicacion(numero1, numero2));
					
					System.out.println("Desea continuar maistro? si/no ");
					respuesta = entrada.next();
					
					switch(respuesta) {
					
					case "si":
						
						System.out.println("\nAdelante");
						
					break;
					
					case "no":
						
						System.out.println("\nPrograma finalizado,tenga buen dia!");
					
						repe = true;
					}

					break;

				case "division":
					Division(numero1, numero2);

					if (numero1 <= 0 || numero2 <= 0) {
						throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo.");
					}

					System.out.println("El resultado es: " + Division(numero1, numero2));
					
					System.out.println("Desea continuar maistro? si/no ");
					respuesta = entrada.next();
					
					switch(respuesta) {
					
					case "si":
						
						System.out.println("\nAdelante");
						
					break;
					
					case "no":
						
						System.out.println("\nPrograma finalizado,tenga buen dia!");
					
						repe = true;
					}

					break;

				}
			}
		} catch (ArithmeticException e) {
			System.out.println("Error: Division por cero");
		} catch (InputMismatchException e) {
			System.out.println("Error: ingreso de dato incorrecto");
		}

	}

}
