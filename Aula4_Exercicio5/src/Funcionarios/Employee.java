package Funcionarios;

public class Employee {
	
	protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public double getPay() {
        return 0.0; 
    }

    public void printPay() {
        System.out.println("Nome: " + name + ", Pagamento: $" + getPay());
    }
}

