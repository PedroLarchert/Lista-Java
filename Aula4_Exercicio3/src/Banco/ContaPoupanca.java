package Banco;

import java.time.LocalDate;

public class ContaPoupanca extends Conta {
	 private double taxaRendimento;
	 private double taxaSaque;
	

	    public ContaPoupanca(int identificador, int agencia, Cliente cliente) {
	        super(identificador, agencia, cliente);
	        this.taxaSaque = 0.05; // 5%
	        this.taxaRendimento = 0.04; // 4%
	    }

	    @Override
	    public void sacar(double valor) {
	        double valorComTaxa = valor * (1 + taxaSaque);
	        this.setSaldo(this.getSaldo() - valorComTaxa);
	        this.getTransacoes().add(new Transacao(LocalDate.now(), "Saque", valor));
	    }

	    public void calcularRendimento() {
	        double rendimento = this.getSaldo() * taxaRendimento;
	        this.setSaldo(this.getSaldo() + rendimento);
	        this.getTransacoes().add(new Transacao(LocalDate.now(), "Rendimento", rendimento));
	    }
	    
}
