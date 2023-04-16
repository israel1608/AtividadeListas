package listaHomogenea;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LIstaDinamicaHomogenea {
	No primeiro, ultimo;
	int totalNos;
	ArrayList<No>listaNo = new ArrayList<No>();
	
	
	public LIstaDinamicaHomogenea() {
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

	public void inserirNoInicio(No n){
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
	
	public void inserirNoFim(No n) {
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
		No n = listaNo.get(i);
		No NoAnterior = primeiro;
		
		if(checkIfListaVazia() == false) {
			for( No atual:listaNo) {
				
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
			for( No item:listaNo) {
				valores += Integer.toString(item.valor)+"["+ Integer.toString(item.chave)+"]"+" - ";
			}
		}
		System.out.println(valores);

	}
	
	public void refatorar() {
		if( checkIfListaVazia() == false) {
			for( No item:listaNo) {
				item.chave = listaNo.indexOf(item);		
			}
		}
	}
}


