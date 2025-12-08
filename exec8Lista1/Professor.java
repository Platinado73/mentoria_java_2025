package exec8Lista1;

/**
 *
 * @author PLATINADO
 */
public class Professor extends Funcionario{
    private String area;
    private int horasAulaSemana;

    public Professor(String area, int horasAulaSemana, String nome, String documento, double salarioBase) {
        super(nome, documento, salarioBase);
        this.area = area;
        this.horasAulaSemana = horasAulaSemana;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getHorasAulaSemana() {
        return horasAulaSemana;
    }

    public void setHorasAulaSemana(int horasAulaSemana) {
        this.horasAulaSemana = horasAulaSemana;
    }
    
    @Override
    public double calcularSalarioMensal(){
        
        
        return super.getSalarioBase() * horasAulaSemana;
    }
    
    
    @Override
    public String toString(){
        
        return "\t Dados do Professor:\n Nome: " + this.getNome() + " Area: " + this.area + " Documento: " + this.getDocumento();
    }
}
