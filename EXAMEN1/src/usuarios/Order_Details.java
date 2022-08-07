package usuarios;

public class Order_Details {
    private int orderId;
    private int productoId;
    private String productName;
    private int quantity;
    private float uniCost;
    private float subtotal;
    private Order order;

    public Order_Details(int orderId, int productoId, String productName, int quantity, float uniCost, float subtotal) {
        this.orderId = orderId;
        this.productoId = productoId;
        this.productName = productName;
        this.quantity = quantity;
        this.uniCost = uniCost;
        this.subtotal = subtotal;
    }

    public void calcPrice()
    {

    }
}
