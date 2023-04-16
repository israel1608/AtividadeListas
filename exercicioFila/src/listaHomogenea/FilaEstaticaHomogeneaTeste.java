package listaHomogenea;

public class FilaEstaticaHomogeneaTeste {
	    public static void main(String[] args) {
	        FilaEstaticaHomogenea fila = new FilaEstaticaHomogenea(5);
	        
	        fila.inserir(10);
	        fila.inserir(20);
	        fila.inserir(30);
	        fila.inserir(40);
	        fila.imprimir(); // Fila: 10 20 30 40
	        
	        fila.inserir(50);
	        fila.imprimir(); // Fila: 10 20 30 40 50
	        
	        fila.inserir(60); // A fila está cheia.
	        
	        fila.remover();
	        fila.remover();
	        fila.imprimir(); // Fila: 30 40 50
	        
	    }
}
