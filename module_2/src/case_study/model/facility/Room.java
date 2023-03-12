package case_study.model.facility;

public class Room extends Facility {
    private String free; // dịch vụ miễn phí


    public Room() {
    }

    public Room(String free) {
        this.free = free;
    }

    public Room(String name, double areaTotal, long price, int quantity, String type) {
        super(name, areaTotal, price, quantity, type);
    }

    public Room(String name, double areaTotal, long price, int quantity, String type, String free) {
        super(name, areaTotal, price, quantity, type);
        this.free = free;
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free;
    }

    @Override
    public String toString() {
        return "Room{" +
                "free='" + free + '\'' +
                '}';
    }
}
