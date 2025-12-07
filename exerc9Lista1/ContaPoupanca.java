package exerc9Lista1;

/**
 *
 * @author PLATINADO
 */
public class ContaPoupanca extends Conta {
    
    private double taxaJuros;

    public ContaPoupanca(double taxaJuros, String numero, String titular, double saldo) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    
    @Override
    public void aplicarJuros(){
        
        saldo = saldo + (saldo*taxaJuros);
        
    }
    
    
}
