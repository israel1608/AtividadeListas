package listaHeterogenea;
	import java.lang.reflect.Array;
	import java.util.ArrayList;
	
public class ListaDinamicaHeterogenea {

		NoH primeiro, ultimo;
		int totalNos;
		ArrayList<NoH>listaNo = new ArrayList<NoH>();
		
		
		public ListaDinamicaHeterogenea() {
			this.primeiro = this.ultimo = null;
			this.totalNos = 0;
		}
		
		public int getTotalNos() {
			return this.totalNos;
		}
		
		public boolean checkIfListaVazia() {
			if(getTotalNos() == 0) {
				return true;
			}
			return false;
		}

		public void inserirNoInicio(NoH n){
			if ( checkIfListaVazia() ) {
				primeiro = ultimo = n;
				primeiro.chave = 0;
				listaNo.add(n);
			}else {
				n.proximo = primeiro;
				primeiro = n;
				listaNo.add(0,n);
				refatorar();
				n.chave = listaNo.indexOf(n);			
			}
			totalNos++;
		}
		
		public void inserirNoFim(NoH n) {
			if(checkIfListaVazia()) {
				primeiro = ultimo = n;
				primeiro.chave = 0;
				listaNo.add(n);
			}else {
				ultimo.proximo = n;
				ultimo = n;
				listaNo.add(n);
				n.chave = listaNo.indexOf(n);
				
			}
			totalNos++;
		}
		
		public void excluirNo(int i) {
			NoH n = listaNo.get(i);
			NoH NoAnterior = primeiro;
			
			if(checkIfListaVazia() == false) {
				for( NoH atual:listaNo) {
					
					if(atual.valor == n.valor) {
						
						if(getTotalNos() == 1) {
							primeiro = ultimo = null;
						}else{
							if(atual == primeiro) {
								primeiro = atual.proximo;							
							}else {
								NoAnterior.proximo = atual.proximo;
							}
						}
						totalNos--;		
						listaNo.remove(n);
						refatorar();
						return;
					}
					NoAnterior = atual;
				}
				
			}
		}
		
		public void exibirLista() {

			String valores = "";
			if( checkIfListaVazia() == false) {	
				for( NoH item:listaNo) {
					valores += item.valor.toString() + "[" + Integer.toString(item.chave) + "] - ";

				}
			}
			System.out.println(valores);

		}
		
		public void refatorar() {
			if( checkIfListaVazia() == false) {
				for( NoH item:listaNo) {
					item.chave = listaNo.indexOf(item);		
				}
			}
		}
	
}
