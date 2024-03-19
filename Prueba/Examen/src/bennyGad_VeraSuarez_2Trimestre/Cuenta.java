package bennyGad_VeraSuarez_2Trimestre;

import java.util.ArrayList;

public class Cuenta {

	//ATRIBUTOS
	private static String nombreCliente;
	private double saldo;
	private String codigoCuenta;
	private ArrayList<Double> listado=new ArrayList<>();
	
	//CONSTRUCTOR
	public Cuenta(String nombreCliente, double saldo, String codigoCuenta) {
		Cuenta.nombreCliente=nombreCliente;
		this.setSaldo(saldo);
		this.codigoCuenta=codigoCuenta;
	}

	//GETTERS Y SETTERS
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

	public ArrayList<Double> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Double> listado) {
		this.listado = listado;
	}
	
	

	public String getCodigoCuenta() {
		return codigoCuenta;
	}

	public void setCodigoCuenta(String codigoCuenta) {
		this.codigoCuenta = codigoCuenta;
	}

	//MÉTODOS
	//Para retirar dinero
	public double retirarDinero(double retiro) {
		if(retiro<=getSaldo()) {
			saldo=getSaldo();
			setSaldo(saldo-retiro);
		}
		listado.add(-retiro);
		return saldo;
	}
	
	//Ingresar dinero
	public double ingresarDinero(double ingreso) {
		saldo=getSaldo();
		setSaldo(saldo+ingreso);
		listado.add(ingreso);
		return saldo;
	}
	
	//Acumular listado de cuentas
	public ArrayList<Double> listado(double cantidad){
		ArrayList<Double> listado= new ArrayList<>();
		listado.add(cantidad);
		setListado(listado);
		
		return listado;
	}
	
	
	//IMPRIMIR
	public String toString() {
		return "La cuenta de "+ nombreCliente + " cuyo código es: "+ getCodigoCuenta()+ " tiene un saldo de: "+getSaldo()+" y sus movimientos son: "+getListado();
	}

	
	
	
}
