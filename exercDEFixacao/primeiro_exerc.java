import java.util.Scanner;


public class primeiro_exerc {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);

	        System.out.print("insira um numero positivo de 1-10: ");
	        int N = input.nextInt();

	        int[] vect = new int[N];

	        if (N < 0) {

	            System.out.println("\tnumero invalido");
	        } else if (N > 10) {
	            System.out.println("\tnumero invalido");
	        } else {
	            System.out.print("\tinsira " + N + "numeros\n ");

	            for (int i = 0; i < N; i++) {

	                System.out.print(" numero:");

	                vect[i] = input.nextInt();

	            }

	            System.out.println("os numeros negativos sao: ");

	            for (int i = 0; i < N; i++) {

	                if (vect[i] < 0) {

	                    System.out.println(vect[i]);
	                }
	            }
	            input.close();
	        }


	}

}
