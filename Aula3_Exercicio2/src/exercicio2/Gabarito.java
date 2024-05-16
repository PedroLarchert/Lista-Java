package exercicio2;

public class Gabarito {
	 private char[] respostas;

	    
	    public  Gabarito(char[] respostas) {
	        this.respostas = respostas;
	    }

	    
	    public char respostaQuestao(int numeroQuestao) {
	       
	        if (numeroQuestao >= 1 && numeroQuestao <= respostas.length) {
	            return respostas[numeroQuestao - 1];
	        } else {
	           
	            return ' ';
	        }
	    }
}