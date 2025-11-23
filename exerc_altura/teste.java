package exerc_altura;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		
		
		 Scanner input = new Scanner(System.in);

	        System.out.println("insira o numero de pessoas: ");

	        int n = input.nextInt();

	        input.nextLine();

	        Pessoa[] pes = new Pessoa[n];

	        for (int i = 0; i < n; i++) {

	            System.out.printf("\ndados da " + i+1 + "pessoa");
	            System.out.print("insira o nome: ");
	            String nome = input.nextLine();
	            System.out.print("insira a idade: ");
	            int idade = input.nextInt();
	            System.out.print("insira a altura: ");
	            float altura = input.nextFloat();
	            input.nextLine();

	            pes[i] = new Pessoa(nome, idade, altura);

	        }

	        System.out.println("\t dados obtidos");

	        for (int i = 0; i < n; i++) {

	            System.out.print(pes[i]);

	        }
	        
	        input.close();


	}

}
