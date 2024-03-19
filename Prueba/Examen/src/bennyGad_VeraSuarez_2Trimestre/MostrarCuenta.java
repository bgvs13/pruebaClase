package bennyGad_VeraSuarez_2Trimestre;


import java.util.Scanner;

public class MostrarCuenta {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		int opcion;
		double ingreso, retiro;
		Cuenta benny=new Cuenta("Benny", 20, "646464515");
		
		
		do {
			System.out.println("Menú");
			System.out.println("1.Ingresar dinero ");
			System.out.println("2.Retirar dinero");
			System.out.println("3.Mostrar información de cuenta");
			System.out.println("4.Salir");
			System.out.println("Ingrese opción: ");
			opcion=entrada.nextInt();
			
			switch (opcion) {
			case 1: {
				System.out.println("Dinero a ingresar: ");
				ingreso=entrada.nextDouble();
				benny.ingresarDinero(ingreso);
				System.out.println("El dinero actual se queda en: "+benny.getSaldo());
				break;
			}
			case 2:{
				System.out.println("Cantidad a retirar: ");
				retiro=entrada.nextDouble();
				benny.retirarDinero(retiro);
				if(retiro>benny.getSaldo()) {
					System.out.println("No se puede sacar");
				}
				System.out.println("El dinero actual se queda en: "+benny.getSaldo());
				break;
			}
			case 3:{
				System.out.println(benny);
				break;
			}
			case 4:{
				System.out.println("Saliendo....");
				break;
			}
			} 
			
		}while (opcion!=4);
		entrada.close();
	}
}


