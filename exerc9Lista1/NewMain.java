package exerc9Lista1;

import java.util.ArrayList;

/**
 *
 * @author PLATINADO
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaPoupanca poupa = new ContaPoupanca( 0.02 ,"CP-001" , "Ana Paula",200000.0 );
        ContaSalario salar = new ContaSalario("Empresa ABC","CS-001","Rui Manuel" ,100000.0 );
        
        poupa.depositar(50000.0 );
        salar.sacar(30000.0 );
        
        
        System.out.println("\t\nAplicar juros na Conta Poupança...");
        double saldoAntes = poupa.getSaldo();
        poupa.aplicarJuros();
        double saldoDepois = poupa.getSaldo();

        System.out.println("\tSaldo antes dos juros: " + saldoAntes);
        System.out.println("\tSaldo depois dos juros: " + saldoDepois + "\n");

       
        ArrayList<Conta> contas = new ArrayList<>();
        contas.add(poupa);
        contas.add(salar);

        
        System.out.println("\n\t=== DADOS das CONTAS ===\n\t");
        for (Conta c : contas) {
            System.out.println("Tipo: " + c.getClass().getSimpleName() + " (É UMA Conta)");
            System.out.println("Número: " + c.getNumero());
            System.out.println("Titular: " + c.getTitular());
            System.out.println("Saldo final: " + c.getSaldo());
            System.out.println("----------------------------------");
        }
    }
        
        
    }
    

