package usuarios;

public class Order {
    private int orderId;
    private String dateCreated;
    private String dateShipped;
    private String customerName;
    private String customerId;
    private String status;
    private String shippingId;

    private Customer customer;

    public Order(int orderId, String dateCreated, String dateShipped, String customerName, String customerId, String status, String shippingId) {
        this.orderId = orderId;
        this.dateCreated = dateCreated;
        this.dateShipped = dateShipped;
        this.customerName = customerName;
        this.customerId = customerId;
        this.status = status;
        this.shippingId = shippingId;
    }

    public void placeOrder()
    {

    }
}
