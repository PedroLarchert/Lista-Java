package exercicio2;

public class Main {

	public static void main(String[] args) {
		
		 char[] respostasGabarito = {'A', 'B', 'C', 'D', 'E', 'A', 'B', 'C', 'D', 'E', 'A', 'B', 'C', 'D', 'E'};
	        Gabarito gabarito = new Gabarito(respostasGabarito);

	      
	        Prova provaAluno = new Prova(gabarito);

	   
	        char[] respostasAluno = {'A', 'C', 'C', 'D', 'E', 'A', 'B', 'C', 'D', 'E', 'A', 'B', 'E', 'D', 'E'};

	       
	        for (char resposta : respostasAluno) {
	            provaAluno.respostaAluno(resposta);
	        }

	       
	        System.out.println("Acertos: " + provaAluno.acertos());
	        System.out.println("Nota: " + provaAluno.nota());

	}

}
