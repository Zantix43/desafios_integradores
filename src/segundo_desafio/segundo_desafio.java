package segundo_desafio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class segundo_desafio {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String titulo[] = new String[5];

		String autor[] = new String[5];

		int paginas[] = new int[5];

		boolean[] contador = { false, false, false, false, false };

		int opcion;

		int almacen;

		boolean limitador = false;

		int numero = 1;
		int numero2 = 1;
		int numero3 = 1;

		String busqueda;

		
		try {v
		
		while (limitador == false) {

			System.out.println("\nque opcion desea elegir? ");

			System.out.println("\nAgregar un libro = 1 ");

			System.out.println("\nMostrar lista de libros = 2");

			System.out.println("\nBuscar un libro por título = 3");

			System.out.println("\nSalir = 4");

			opcion = entrada.nextInt();
			
			if (opcion <= 0 || opcion > 5) {
				throw new ArithmeticException();
			}

			
				switch (opcion) {

				case 1:

					System.out.println("\ningrese un numero de almacenamiento: (1 a 5) ");
					almacen = entrada.nextInt();

					while (almacen < 0 || almacen > 5) {
						System.out.println("\nnumero de almacen no encontrado, vuelva a intertarlo:");
						almacen = entrada.nextInt();
					}

					while (contador[almacen - 1] == true) {
						System.out.println("\neste almacen ya fue ocupado elija otro");
						almacen = entrada.nextInt();

						while (contador[almacen - 1] == true) {
							System.out.println("\ningrese otro numero de almacen");
							almacen = entrada.nextInt();
						}
					}

					if (contador[almacen - 1] == false) {

						System.out.println("\ningrese el titulo del libro ");
						titulo[almacen - 1] = entrada.next();

						System.out.println("\ningrese el autor del libro ");
						autor[almacen - 1] = entrada.next();

						System.out.println("\ningrese el numero de paginas del libro ");
						paginas[almacen - 1] = entrada.nextInt();

						contador[almacen - 1] = true;

					}

					break;

				case 2:

					for (String weas : titulo) {
						System.out.println("\ntitulo numero " + numero++ + " : " + weas);
						if(numero > 5) {
							numero = 1;
						}
						// analizar si numero numero = 1
					}

					for (String weas : autor) {
						System.out.println("\nautor numero " + numero2++ + " : " + weas);
						if(numero2 > 5) {
							numero2 = 1;
						}
					}

					for (int weas : paginas) {
						System.out.println("\npaginas numero " + numero3++ + " : " + weas);
						if(numero3 > 5) {
							numero3 = 1;
						}
					}
					
					break;

				case 3:

					System.out.println("ingrese el titulo del libro que desea buscar");
					busqueda = entrada.next();

					for (int i = 0; i < titulo.length; i++) {

						if (busqueda.equals(titulo[i])) {
							System.out.println("se encontro el libro  " + titulo[i] + " y su autor es " + autor[i]+ " y su cantidad de paginas es : " + paginas[i]);
						}

					}

					break;

				case 4:

					System.out.println("programa finalizado");

					limitador = true;

					break;

				}
		}
			} catch (ArithmeticException e) {
				System.out.println("Error: almacen no encontrado");
			} catch (InputMismatchException e) {
				System.out.println("Error: ingreso de dato incorrecto");
			} catch (IndexOutOfBoundsException e){
			System.out.println("el numero es mayor que a los valores del array");
		}
		}
	}


