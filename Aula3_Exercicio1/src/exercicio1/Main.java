package exercicio1;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class Main {
	
	 
	public static void main(String[] args) throws IOException, InterruptedException  {
		
		
		ArrayList<Aluno> listadealuno = new ArrayList<Aluno>();
		ArrayList<Turma> listadeturmas = new ArrayList<Turma>();
		
		boolean cont = true;
		
		while(cont) {
			
			System.out.println("                      Menu");
			System.out.println("Digite 1- para Registrar um aluno\n"
					+ "       2- para registrar uma turma\n"
					+ "       3- para registar um dia-aula\n"
					+ "       4- para registar uma nota\n"
					+ "       5- para registrar uma frequencia\n"
					+ "       6- para identificar alunos presentes em uma aula\n"
					+ "       7- para mostrar presenca em aula\n"
					+ "       8- para mostrar nota do aluno na turma\n"
					+ "       9- para listar alunos inscritos em uma turma\n"
					+ "       10- para listar turmas\n"
					+ "       11- para listar o total de faltas e presensas por aluno para uma turma\n"
					+ "       12- para listtar notas por aluno para uma turma\n"
					+ "       0- para sair do sistema");
			
			Scanner scan = new Scanner(System.in);
		    int opcao = scan.nextInt();
		    Scanner entrada = new Scanner(System.in);
			
		switch(opcao) {
		case 1:
			Aluno novoaluno = new Aluno();
			System.out.println("digite o nome: ");
			novoaluno.setNome(entrada.nextLine());
			System.out.println("digite a data de nascimento: ");
			novoaluno.setDataNasc(entrada.nextLine());
			System.out.println("digite a matricula do aluno: ");
			novoaluno.setMatricula(entrada.nextInt());
			novoaluno.exibirAluno();
			listadealuno.add(novoaluno);
				
			break;
			
		case 2:
			Turma novaturma = new Turma();
			System.out.println("digite o nome da disciplina: ");
			novaturma.setDisciplina(entrada.nextLine());
			System.out.println("digite o código da Turma: ");
			novaturma.setCodigo(entrada.nextInt());
			listadeturmas.add(novaturma);
			novaturma.exibirturma();
			break;
			
		case 3:
			
			System.out.println("digite o codigo da turma");
			int codigoProcurado = entrada.nextInt(); 
			entrada.nextLine();
			 
			 Turma turmaEncontrada = null;
		        for (Turma turma : listadeturmas) {
		            if (turma.getCodigo() == codigoProcurado) {
		                turmaEncontrada = turma;
		                break; 
		            }
		        }

		      
		        if (turmaEncontrada != null) {
		        	DiasAula novodiaaula= new DiasAula();
		            System.out.println("Turma encontrada");
		        	novodiaaula.setTurma(turmaEncontrada);
					System.out.println("digite a data da aula");
					novodiaaula.setData(entrada.nextLine());
					System.out.println("digite o horario da aula");
					novodiaaula.setHorario(entrada.nextLine());
		            novodiaaula.exibirDia();
		        } else {
		            System.out.println("Turma não encontrada!!!!!!!!!!!!!!!!.");
		        }
			break;
			
		case 4:
			
			System.out.println("digite a matricula do aluno para adicionar a nota");
			int matriculaprocurada = entrada.nextInt(); 
			entrada.nextLine();
			
			 Aluno matriculaencontrada = null;
		        for (Aluno aluno : listadealuno) {
		            if (aluno.getMatricula() == matriculaprocurada) {
		            	matriculaencontrada = aluno;
		                break; 
		            }
		        }

		        if (matriculaencontrada != null) {
		        	
		            System.out.println("aluno encontrado");
		            
		            System.out.println("digite o codigo da turma que o aluno irá receber a nota");
					codigoProcurado = entrada.nextInt(); 
					entrada.nextLine();
					
					turmaEncontrada = null;
					  
					  for (Turma turma : listadeturmas) {
				            if (turma.getCodigo() == codigoProcurado) {
				                turmaEncontrada = turma;
				                break; 
				            }
				        }

				      
				        if (turmaEncontrada != null) {

				            System.out.println("Turma encontrada");
				            
				            System.out.println("digite a nota do aluno "+matriculaencontrada.getNome()+" na turma: "+turmaEncontrada.getCodigo());
				            double value = entrada.nextDouble();
				            registroNotas nota = new registroNotas();
				            nota.setNota(matriculaencontrada.getMatricula(), turmaEncontrada.getCodigo(), value);  
				            System.out.println("______________________________________________________________________________________");
				            System.out.println("A nota do aluno "+matriculaencontrada.getNome()+" na turma "+turmaEncontrada.getCodigo()+" é : "+nota.getNota(matriculaencontrada.getMatricula(), turmaEncontrada.getCodigo()));
				            System.out.println("______________________________________________________________________________________");
				        } else {
				        	
				            System.out.println("Turma não encontrada!!!!!!!!!!!!!!!!.");
				        }
		     
		        } else {
		            System.out.println("aluno não encontrada!!!!!!!!!!!!!!!!.");
		        }        
		        
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			System.out.println("digite a matricula do aluno ");
			 matriculaprocurada = entrada.nextInt(); 
			entrada.nextLine();
			
			  matriculaencontrada = null;
		        for (Aluno aluno : listadealuno) {
		            if (aluno.getMatricula() == matriculaprocurada) {
		            	matriculaencontrada = aluno;
		                break; 
		            }
		        }

		        if (matriculaencontrada != null) {
		        	
		            System.out.println("aluno encontrado");
		            
		            System.out.println("digite o codigo da turma que o aluno recebeu a nota");
					codigoProcurado = entrada.nextInt(); 
					entrada.nextLine();
					
					turmaEncontrada = null;
					  
					  for (Turma turma : listadeturmas) {
				            if (turma.getCodigo() == codigoProcurado) {
				                turmaEncontrada = turma;
				                break; 
				            }
				        }

				      
				        if (turmaEncontrada != null) {

				            System.out.println("Turma encontrada");
				            
				            System.out.println("______________________________________________________________________________________");
				            System.out.print("A nota do aluno "+matriculaencontrada.getNome()+" na turma "+turmaEncontrada.getCodigo()+" é : ");
				            registroNotas.exibirNota(matriculaencontrada.getMatricula(),turmaEncontrada.getCodigo() );
				            System.out.println("______________________________________________________________________________________");
				        } else {
				        	
				            System.out.println("Turma não encontrada!!!!!!!!!!!!!!!!.");
				        }
		     
		        } else {
		            System.out.println("aluno não encontrada!!!!!!!!!!!!!!!!.");
		        }        
			break;
		case 9:
			break;
		case 10:
			break;
		case 11:
			break;
		case 12:
			break;
		case 0:
			cont = false;
			System.out.println("PROGRAMA FECHADO ");
			break;
			
		}
	
		
		
		}
	}

}
