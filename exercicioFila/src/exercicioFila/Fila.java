package exercicioFila;

public class Fila {
    
    private int[] elementos;
    private int primeiraPosicao;
    private int ultimaPosicao;
    private int tamanho;
    
    public Fila(int capacidade) {
        this.elementos = new int[capacidade];
        this.primeiraPosicao = 0;
        this.ultimaPosicao = -1;
        this.tamanho = 0;
    }
    
    public void inserir(int elemento) {
        if (estaCheia()) {
            System.out.println("A fila esta cheia.");
            return;
        }
        
        this.ultimaPosicao++;
        this.elementos[this.ultimaPosicao] = elemento;
        this.tamanho++;
    }
    
    public int remover() {
        if (estaVazia()) {
            System.out.println("A fila esta vazia.");
            return -1;
        }
        
        int elementoRemovido = this.elementos[this.primeiraPosicao];
        this.primeiraPosicao++;
        this.tamanho--;
        return elementoRemovido;
    }
    
    public void imprimir() {
        if (estaVazia()) {
            System.out.println("A fila esta vazia.");
            return;
        }
        
        System.out.print("Fila: ");
        for (int i = this.primeiraPosicao; i <= this.ultimaPosicao; i++) {
            System.out.print(this.elementos[i] + " ");
        }
        System.out.println();
    }
    
    private boolean estaCheia() {
        return this.tamanho == this.elementos.length;
    }
    
    private boolean estaVazia() {
        return this.tamanho == 0;
    }
}
