package case_study.model.person;

public class Customer extends Person {
    private String code; // mã khách hàng
    private String type; // loại khách hàng
    private String address; // địa chỉ

    public Customer() {
    }

    public Customer(String code, String type, String address) {
        this.code = code;
        this.type = type;
        this.address = address;
    }

    public Customer(String name, String date, String gender, int id, String phone, String email) {
        super(name, date, gender, id, phone, email);
    }

    public Customer(String name, String date, String gender, int id, String phone, String email, String code, String type, String address) {
        super(name, date, gender, id, phone, email);
        this.code = code;
        this.type = type;
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "code='" + code + '\'' +
                ", type='" + type + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
