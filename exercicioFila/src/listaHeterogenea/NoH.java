package listaHeterogenea;


public class NoH {
	Object valor;
    NoH proximo;
    int chave;
	
    	public NoH(int v) {
            this.valor = v;
            this.proximo = null;
        }
        
        public NoH(String v) {
            this.valor = v;
            this.proximo = null;
        }
        
        public NoH(Double v) {
            this.valor = v;
            this.proximo = null;
        }
	}

