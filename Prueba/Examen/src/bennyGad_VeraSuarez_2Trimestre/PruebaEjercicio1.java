package bennyGad_VeraSuarez_2Trimestre;

public class PruebaEjercicio1 {

	public static int[]creaArrayAleatoriosParImpar(int numero) {
		int []arrayRelleno=new int[numero];
		int min=0, max=9, aleatorio;
		for (int i = 0; i < arrayRelleno.length; i++) {
			aleatorio=(int) (min + Math.random() * (max - min + 1));
			if(i%2==0 && aleatorio%2!=0) {
				arrayRelleno[i]=aleatorio;
			}else  {
				arrayRelleno[i]=aleatorio;
			}
			
			
			
			
			
			
			
			
			//Condición para ver si la posición es par o impar
//			if(i%2==0) {
//				do {
//					//Genera un numero aleatorio hasta que sea par
//					aleatorio=(int) (min + Math.random() * (max - min + 1));
//				} while (aleatorio%2!=0);
//				//Rellena la posicion par del array con un numero par
//				arrayRelleno[i]=aleatorio;
//			} else {
//				do {
//					//Genera un numero aleatorio hasta que sea impar
//					aleatorio=(int) (min + Math.random() * (max - min + 1));
//				} while (aleatorio%2==0);
//				//Rellena la posicion impar del array con un numero impar
//				arrayRelleno[i]=aleatorio;
//			}
		}
		return arrayRelleno;
	}
}
