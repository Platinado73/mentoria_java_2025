package exerc9Lista1;

/**
 *
 * @author PLATINADO
 */
public class ContaSalario extends Conta {
    
    private String empregador;

    public ContaSalario(String empregador, String numero, String titular, double saldo) {
        super(numero, titular, saldo);
        this.empregador = empregador;
    }

    public String getEmpregador() {
        return empregador;
    }

    public void setEmpregador(String empregador) {
        this.empregador = empregador;
    }
    
    
    @Override
    public void sacar(double valor){
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Conta salário: saque negado! Saldo insuficiente.");
        }
        
        
        
        
    }

 
    
    
    
}
