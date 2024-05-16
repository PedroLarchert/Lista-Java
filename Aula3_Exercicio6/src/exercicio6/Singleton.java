package exercicio6;

public class Singleton {
	private static Singleton unicaInstancia;
	
	
	private Singleton() {
		
	}
	
	 public static Singleton getInstance() {
		 if(unicaInstancia == null) {
			 unicaInstancia = new Singleton();
		 }
		 
		 return unicaInstancia;
	 }
}
