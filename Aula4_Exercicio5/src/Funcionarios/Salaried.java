package Funcionarios;

public class Salaried extends Employee {
    private double salary;

    public Salaried(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double getPay() {
        return salary;
    }

    public void insertData() {
       
    }
}

