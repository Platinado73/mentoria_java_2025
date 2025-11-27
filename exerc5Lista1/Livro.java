package exerc5Lista1;

/**
 *
 * @author PLATINADO
 */
public class Livro {
    
    private String titulo;
    private String autor;
    private int ano;
    private Categoria categoria;

    public Livro(String titulo, String autor, int ano, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }


public void alterarCategoria(Categoria novaCategoria){
    
    this.categoria = novaCategoria;
}


    @Override
    public String toString(){
        
        return " Título: " + this.titulo + " Autor: " + this.autor + " Categoria: " + this.categoria + " Ano: " + this.ano;
    }
    
}
