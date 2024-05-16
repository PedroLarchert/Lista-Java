package Exercicio1;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// Criando disciplinas
        Disciplina matematica = new Disciplina("Matemática", "Segunda e Quarta, 8:00-10:00");
        Disciplina historia = new Disciplina("História", "Terça e Quinta, 10:00-12:00");

        // Criando professores
        Professor professorMatematica = new Professor("João", 20);
        professorMatematica.adicionarDisciplina("Matemática");

        Professor professorHistoria = new Professor("Maria", 15);
        professorHistoria.adicionarDisciplina("História");

        // Criando alunos
        Aluno aluno1 = new Aluno("Pedro", 15, "10A");
        aluno1.adicionarNota(8.5);
        aluno1.adicionarNota(7.0);

        Aluno aluno2 = new Aluno("Ana", 16, "10A");
        aluno2.adicionarNota(4.0);
        aluno2.adicionarNota(5.0);

        // Criando turma
        Turma turma10A = new Turma("10A");
        turma10A.adicionarAluno(aluno1);
        turma10A.adicionarAluno(aluno2);

        // Exibindo informações
        System.out.println("Turma: " + turma10A.getNome());
        System.out.println("Alunos:");
        for (Aluno aluno : turma10A.getAlunos()) {
            System.out.println("- Nome: " + aluno.getNome() + ", Média: " + aluno.calcularMedia());
        }
        
        // Exibindo reprovados
       
        List<Aluno> reprovados = turma10A.getReprovados();
        System.out.println("Alunos reprovados:");
        for (Aluno aluno : reprovados) {
            System.out.println("- " + aluno.getNome() + ", Média: " + aluno.calcularMedia());
        }
        // Exibindo aprovados
        List<Aluno> aprovados = turma10A.getAprovados();
        System.out.println("Alunos aprovados:");
        for (Aluno aluno : aprovados) {
            System.out.println("- " + aluno.getNome() + ", Média: " + aluno.calcularMedia());
        }
        
        System.out.println("Professores:");
        System.out.println("- Nome: " + professorMatematica.getNome() + ", Disciplinas: " + professorMatematica.getDisciplinas() + ", Carga Horária: " + professorMatematica.getCargaHoraria());
        System.out.println("- Nome: " + professorHistoria.getNome() + ", Disciplinas: " + professorHistoria.getDisciplinas() + ", Carga Horária: " + professorHistoria.getCargaHoraria());

        System.out.println("Disciplinas:");
        System.out.println("- Nome: " + matematica.getNome() + ", Horário: " + matematica.getHorario());
        System.out.println("- Nome: " + historia.getNome() + ", Horário: " + historia.getHorario());
    }	

}


