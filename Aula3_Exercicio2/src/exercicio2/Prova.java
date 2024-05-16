package exercicio2;

public class Prova {
	 private Gabarito gabarito;
	    private char[] respostasAluno;
	    private int quantidadeQuestoesRespondidas;

	    
	    public Prova(Gabarito gabarito) {
	        this.gabarito = gabarito;
	        this.respostasAluno = new char[15]; 
	        this.quantidadeQuestoesRespondidas = 0;
	    }

	    
	    public void respostaAluno(char resposta) {
	     
	        if (quantidadeQuestoesRespondidas < 15) {
	            respostasAluno[quantidadeQuestoesRespondidas] = resposta;
	            quantidadeQuestoesRespondidas++;
	        } else {
	            System.out.println("Todas as questões já foram respondidas.");
	        }
	    }

	   
	    public int acertos() {
	        int acertos = 0;
	      
	        for (int i = 0; i < 15; i++) {
	            if (respostasAluno[i] == gabarito.respostaQuestao(i + 1)) {
	                acertos++;
	            }
	        }
	        return acertos;
	    }

	 
	    public double nota() {
	        int acertos = acertos();
	        double nota = 0;

	       
	        for (int i = 0; i < 10; i++) {
	            if (respostasAluno[i] == gabarito.respostaQuestao(i + 1)) {
	                nota += 0.5;
	            }
	        }

	       
	        for (int i = 10; i < 15; i++) {
	            if (respostasAluno[i] == gabarito.respostaQuestao(i + 1)) {
	                nota += 1;
	            }
	        }

	        return nota;
	    }
}
