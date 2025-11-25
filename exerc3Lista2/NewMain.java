
package exerc3Lista2;

/**
 *
 * @author PLATINADO
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PedidoOnline pedido = new PedidoOnline("PED-2025-001", "Headset Bluetooth", 3,15000.0);
        System.out.println(pedido);
        
        System.out.println("\n\t-------------------------------------\n\t");
        
        pedido.marcarComoPago();
        
        System.out.println("alteração do estado para: " + pedido.getEstado());
        
        System.out.println("\n\t-------------------------------------\n\t");
        
        
        System.out.println(pedido);
        
        pedido.marcarComoEnviado();
        System.out.println("alteração do estado final: " + pedido.getEstado());
        
    }
    
}
