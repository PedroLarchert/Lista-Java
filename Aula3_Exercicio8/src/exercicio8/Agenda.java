package exercicio8;

public class Agenda {
	

	    public static void main(String[] args) {
	       
	        Compromisso compromisso1 = new Compromisso(Mes.JANEIRO, "Aniversário");
	        Compromisso compromisso2 = new Compromisso(Mes.FEVEREIRO, "Reunião de trabalho");
	        Compromisso compromisso3 = new Compromisso(Mes.MARCO, "Consulta médica");

	       
	        System.out.println("Compromissos:");
	        exibirCompromisso(compromisso1);
	        exibirCompromisso(compromisso2);
	        exibirCompromisso(compromisso3);
	    }

	  
	    public static void exibirCompromisso(Compromisso compromisso) {
	        System.out.println(compromisso.getMes().getDescricao()+ ": " + compromisso.getDescricao());
	    }
	}