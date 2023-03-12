package case_study.model.facility;

public abstract class Facility {
    private String name; // tên dịch vụ
    private double areaTotal; // diện tích sử dụng
    private long price; // chi phí thuê
    private int quantity; // số lượng người tối đa
    private String type; // kiểu thuê

    public Facility() {
    }

    public Facility(String name, double areaTotal, long price, int quantity, String type) {
        this.name = name;
        this.areaTotal = areaTotal;
        this.price = price;
        this.quantity = quantity;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "name='" + name + '\'' +
                ", areaTotal=" + areaTotal +
                ", price=" + price +
                ", quantity=" + quantity +
                ", type='" + type + '\'' +
                '}';
    }
}
