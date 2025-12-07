package exerc10List1;

/**
 *
 * @author PLATINADO
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Autor autor = new Autor("Simon Kendal", "Britânica");
        Livro livro = new Livro("Object Oriented Programming Using Java", "978-0-12-345678-9", 2010, 5, 5);
        Aluno aluno = new Aluno("Maria Silva", "2025001", "Engenharia Informática");

        Emprestimo emp = new Emprestimo(aluno, livro, "2025-03-01", "2025-03-15");

        if (livro.baixarExemplar()) {
            System.out.println("Exemplar retirado com sucesso.");
            aluno.registrarEmprestimo();
        }

        emp.setDataDevolucao("2025-03-20");
        emp.calcularMulta();

        System.out.println("\n\t===== EMPRÉSTIMO =====\t");
        System.out.println("Aluno: " + emp.getAluno().getNome());
        System.out.println("Livro: " + emp.getLivro().getTitulo());
        System.out.println("Data do Empréstimo: " + emp.getDataEmprestimo());
        System.out.println("Data da Devolução: " + emp.getDataDevolucao());
        System.out.println(String.format("Multa Calculada: %.2f €", emp.getMultaCalculada()));
    }
}
