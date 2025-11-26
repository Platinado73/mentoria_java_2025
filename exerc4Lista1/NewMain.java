package exerc4Lista1;

/**
 *
 * @author PLATINADO
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Endereco endereco = new Endereco("AV.Deolinda Rodrigues, 1000", "Kinaxixi", "Luanda", "Angola");
        Cliente cliente = new Cliente("Joao Manuel", "005000123LA044", "923000111", endereco);
        System.out.println("\t\nDADOS DO CLIENTE\n");
        
        System.out.println(cliente);
        Endereco endereco2 = new Endereco("Rua direita do Camama, 250", "Camama", "Luanda", "Angola");
        
        cliente.atualizarEndereco(endereco2);
        cliente.atualizarTelefone("930400342");
        
        System.out.println("\t\nDADOS DO CLIENTE atualizado\n");
        System.out.println(cliente);
        
        
        
        
    }
    
}
