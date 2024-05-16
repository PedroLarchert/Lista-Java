package Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	 private String nome;
	 private int idade;
	 private String turma;
	 private List<Double> notas;

	 public Aluno(String nome, int idade, String turma) {
	     this.nome = nome;
	     this.idade = idade;
	     this.turma = turma;
	     this.notas = new ArrayList<>();
	 }

	 public void adicionarNota(double nota) {
		 notas.add(nota);
	 }

	 public double calcularMedia() {
		 double soma = 0;
	     for (double nota : notas) {
         soma += nota;	 
          }
	        return notas.isEmpty() ? 0 : soma / notas.size();
	    }

	 public String getNome() {
	        return nome;
	}

	 public int getIdade() {
	        return idade;
	 }

	 public String getTurma() {
	        return turma;
	 }

	  public List<Double> getNotas() {
	        return notas;
	    }
}
