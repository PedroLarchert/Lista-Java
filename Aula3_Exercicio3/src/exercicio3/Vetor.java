package exercicio3;

public class Vetor {
    private String[] elementos;
    private int tamanho;

   
    public Vetor(int tamanhoInicial) {
        this.elementos = new String[tamanhoInicial];
        this.tamanho = 0;
    }

  
    public void insert(String elemento) {
        if (tamanho == elementos.length) {
            redimensionar();
        }
        elementos[tamanho] = elemento;
        System.out.println("inserido");
        tamanho++;
    }

   
    private void redimensionar() {
    	System.out.println("redimensionado");
        int novoTamanho = elementos.length * 2; 
        String[] novoArray = new String[novoTamanho];
     
        for (int i = 0; i < tamanho; i++) {
            novoArray[i] = elementos[i];
        }
        elementos = novoArray;
    }

   
    public String get(int posicao) {
        if (posicao >= 0 && posicao < tamanho) {
            return elementos[posicao];
        } else {
            return null;
        }
    }

   
    public int size() {
        return tamanho;
    }
}