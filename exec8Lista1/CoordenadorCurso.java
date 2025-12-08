package exec8Lista1;

/**
 *
 * @author PLATINADO
 */
public class CoordenadorCurso extends Funcionario {
    
    private String cursoResponsavel;
    private double gratificacaoCoordenacao;

    public CoordenadorCurso(String cursoResponsavel, double gratificacaoCoordenacao, String nome, String documento, double salarioBase) {
        super(nome, documento, salarioBase);
        this.cursoResponsavel = cursoResponsavel;
        this.gratificacaoCoordenacao = gratificacaoCoordenacao;
    }

    public String getCursoResponsavel() {
        return cursoResponsavel;
    }

    public void setCursoResponsavel(String cursoResponsavel) {
        this.cursoResponsavel = cursoResponsavel;
    }

    public double getGratificacaoCoordenacao() {
        return gratificacaoCoordenacao;
    }

    public void setGratificacaoCoordenacao(double gratificacaoCoordenacao) {
        this.gratificacaoCoordenacao = gratificacaoCoordenacao;
    }
    
    @Override
    public double calcularSalarioMensal(){
        
        
        return super.getSalarioBase() + gratificacaoCoordenacao;
    }
    
    @Override
    public String toString(){
        
        return "\t Dados do Coordenador:\n Nome: " + this.getNome() + " Curso: " + this.getCursoResponsavel() + " Documento: " + this.getDocumento();
    }
    
    
}
