package exercicioFila;

public class teste {

	    public static void main(String[] args) {
	        Fila fila = new Fila(5);
	        
	        fila.inserir(10);
	        fila.inserir(20);
	        fila.inserir(30);
	        fila.inserir(40);
	        fila.imprimir(); // Fila: 10 20 30 40
	        
	        fila.inserir(50);
	        fila.imprimir(); // Fila: 10 20 30 40 50
	        
	        fila.inserir(60); // A fila esta cheia.
	        
	        fila.remover();
	        fila.remover();
	        fila.imprimir(); // Fila: 30 40 50
	        
	        fila.remover();
	        fila.remover();
	        fila.remover();
	        fila.imprimir(); // A fila esta vazia.

	    }
}
