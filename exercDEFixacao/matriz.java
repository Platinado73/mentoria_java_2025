
import java.util.*;

public class matriz {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("insira o  número de linhas: ");

		int m = input.nextInt();
		input.nextLine();

		System.out.print("insira o  número de colunas: ");

		int n = input.nextInt();
		input.nextLine();

		int[][] matriz = new int[m][n];

		System.out.println("\t insira" + (m * n) + "elementos na matriz: ");

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				System.out.print("\t LINHA: " + (i + 1) + " COLUNA: " + (j + 1));
				matriz[i][j] = input.nextInt();
				input.nextLine();

			}

		}

		System.out.print(" insira um número qualquer que esteja dentro da matriz: ");

		int x = input.nextInt();
		input.nextLine();

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				if (matriz[i][j] == x) {

					System.out.println(x + "  está na posição" + i + "," + j + " dentro da matriz");

					if (j > 0)
						System.out.println("  esquerda" + matriz[i][j - 1]);
					if (i > 0)
						System.out.println("  acima" + matriz[i-1][j]);
					if (j < n - 1)
						System.out.println("  direita" + matriz[i][j + 1]);
					if (i < m - 1)
						System.out.println("  baixo" + matriz[i + 1][j]);

				}

			}

		}

		input.close();
	}

}
