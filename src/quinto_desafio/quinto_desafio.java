package quinto_desafio;

import java.io.*;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class quinto_desafio {

	static String[] nombre = new String[3];

	static String[] apellido = new String[3];

	static int[] camisetanum = new int[3];

	static String[] supnombre = new String[4];

	static String[] supapellido = new String[4];

	static int[] supcamisetanum = new int[4];

	public static void ingresarDatos() {
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("\ningrese el nombre del jugador " + (i + 1) + " : ");
			nombre[i] = entrada.next();

			System.out.println("\ningrese el apellido del jugador " + (i + 1) + " : ");
			apellido[i] = entrada.next();

			System.out.println("\ningrese el numero de camiseta del jugador " + (i + 1) + " : ");
			camisetanum[i] = entrada.nextInt();

		}

	}

	public static void agregarSup() {
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			supnombre[i] = nombre[i];

			supapellido[i] = apellido[i];

			supcamisetanum[i] = camisetanum[i];
		}

		System.out.println("\ndesea agregar a un jugador suplente? ");
		String suplente = entrada.next().toLowerCase();

		while (!suplente.equals("si") && !suplente.equals("no")) {

			System.out.println("\nerror,vuelva a reintertarlo: ");
			suplente = entrada.next().toLowerCase();
		}

		if (suplente.equals("si")) {

			System.out.println("\ningrese el nombre del jugador suplente ");
			supnombre[3] = entrada.next();

			System.out.println("\ningrese el apellido del jugador suplente ");
			supapellido[3] = entrada.next();

			System.out.println("\ningrese el numero de camiseta del jugador suplente");
			supcamisetanum[3] = entrada.nextInt();

			analizarDatosCuatroJugadores();

		}

		if (suplente.equals("no")) {

			System.out.println("\njoya rey");

			analizarDatosTresJugadores();

		}

	}

	public static void analizarDatosTresJugadores() {
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("\nnombre del jugador " + (i + 1) + " : " + nombre[i]);

			System.out.println("\napellido del jugador " + (i + 1) + " : " + apellido[i]);

			System.out.println("\nnumero de camiseta del jugador " + (i + 1) + " : " + camisetanum[i]);

		}

		System.out.println("\ntodos los datos son correctos? ");
		String correcion = entrada.next();

		while (!correcion.equals("si") && !correcion.equals("no")) {

			System.out.println("\nerror,vuelva a reintertarlo: ");
			correcion = entrada.next().toLowerCase();
		}

		if (correcion.equals("si")) {

			System.out.println(" ");

		}

		if (correcion.equals("no")) {

			System.out.println("\ningrese el numero de camiseta");
			int busqcamiseta = entrada.nextInt();

			for (int i = 0; i < camisetanum.length; i++) {

				if (busqcamiseta == camisetanum[i]) {

					System.out.println("\ningrese el nombre del jugador ");
					nombre[i] = entrada.next();

					System.out.println("\ningrese el apellido del jugador ");
					apellido[i] = entrada.next();

					System.out.println("\ningrese el numero de camiseta del jugador ");
					camisetanum[i] = entrada.nextInt();

					for (int e = 0; e < 3; e++) {
						System.out.println("\nnombre del jugador " + (e + 1) + " : " + nombre[e]);

						System.out.println("\napellido del jugador " + (e + 1) + " : " + apellido[e]);

						System.out.println("\nnumero de camiseta del jugador " + (e + 1) + " : " + camisetanum[e]);

					}

					System.out.println("\nsi lo ingresaste mal otravez cagate salame tenes que reiniciar el programa");
				}

			}

		}
		
		try {
			File archivo = new File("C:\\Users\\Alumno\\Desktop\\ListaJugadores\\archivo_jugadores.txt");
			
			if (!archivo.exists()) {
				archivo.createNewFile();
	         }
			
			FileWriter fw = new FileWriter(archivo);

	         
	         BufferedWriter bw = new BufferedWriter(fw);

	         
	         for (int i = 0; i < 3; i++) {
	             bw.write("Nombre: " + supnombre[i] + ", Apellido: " + supapellido[i]+" camiseta: "+supcamisetanum[i]);

	             bw.newLine();
	         }
	         bw.close();
	         
		} catch (IOException e) {
			e.printStackTrace();
		}
		 try {
	       
	         FileReader archivo = new FileReader("C:\\\\Users\\\\Alumno\\\\Desktop\\\\ListaJugadores\\\\archivo_jugadores.txt");
	         BufferedReader lector = new BufferedReader(archivo);

	         
	         String linea;

	        
	         while ((linea = lector.readLine()) != null) {
	          
	             System.out.println(linea);
	         }

	       
	         lector.close();
	     } catch (IOException e) {
	         e.printStackTrace();
	     }
	}

	public static void analizarDatosCuatroJugadores() {
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			if (i < 3) {
				System.out.println("\nnombre del jugador " + (i + 1) + " : " + supnombre[i]);

				System.out.println("\napellido del jugador " + (i + 1) + " : " + supapellido[i]);

				System.out.println("\nnumero de camiseta del jugador " + (i + 1) + " : " + supcamisetanum[i]);
			}
			if (i == 3) {
				System.out.println("\nnombre del jugador suplente " + supnombre[i]);

				System.out.println("\napellido del jugador suplente " + supapellido[i]);

				System.out.println("\nnumero de camiseta del jugador suplente " + supcamisetanum[i]);
			}
		}

		System.out.println("\ntodos los datos son correctos? ");
		String correcion = entrada.next();

		while (!correcion.equals("si") && !correcion.equals("no")) {

			System.out.println("\nerror,vuelva a reintertarlo: ");
			correcion = entrada.next().toLowerCase();
		}

		if (correcion.equals("si")) {

			System.out.println("\njoya rey");
		}

		if (correcion.equals("no")) {

			System.out.println("\ningrese el numero de camiseta");
			int busqcamiseta = entrada.nextInt();

			for (int i = 0; i < supcamisetanum.length; i++) {

				if (busqcamiseta == supcamisetanum[i]) {

					System.out.println("\ningrese el nombre del jugador ");
					supnombre[i] = entrada.next();

					System.out.println("\ningrese el apellido del jugador ");
					supapellido[i] = entrada.next();

					System.out.println("\ningrese el numero de camiseta del jugador ");
					supcamisetanum[i] = entrada.nextInt();

					for (int r = 0; r < 4; r++) {
						if (r < 3) {
							System.out.println("\nnombre del jugador " + (r + 1) + " : " + supnombre[r]);

							System.out.println("\napellido del jugador " + (r + 1) + " : " + supapellido[r]);

							System.out
									.println("\nnumero de camiseta del jugador " + (r + 1) + " : " + supcamisetanum[r]);
						}
						if (r == 3) {
							System.out.println("\nnombre del jugador suplente " + supnombre[r]);

							System.out.println("\napellido del jugador suplente " + supapellido[r]);

							System.out.println("\nnumero de camiseta del jugador suplente " + supcamisetanum[r]);
						}
					}

					System.out.println("\nsi lo ingresaste mal otravez cagate salame tenes que reiniciar el programa");
				}

			}
		}

		try {
			File archivo = new File("C:\\Users\\Alumno\\Desktop\\ListaJugadores\\archivo_jugadores.txt");
			
			if (!archivo.exists()) {
				archivo.createNewFile();
	         }

			FileWriter fw = new FileWriter(archivo);

	         
	         BufferedWriter bw = new BufferedWriter(fw);

	         
	         for (int i = 0; i < 4; i++) {
	        	 if(i<3) {
		             bw.write("Nombre: " + supnombre[i] + ", Apellido: " + supapellido[i]+" camiseta: "+supcamisetanum[i]);
		        	 }
		             if(i == 3) {
			             bw.write("Nombre suplente: " + supnombre[i] + ", Apellido suplente: " + supapellido[i]+" camiseta suplente: "+supcamisetanum[i]);
			             
		             }
	             bw.newLine();
	         }
	         bw.close();
	         
		} catch (IOException e) {
			e.printStackTrace();
		}
		 try {
	       
	         FileReader archivo = new FileReader("C:\\\\Users\\\\Alumno\\\\Desktop\\\\ListaJugadores\\\\archivo_jugadores.txt");
	         BufferedReader lector = new BufferedReader(archivo);

	         
	         String linea;

	        
	         while ((linea = lector.readLine()) != null) {
	          
	             System.out.println(linea);
	         }

	       
	         lector.close();
	     } catch (IOException e) {
	         e.printStackTrace();
	     }
	}

	public static void main(String[] args) {
		ingresarDatos();
		agregarSup();
	}
}
