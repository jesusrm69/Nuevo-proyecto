
import java.io.*;
public class Test 

{
	
	
	public static void main(String[] args) {
		 
		
		double cantidadingresar;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader flujoE = new BufferedReader(isr);
		
		
		
		try{
		
		System.out.println("introduce la cantidad a ingresar: ");//introducimos el dato en string
		cantidadingresar = Double.parseDouble( flujoE.readLine());//pasamos el string a doble
		System.out.println("cantidad ingresadas: " + cantidadingresar);
		
		CCuenta cuenta01 = new CCuenta();
		CCuenta cuenta02 = new CCuentaAhorro("Manuel Rodriguez", "Cuenta Principal",20000,3.5);
		
		cuenta01.asignarNombre("Jesus Rodriguez");
		cuenta01.asignarCuenta("Cuenta principal");
		cuenta01.asignarTipoDeInteres(2.5);
		
		cuenta01.ingreso(cantidadingresar);
		cuenta01.reingreso(3000);
		
		System.out.println(cuenta01.obtenerNombre());
		System.out.println(cuenta01.obtenerCuenta());
		System.out.println(cuenta01.estado());
		System.out.println(cuenta01.obtenerTipoDeInteres());
		
		
		System.out.println(cuenta02.obtenerNombre());
		System.out.println(cuenta02.obtenerCuenta());
		System.out.println(cuenta02.estado());
		System.out.println(cuenta02.obtenerTipoDeInteres());
		}
		
		catch(IOException e){
			System.out.println("Error: " + e.getMessage());
			
		}
		
		
	}

}
