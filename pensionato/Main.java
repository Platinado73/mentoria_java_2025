package pensionato;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        System.out.print("insira a quantidade de estudantes que irão alugar quartos(1-10): ");

        int n = input.nextInt();
        input.nextLine();

        Estudante[] quarto = new Estudante[10];

        System.out.println("\nfaça o aluguel de quartos ");

        for (int i = 1; i <= n; i++) {           

            System.out.print("nome: ");
            String nome = input.nextLine();
            System.out.print("email: ");
            String email = input.nextLine();
            System.out.print("quarto: ");
            int quart = input.nextInt();

            quarto[quart] = new Estudante(nome, email);
            
            input.nextLine();

        }

        System.out.println("\tRELATORIO DE QUARTOS OCUPADOS: ");
        for (int i = 0; i < quarto.length; i++) {

            if (quarto[i] != null) {

                System.out.println(i + ": " + quarto[i]);

            }
        }

        input.close();

		

	}

}
