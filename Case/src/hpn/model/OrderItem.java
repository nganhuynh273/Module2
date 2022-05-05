package hpn.model;

public class OrderItem {
    private long id;
    private long orderID;
    private long productID;
    private String productName;
    private double price;
    private int quantity;
    private double total;

    public OrderItem() {
    }

    public OrderItem(long id, long orderID, long productID, String productName, double price, int quantity, double total) {
        this.id = id;
        this.orderID = orderID;
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.total = total;
    }

    public OrderItem(String record) {
        String[] fields = record.split(",");
        id = Long.parseLong(fields[0]);
        price = Double.parseDouble(fields[1]);
        quantity = Integer.parseInt(fields[2]);
        orderID = Long.parseLong(fields[3]);
        productID = Integer.parseInt(fields[4]);
        productName = fields[5];
        total = Double.parseDouble(fields[6]);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOrderID() {
        return orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public String getProductName() {

        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return id +
                "," + price +
                "," + quantity +
                "," + orderID +
                "," + productID +
                "," + productName +
                "," + total;
    }
}
