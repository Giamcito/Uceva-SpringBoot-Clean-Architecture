package uceva.cleanarchitecture.domain.entity;

public class Order {
    public Integer id;
    public String orderNumber;
    public String customerName;
    public Float totalPrice;
    public String status;
    public String createdDate;
    public Integer itemsCount;

    public Order(Integer id, String orderNumber, String customerName, Float totalPrice, 
                String status, String createdDate, Integer itemsCount) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
        this.status = status;
        this.createdDate = createdDate;
        this.itemsCount = itemsCount;
    }
}