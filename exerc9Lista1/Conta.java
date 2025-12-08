
package exerc9Lista1;

/**
 *
 * @author PLATINADO
 */
public class Conta {
    
    private String numero;
    private String titular;
    double saldo;

    public Conta(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        
        if(valor >0){
            
            this.saldo = this.saldo + valor;
        }else{
             System.out.println("   valor de depósito inválido");
        }
    }
    
    public void sacar(double valor){
        
        if(this.saldo >= valor && valor > 0){
            
            this.saldo = this.saldo - valor;
        }
        else{
            System.out.println("saldo insuficiente");
        }
        
        
    }
    
    public void aplicarJuros(){
        
    }
    
    
    
}
