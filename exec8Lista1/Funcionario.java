package exec8Lista1;

/**
 *
 * @author PLATINADO
 */
public class Funcionario {
    
    private String nome;
    private String documento;
    private double salarioBase;

    public Funcionario(String nome, String documento, double salarioBase) {
        this.nome = nome;
        this.documento = documento;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    
    public double calcularSalarioMensal(){
        
        
        return salarioBase;
    }
    
    
    
}
