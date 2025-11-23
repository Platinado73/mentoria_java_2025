package exerc1Lista1;

public class main {

	public static void main(String[] args) {
		
		ContaTelefonica conta = new ContaTelefonica( "923456789", "pós-pago", 5000,0, 10000.0,5.0 ); 
		
		conta.registarConsumoDados(2000);
		conta.registarConsumoDados(1500);
		conta.registarConsumoDados(2500);
                
                int totalConsumido = conta.getDadosConsumidoMB();
                double pagar = conta.calcularValorApagar();
                int exced = conta.calcularExcedenteMB();
                
                
                System.out.println("\tCONTA TELEFONICA\n");
                System.out.println("NUMERO: " + conta.getNumero());
                System.out.println("\nPlano: " + conta.getPlano());
                System.out.println("\nTOTAL CONSUMIDO: " + totalConsumido);
                System.out.println("\ntotal a pagar: " + pagar + "KZS");
                System.out.println("\nExcedente: " + exced + "MB");
                
		

		
		

	}
}

