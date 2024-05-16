package Exercicio1;

import java.util.List;
import java.util.ArrayList;

public class Turma {
	
	private String nome;
    private List<Aluno> alunos;

    public Turma(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public String getNome() {
        return nome;
    }
    
    public List<Aluno> getAprovados() {
        List<Aluno> aprovados = new ArrayList<>();
        for (Aluno aluno : alunos) {
            if (aluno.calcularMedia() >= 5) {
                aprovados.add(aluno);
            }
        }
        return aprovados;
    }

    public List<Aluno> getReprovados() {
        List<Aluno> reprovados = new ArrayList<>();
        for (Aluno aluno : alunos) {
            if (aluno.calcularMedia() < 5) {
                reprovados.add(aluno);
            }
        }
        return reprovados;
    }
}

