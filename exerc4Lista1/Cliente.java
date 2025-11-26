package exerc4Lista1;

/**
 *
 * @author PLATINADO
 */
public class Cliente {
    
    private String nome;
    private String nif;
    private String telefone;
    private Endereco endereco;

    public Cliente(String nome, String nif, String telefone, Endereco endereco) {
        this.nome = nome;
        this.nif = nif;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public void atualizarEndereco(Endereco novoEndereco){
        
        this.endereco = novoEndereco;
       
       
   }
    
    public void atualizarTelefone(String novoTelefone){
        
        this.telefone = novoTelefone;
    }
    
    
    @Override
    public String toString(){
        
        return "Nome: " + this.nome+ "Nif: " + this.nif + "Telefone: " + this.telefone + "endereco: " + this.endereco;
    }
   
    
    
    
}
