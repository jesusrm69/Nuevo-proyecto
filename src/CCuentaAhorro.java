
public class CCuentaAhorro extends CCuenta {
	
	//atributos
	private double cuotamantenimieto;
	
	//constructor de la clase con parametros
	
	public CCuentaAhorro(){};//contructor base sin argumentos
	//constructor sobrecargado
	public CCuentaAhorro(String nom, String cue, double sal, double tipo){
		
		asignarNombre(nom);
		asignarCuenta(cue);
		asignarTipoDeInteres(tipo);
		ingreso(sal);
		
	}
	//constructor sobrecargado
	public CCuentaAhorro(String nom, String cue, double sal, double tipo, double mant){
		
		super(nom,cue,sal,tipo);//invocamos el construcctor de la clase base
		asignarCuotaManten(mant);
		
	}
	
	public void asignarCuotaManten(double cantidad){
		
		if(cantidad < 0){
			
			System.out.println("Error: Cantidad Negativa");
			return;
			
		}
		cuotamantenimieto = cantidad;
	}	
	
	public double obtenerCuotaManten(){
		
		return cuotamantenimieto;
	}
}
