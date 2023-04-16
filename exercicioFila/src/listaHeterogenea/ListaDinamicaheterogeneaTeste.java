package listaHeterogenea;

import listaHomogenea.LIstaDinamicaHomogenea;
import listaHomogenea.No;

public class ListaDinamicaheterogeneaTeste {
	public static void main(String[] Args) {
		ListaDinamicaHeterogenea listaSimples1 = new ListaDinamicaHeterogenea();
		
//		listaSimples1.inserirNoInicio(new No(22));
		listaSimples1.inserirNoFim(new NoH("primeiro"));
		listaSimples1.inserirNoFim(new NoH(3.1));
//		listaSimples1.inserirNoInicio(new No(55));
//		listaSimples1.inserirNoInicio(new No(56));
		//
		listaSimples1.inserirNoFim(new NoH(100));
		listaSimples1.inserirNoFim(new NoH(50.25));
		//listaSimples1.inserirNoInicio(new No(24));
		listaSimples1.inserirNoFim(new NoH(51));
		listaSimples1.excluirNo(1);
		listaSimples1.inserirNoInicio(new NoH(25));
		//listaSimples1.inserirNoInicio(new No(26));

		listaSimples1.exibirLista();
			
	}
}
