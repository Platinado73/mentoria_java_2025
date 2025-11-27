package exerc5Lista1;

/**
 *
 * @author PLATINADO
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Categoria categoria1 = new Categoria("Tecnologia", "Livros técnicos e cientificos na área de TI e Engenharia");
        Categoria categoria2 = new Categoria("Gestão", "Livros de Administração, gestão de pessoas e negócios ");
        
        Livro livro = new Livro("Introdução a Bancos de Dados ","Sillberschatz", 2011, categoria1 );
        System.out.println("\n\tANTES DA ALTERAÇAO\n\t ");
        System.out.println(livro);
        System.out.println("\n\tDepois DA ALTERAÇAO\n\t ");
        livro.alterarCategoria(categoria2);
        System.out.println(livro);
        
        
    }
    
}
