package bennyGad_VeraSuarez_2Trimestre;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		int longitud;
		
		System.out.println("Introduce la longitud: ");
		longitud=entrada.nextInt();
		//Rellena el array creado con sus condiciones correspondientes
		int []array=PruebaEjercicio1.creaArrayAleatoriosParImpar(longitud);
		//int []array=creaArrayAleatoriosParImpar(longitud);
		entrada.close();
		
		//Imprime el array creado
		System.out.println("Array numero par posiciones pares, número impar posiciones impares:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"\t");
		}
		System.out.println();
		//Ordena el array de menor a mayor
		Arrays.sort(array);
		
		//Imprime el array de manera ordenada
		System.out.println("Array ordenado: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"\t");
		}
	}
	
	/*Método para crear el array con numeros pares en posiciones pares y numeros
	impares en posiciones impares*/
	public static int[]creaArrayAleatoriosParImpar(int numero) {
		int []arrayRelleno=new int[numero];
		int min=0, max=9, aleatorio;
		for (int i = 0; i < arrayRelleno.length; i++) {
			//Condición para ver si la posición es par o impar
			if(i%2==0) {
				do {
					//Genera un numero aleatorio hasta que sea par
					aleatorio=(int) (min + Math.random() * (max - min + 1));
				} while (aleatorio%2!=0);
				//Rellena la posicion par del array con un numero par
				arrayRelleno[i]=aleatorio;
			} else {
				do {
					//Genera un numero aleatorio hasta que sea impar
					aleatorio=(int) (min + Math.random() * (max - min + 1));
				} while (aleatorio%2==0);
				//Rellena la posicion impar del array con un numero impar
				arrayRelleno[i]=aleatorio;
			}
		}
		return arrayRelleno;
	}

}
