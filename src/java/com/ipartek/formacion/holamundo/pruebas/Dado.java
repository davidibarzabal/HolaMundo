package com.ipartek.formacion.holamundo.pruebas;

//import java.util.Random;

/**
 * Clase Java para simular un Dado y sacar un alumno de modo aleatorio
 * @author Curso
 *
 */
public class Dado {
	
	/**
	 * Variable para representar el numero de alumnos
	 * static: Solo se reserva memoria una vez
	 * final: No es modificable
	 * int: Tipo integer, numero entero
	 * 
	 */
	public static final int NUMERO_ALUMNOS = 15;
	
	public static final String NOMBRES_ALUMNOS [] = {
			"David Ibarzabal",
			"Oscar",
			"Gorka",
			"Ariane",
			"Gontzal",
			"Aitor",
			"Santi",
			"Raul",
			"David Ortiz",
			"Sergio",
			"David Barbudo",
			"Edorta",
			"Asier",
			"Alberto",
			"Iñigo"
			};
	
	/**
	 * Muestra por consola todos los alumnos del array <code>NOMBRES_ALUMNOS</code>.<br>
	 * ejemplo:
	 * <ul>
	 * 	<li>[0] David Ibarzabal</li>
	 * 	<li>[1] Oscar</li>
	 * 	<li>[x] ....</li>
	 * 	<li>[x] ....</li>
	 * 	<li>[14] Iñigo</li>
	 * </ul>
	 */
	public static void mostrarAlumnos(){
		for (int i = 0; i < NOMBRES_ALUMNOS.length; i++) {
			System.out.println("El alumno " + (i+1) + " es: " + NOMBRES_ALUMNOS[i]);
			// Clase: System.out.println("[" + i + "]" + NOMBRES_ALUMNOS[i]);
		}//end for
	}
	
	
	/**
	 * Genera Numero aleatorio entre 0 y <code>NUMERO_ALUMNOS</code>
	 * @return numero entero, si falla -1
	 */
	public static int generarNumero(){
		int resul = -1; //Inicializar con valor sin sentido para ver si sale error
		resul=(int)(Math.random() * NUMERO_ALUMNOS);
		return resul;
		
		/* Mio: Random rand = new Random();
		int  n = rand.nextInt(15) + 1;
		return n;
		*/
	}
	

	public static void main(String[] args) {

		mostrarAlumnos();
		
		System.out.println("El afortunado en leer es: ");
		
		
		System.out.println(NOMBRES_ALUMNOS[generarNumero()]);
		

	}
	/**
	 * Obtenemos un afortunado para leer de forma aleatoria.
	 * @return Nombre del afortunado, en caso de fallo retorna "No hay afortunado".
	 */
	public static String mostrarAfortunado() {
		String resul="No hay afortunado";
		resul = NOMBRES_ALUMNOS[generarNumero()];
		return resul;
	}
	/**
	 * Obtenemos un afortunado para leer de forma aleatoria, segun el numero que pasamos como parametro.
	 * @param numeroAleatorio <code>int</code> numero aleatorio que debe estar dentro del rango 0-(<code>NUMERO_ALUMNOS</code>-1)
	 * @return Nombre del afortunado, en caso de fallo retorna "No hay afortunado".
	 */
	public static String mostrarAfortunado( int numeroAleatorio) {
		String resul="No hay afortunado";
		resul = NOMBRES_ALUMNOS[numeroAleatorio];
		return resul;
	}
}
