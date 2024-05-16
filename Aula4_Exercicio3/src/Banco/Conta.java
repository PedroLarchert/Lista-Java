package Banco;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class Conta {
	private int identificador;
    private int agencia;
    private Cliente cliente;
    private double saldo;
    private List<Transacao> transacoes;

    public Conta(int identificador, int agencia, Cliente cliente) {
        this.identificador = identificador;
        this.agencia = agencia;
        this.cliente = cliente;
        this.saldo = 0;
        this.transacoes = new ArrayList<>();
    }

    public void depositar(double valor) {
        this.saldo += valor;
        this.transacoes.add(new Transacao(LocalDate.now(), "Depósito", valor));
    }

    public void sacar(double valor) {
      
    }

    public List<Transacao> extrato(LocalDate dataInicial) {
    	List<Transacao> extrato = new ArrayList<>();
        for (Transacao transacao : this.transacoes) {
            if (transacao.getData().compareTo(dataInicial) >= 0) {
                extrato.add(transacao);
            }
        }
        return extrato;
    }

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public List<Transacao> getTransacoes() {
		return transacoes;
	}

	public void setTransacoes(List<Transacao> transacoes) {
		this.transacoes = transacoes;
	}
    
    
}
