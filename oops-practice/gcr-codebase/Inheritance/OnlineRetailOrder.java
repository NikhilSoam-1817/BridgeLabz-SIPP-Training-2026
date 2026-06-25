class Order {
    private String orderId;
    private String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getOrderStatus() {
        return "Order placed";
    }

    @Override
    public String toString() {
        return "Order{id='" + orderId + "', date='" + orderDate + "', status='" + getOrderStatus() + "'}";
    }
}

class ShippedOrder extends Order {
    private String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order shipped";
    }

    @Override
    public String toString() {
        return "ShippedOrder{id='" + getOrderId() + "', date='" + getOrderDate() + "', tracking='" + trackingNumber + "', status='" + getOrderStatus() + "'}";
    }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order delivered";
    }

    @Override
    public String toString() {
        return "DeliveredOrder{id='" + getOrderId() + "', date='" + getOrderDate() + "', tracking='" + getTrackingNumber() + "', deliveryDate='" + deliveryDate + "', status='" + getOrderStatus() + "'}";
    }
}

public class OnlineRetailOrder {
    public static void main(String[] args) {
        Order order = new Order("1001", "2026-06-25");
        ShippedOrder shippedOrder = new ShippedOrder("1002", "2026-06-24", "TRACK123");
        DeliveredOrder deliveredOrder = new DeliveredOrder("1003", "2026-06-20", "TRACK456", "2026-06-25");

        System.out.println(order);
        System.out.println(shippedOrder);
        System.out.println(deliveredOrder);
    }
}
