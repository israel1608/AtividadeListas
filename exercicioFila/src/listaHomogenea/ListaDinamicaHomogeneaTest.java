package listaHomogenea;

public class ListaDinamicaHomogeneaTest {
	public static void main(String[] Args) {
		LIstaDinamicaHomogenea listaSimples1 = new LIstaDinamicaHomogenea();
		
//		listaSimples1.inserirNoInicio(new No(22));
		listaSimples1.inserirNoFim(new No(2));
		listaSimples1.inserirNoFim(new No(3));
//		listaSimples1.inserirNoInicio(new No(55));
//		listaSimples1.inserirNoInicio(new No(56));
		//
		listaSimples1.inserirNoFim(new No(100));
		listaSimples1.inserirNoFim(new No(50));
		//listaSimples1.inserirNoInicio(new No(24));
		listaSimples1.inserirNoFim(new No(51));
		listaSimples1.excluirNo(0);
		listaSimples1.inserirNoInicio(new No(25));
		//listaSimples1.inserirNoInicio(new No(26));

		listaSimples1.exibirLista();
			
	}
}
