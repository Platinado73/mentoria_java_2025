package exerc10List1;

/**
 *
 * @author PLATINADO
 */
public class Emprestimo {
    
    private Aluno aluno;
    private Livro livro;
    private String dataEmprestimo;
    private String dataPrevistaDevolucao;
    private String dataDevolucao;
    private double multaCalculada;
            
            public Emprestimo(Aluno aluno, Livro livro, String dataEmprestimo, String dataPrevistaDevolucao) {
        this.aluno = aluno;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    public void setDataPrevistaDevolucao(String dataPrevistaDevolucao) {
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public double getMultaCalculada() {
        return multaCalculada;
    }

    public void setMultaCalculada(double multaCalculada) {
        this.multaCalculada = multaCalculada;
    }
    
    public void calcularMulta() {
        
        double multaPorDia = 200;

        int diasAtraso = calcularDiferencaDatas(dataPrevistaDevolucao, dataDevolucao);

        if (diasAtraso > 0) {
            multaCalculada = diasAtraso * multaPorDia;
        } else {
            multaCalculada = 0;
        }
        
        
    }
    
    private int calcularDiferencaDatas(String prevista, String devolvida) {
        
        int diaPrev = Integer.parseInt(prevista.substring(8));
        int diaDev = Integer.parseInt(devolvida.substring(8));

        return diaDev - diaPrev;
    }
    
    

            
            
    
    
}
