package listaHeterogenea;

public class FilaEstaticaTeste {
	    public static void main(String[] args) {
	        FilaEstatica fila = new FilaEstatica(5);
	        
	        fila.inserir("primeiro");
	        fila.inserir(20.9);
	        fila.inserir(30);
	        fila.inserir(40);
	        fila.imprimir(); // Fila: primeiro 20.9 30 40
	        
	        fila.inserir("ultimo");
	        fila.imprimir(); // Fila: primeiro 20.9 30 40 ultimo
	        
	        fila.inserir("mais um"); // A fila está cheia.
	        fila.remover();
	        fila.imprimir(); // Fila: 20.9 30 40 ultimo
	
	    }
}
