package exercicio7;

import java.util.Random;

public class SerieLimitada {
	private static final int maximoDeInstancias = 10;
	private static int contador = 0;
	private int numeroSerie;
	

	private SerieLimitada(int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	 public static SerieLimitada criarInstancia() {
	        if (contador < maximoDeInstancias) {
	            contador++;
	            return new SerieLimitada(gerarNumeroSerie());
	        } else {
	            System.out.println("Limite máximo de instâncias atingido.");
	            return null;
	        }
	    }
	 
	 private static int gerarNumeroSerie() {
		 
	        Random random = new Random();
	        return random.nextInt(90000) + 10000; 
		 	
		 }
	    
	 public int getNumeroSerie() {
	        return numeroSerie;
	    }
	 
	 public static int getTotalInstanciasCriadas() {
	        return contador;
	    }
	 
}