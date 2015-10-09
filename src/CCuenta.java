
public class CCuenta {
	
	
	//atributos
		private String nombre;
		private String cuenta;
		private double saldo;
		private double TipoDeInteres;
	
	
	//constructores
	
	
	public CCuenta(){}
	public CCuenta(String nom, String cue, double sal, double tipo){
		
		asignarNombre(nom);
		asignarCuenta(cue);
		asignarTipoDeInteres(tipo);
		ingreso(sal);
		
	}
	
	
	//metodos 
	
	public void asignarNombre(String nom){
		
		if(nom.length() == 0){
			
			System.out.println("Error: Cadena Vacia");
			return;
		}
		nombre = nom;
		
	}
	
	public String obtenerNombre(){
		
		
		return nombre;
	}
	
	public void asignarCuenta(String cue){
		
		if(cue.length() == 0){
			
			System.out.println("Error: Cuenta no valida");
			return;
			
		}
		
		cuenta = cue;
	 }
	
	public String obtenerCuenta(){
		
		return cuenta;
	}
	
	public double estado(){
		
		return saldo;
		
	}
	
	public void ingreso(double cantidad){
		
		if (cantidad < 0 ){
			
			System.out.println("Error: Cantidad Negativa");
			return;
			
		}
		
		saldo = saldo + cantidad;
		
	}
	
    public void reingreso(double cantidad){
		
		if (cantidad < 0 ){
			
			System.out.println("Error: No dispone de saldo");
			return;
			
		}
		
		saldo = saldo - cantidad;
		
	}
	
    public void asignarTipoDeInteres(double tipo){
		
		if (tipo < 0 ){
			
			System.out.println("Error: Tipo no valido");
			return;
			
		}
		
		TipoDeInteres = tipo;
		
	}
    public Double obtenerTipoDeInteres(){
		
		return TipoDeInteres;
	}

}
