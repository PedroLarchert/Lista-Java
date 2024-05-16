package exercicio1;

import java.util.HashMap;
import java.util.Map;

public class registroNotas {
   
    static private Map<String, Double> notas;

    public registroNotas() {
        this.notas = new HashMap<>();
    }

    
    public void setNota(int matriculaAluno, int codigoTurma, double nota) {
        String chave = gerarChave(matriculaAluno, codigoTurma);
        notas.put(chave, nota);
    }

   
    public Double getNota(int matriculaAluno, int codigoTurma) {
        String chave = gerarChave(matriculaAluno, codigoTurma);
        return notas.get(chave);
    }
   
  
    private static String gerarChave(int matriculaAluno, int codigoTurma) {
        return matriculaAluno + "_" + codigoTurma;
    }

    public void removeNota(int matriculaAluno, int codigoTurma) {
        String chave = gerarChave(matriculaAluno, codigoTurma);
        notas.remove(chave);
    }

    
    public void atualizarNota(int matriculaAluno, int codigoTurma, double novaNota) {
        String chave = gerarChave(matriculaAluno, codigoTurma);
        notas.put(chave, novaNota);
    }
    
    public static void exibirNota(int matriculaAluno, int codigoTurma) {
        String chave = gerarChave(matriculaAluno, codigoTurma);
        System.out.println(notas.get(chave));
    }
   
}