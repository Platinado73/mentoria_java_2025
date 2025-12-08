package exerc10List1;

/**
 *
 * @author PLATINADO
 */
public class Aluno {
    
    private String nome;
    private String numeroEstudante;
    private String curso;

    public Aluno(String nome, String numeroEstudante, String curso) {
        this.nome = nome;
        this.numeroEstudante = numeroEstudante;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroEstudante() {
        return numeroEstudante;
    }

    public void setNumeroEstudante(String numeroEstudante) {
        this.numeroEstudante = numeroEstudante;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    private int livrosAtuais = 0;
    
    private static final int LIMITE_EMPRESTIMOS = 3;
    
    public boolean podeEmprestar(){
        
        return livrosAtuais < LIMITE_EMPRESTIMOS;
    }
    public void registrarEmprestimo() {
        livrosAtuais++;
    }
    public void devolverLivro() {
        if (livrosAtuais > 0) livrosAtuais--;
    }
    
    
}
