package exerc3Lista2;

/**
 *
 * @author PLATINADO
 */
public class PedidoOnline {

    private String numeroPedido;
    private String descricaoProduto;
    private int quantidade;
    private double precoUnitario;
    private String estado;

    public PedidoOnline(String numeroPedido, String descricaoProduto, int quantidade, double precoUnitario) {
        this.numeroPedido = numeroPedido;
        this.descricaoProduto = descricaoProduto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.estado = "NOVO";
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public String getEstado() {
        return estado;
    }

    public double calcularTotal() {

        return quantidade * precoUnitario;
    }

    public void marcarComoPago() {

        this.estado = "pago";
    }

    public void marcarComoEnviado() {

        if ("pago".equals(this.estado)) {
            this.estado = "enviado";

        }

    }

    @Override
    public String toString() {

        return " \nnumero do pedido: " + this.numeroPedido + " \ndescricao do produto: " + this.descricaoProduto + " \nquantidade: " + this.quantidade + "\n preco unitario: " + this.precoUnitario + " \n valor total: " + calcularTotal();

    }
}
