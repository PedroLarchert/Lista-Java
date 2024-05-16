package Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Professor {

	private String nome;
    private List<String> disciplinas;
    private int cargaHoraria;

    public Professor(String nome, int cargaHoraria) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
        this.cargaHoraria = cargaHoraria;
    }

    public void adicionarDisciplina(String disciplina) {
        disciplinas.add(disciplina);
    }

    public String getNome() {
        return nome;
    }

    public List<String> getDisciplinas() {
        return disciplinas;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
}
