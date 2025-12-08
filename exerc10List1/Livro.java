package exerc10List1;

/**
 *
 * @author PLATINADO
 */
public class Livro {
    
    private String titulo;
    private String isbn;
    private int anoPublicacao;
    private int exemplaresTotais;
    private int exemplaresDisponiveis;

    public Livro(String titulo, String isbn, int anoPublicacao, int exemplaresTotais, int exemplaresDisponiveis) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
        this.exemplaresTotais = exemplaresTotais;
        this.exemplaresDisponiveis = exemplaresDisponiveis;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getExemplaresTotais() {
        return exemplaresTotais;
    }

    

    public int getExemplaresDisponiveis() {
        return exemplaresDisponiveis;
    }

   
    
   public boolean baixarExemplar(){
      if(exemplaresDisponiveis > 0){
          this.exemplaresDisponiveis --;
          return true;
      } 
      System.out.println("Não há exemplares disponíveis!");
        return false;
   } 
   
   
   public void disponibilizarExemplar(){
       if(exemplaresDisponiveis < exemplaresTotais){
           
           exemplaresDisponiveis ++;
       }else{
            System.out.println("Todos os exemplares já estão disponíveis.");
       }
   }
    
    
}
