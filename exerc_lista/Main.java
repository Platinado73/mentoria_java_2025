package exerc_lista;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(" indica o número de funcionários: ");
		int n = input.nextInt();

		input.nextLine();

		ArrayList<Funcionario> lista = new ArrayList<>();

		System.out.println("INSIRA OS DADOS: ");

		for (int i = 0; i < n; i++) {
			
			

			System.out.println("Funcionário #" + (i + 1) + ":");

			System.out.print("id: ");
			int id = input.nextInt();
			input.nextLine();

			boolean existe = false;

			for (Funcionario f : lista) {
				if (f.getId() == id) {

					existe = true;
					break;
				}
			}

			if (existe) {

				System.out.println("ID Já existe. Digite outro");
				i--;
				continue;
			}

			System.out.print("Nome: ");
			String nome = input.nextLine();

			System.out.print("Salário: ");
			double salario = input.nextDouble();
			input.nextLine();

			lista.add(new Funcionario(nome, id, salario));

		}
		
		System.out.print("id do funcionário que irá receber o aumento:");
		int idAumento = input.nextInt();
		input.nextLine();
		Funcionario acharFuncionar = null;
		for(Funcionario f : lista) {
			
			if(f.getId() == idAumento) {
				
				acharFuncionar = f;
				break;
			}
		}
		
		if(acharFuncionar == null) {
			
			System.out.println("este id não existe!");
		}else {
			
			System.out.print("indica a percentagem de aumento ");
			double pct = input.nextDouble();
			input.nextLine();
			
			acharFuncionar.aumentarSalario(pct);
			
		}
		
		System.out.println();
		System.out.println("Lista de Funconários atualizada: ");
		for(Funcionario f : lista) {
			
			System.out.println(f);
		}
		System.out.println(false);

		input.close();

	}

}
