package exercicio1;

public class ContaBancaria {
    private  String titular;
    private  float saldo;
    private  int numconta;

    public ContaBancaria(int numconta, String titular, float saldo) {
        this.numconta = numconta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public ContaBancaria(){
    	 numconta = 0000000;
         titular = "vazio";
         saldo = 0;
     }

    

     public void saque( float valor){

       this.saldo -= valor;
        exibirInfo();
    }

     public void deposito(float valor){

        this.saldo += valor;
        exibirInfo();
    }

    public  void exibirInfo(){
        System.out.println("titular: "+titular);
        System.out.println("conta numero: "+numconta);
        System.out.println( "o saldo atual da conta é :"+saldo);
        System.out.println( "_____________________________________________");
    }
    public static void main(String[] args) {

        ContaBancaria minhaConta = new ContaBancaria(33333333, "Pedro Vitório", 11.5f);
        ContaBancaria contaDefault = new ContaBancaria();
        minhaConta.deposito(25.75f);
        minhaConta.saque(17.24f);
        contaDefault.exibirInfo();
       
        


    }
}
