package Banco;
import java.time.LocalDate;

public class ContaCorrente extends Conta {
	public ContaCorrente(int identificador, int agencia, Cliente cliente) {
        super(identificador, agencia, cliente);
    }
	
	@Override
    public void sacar(double valor) {
        this.setSaldo(this.getSaldo() - valor);
        this.getTransacoes().add(new Transacao(LocalDate.now(), "Saque", valor));
    }
}

