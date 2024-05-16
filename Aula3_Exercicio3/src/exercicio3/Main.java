package exercicio3;

public class Main {

	public static void main(String[] args) {
		 Vetor vetor = new Vetor(1);

	        
	        vetor.insert("Elemento 1");
	        vetor.insert("Elemento 2");
	        vetor.insert("Elemento 3");

	        
	        System.out.println("Tamanho do vetor: " + vetor.size());
	        
	        for (int i = 0; i < vetor.size(); i++) {
	            System.out.println("Elemento na posição " + i + ": " + vetor.get(i));
	        }

	}

}
