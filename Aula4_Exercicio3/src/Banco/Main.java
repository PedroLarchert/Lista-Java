package Banco;
import java.time.LocalDate;
public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("12345678900", "João", LocalDate.of(1990, 5, 20));

	       
	    ContaCorrente contaCorrente = new ContaCorrente(1, 1234, cliente);

	      
	     contaCorrente.depositar(1000);

	      
	     contaCorrente.sacar(500);

	       
	     System.out.println("Extrato da conta corrente:");
	     for (Transacao transacao : contaCorrente.extrato(LocalDate.of(2024,05,11))) {
	     System.out.println(transacao.getTipo() + " - Valor: " + transacao.getValor() + " - Data: " + transacao.getData());
	        }

	       
	        ContaPoupanca contaPoupanca = new ContaPoupanca(2, 1234, cliente);

	       
	        contaPoupanca.depositar(2000);

	        
	        contaPoupanca.sacar(100);

	        
	        contaPoupanca.calcularRendimento();

	        System.out.println("\nExtrato da conta poupança:");
	        for (Transacao transacao : contaPoupanca.extrato(LocalDate.of(2024, 5, 1))) {
	            System.out.println(transacao.getTipo() + " - Valor: " + transacao.getValor() + " - Data: " + transacao.getData());
	        }
		
	}	 
}


