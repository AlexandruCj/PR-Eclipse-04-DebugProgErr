package tema2_debug;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int contador = 1; // le ponemos que vale 1 para que el mensaje no salga "introduce la nota del
							// alumno 0, sino que empiece desde alumno 1
		double suma = 0;

		System.out.print("Introduce el número de alumnos: ");
		int numAlumnos = sc.nextInt();

		while (contador <= numAlumnos) {
			System.out.print("Introduce la nota del alumno " + contador + ": ");
			double nota = sc.nextDouble();

			if (nota < 0 || nota > 10) {
				System.out.println("Error: la nota debe estar entre 0 y 10. Intenta de nuevo.");
				// No se suma ni se avanza el contador
				continue; // Vuelve a pedir la nota
			}

			suma = suma + nota;
			contador++;
		}

		double media = suma / numAlumnos;
		System.out.println("La media del grupo es: " + media);

		sc.close();
	}
}
