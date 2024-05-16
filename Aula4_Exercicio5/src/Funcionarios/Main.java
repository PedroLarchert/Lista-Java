package Funcionarios;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        ArrayList<Employee> employees = new ArrayList<>();

	        while (true) {
	            System.out.println("Escolha o tipo de empregado:");
	            System.out.println("1. Assalariado (Salaried)");
	            System.out.println("2. Horista (Hourly)");
	            System.out.println("3. Calcular folha de pagamento");
	            System.out.print("Opção: ");
	            int option = scanner.nextInt();

	            if (option == 1) {
	                System.out.print("Digite o nome do empregado assalariado: ");
	                String name = scanner.next();
	                System.out.print("Digite o salário mensal: ");
	                double salary = scanner.nextDouble();
	                employees.add(new Salaried(name, salary));
	            } else if (option == 2) {
	                System.out.print("Digite o nome do empregado horista: ");
	                String name = scanner.next();
	                System.out.print("Digite a taxa por hora: ");
	                double rate = scanner.nextDouble();
	                System.out.print("Digite as horas trabalahdas: ");
	                int hours = scanner.nextInt();
	                employees.add(new Hourly(name, rate, hours));
	            } else if (option == 3) {
	            	 System.out.println("_____________________________________________________________" );
	                System.out.println("Folha de Pagamento:");
	                double totalPay = 0.0;
	                for (Employee emp : employees) {
	                    emp.printPay();
	                    totalPay += emp.getPay();
	                }
	                System.out.println("Gasto total da empresa: $" + totalPay);
	                System.out.println("_____________________________________________________________" );
	            } else {
	                System.out.println("Opção inválida. Tente novamente.");
	            }
	        }
	    }

	}


