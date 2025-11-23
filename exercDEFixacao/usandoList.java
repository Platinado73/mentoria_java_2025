
import java.util.*;

public class usandoList{



	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("PAULO");
		list.add("ABILIO");
		list.add("FERNANDES");
		list.add("JOSÉ");
		list.add(2, "MARAVILHA");

		System.out.println("tamanho da lista: " + list.size());

		System.out.println("A lista antes de remover: ");

		for(String lista : list) {

			System.out.println(lista);	


		}

		System.out.println("removendo um número da lista usando o nome do elemeto: ");
		list.remove("JOSÉ");

		for(String lista : list) {

			System.out.println(lista);	


		}

		System.out.println("\nremovendo um número da lista usando o indíce da lista: ");
		list.remove(0);

		for(String lista : list) {

			System.out.println("\t" + lista);	


		}
		
		
		System.out.println("\nprocurando o indíce de um elemento pelo seu nome: " + list.indexOf("FERNANDES"));
		System.out.println("\nprocurando o indíce de um elemento pelo seu nome, sabendo que não consta da lista: " + list.indexOf("TEC"));
		
		
		



		
		
		
		
		

	}

}
