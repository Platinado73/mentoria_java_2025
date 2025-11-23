import java.util.*;

public class exercMatriz {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Insira um número qualquer positivo: ");
		int n = input.nextInt();
		input.nextLine();

		int[][] matriz = new int[n][n];

		System.out.println("insira " + (n * n) + " numeros na matriz ");

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("\t LINHA: " + (i + 1) + " COLUNA: " + (j + 1));
				matriz[i][j] = input.nextInt();
				input.nextLine();

			}

		}

		System.out.print("\t --------------DIAGONAL DA MATRIZ É--------\n ");

		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");

		}

		int count = 0;

		System.out.println("\n\t OS NÚMEROS NEGATIVOS SÃO: ");

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				if (matriz[i][j] < 0) {

					count += 1;

				}

			}

		}

		System.out.println(count);

		input.close();

	}

}
