package Funcionarios;
import java.util.Scanner;

public class Hourly  extends Employee {
		    private double hourlyRate;
		    private double hours;

		    public Hourly(String name, double rate, int hours) {
		        super(name);
		        this.hourlyRate = rate;
		        this.hours = hours;
		    }

		    @Override
		    public double getPay() {
		        return hourlyRate * hours;
		    }

		    public void addHours(double hours) {
		        this.hours += hours;
		    }

		    public void insertData() {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Digite o número de horas trabalhadas: ");
		        double hoursWorked = scanner.nextDouble();
		        addHours(hoursWorked);
		    }
}

