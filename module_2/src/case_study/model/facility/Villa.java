package case_study.model.facility;

public class Villa extends Facility {
    private String room; // tiêu chuẩn phòng
    private double area; // diện tích hồ bơi
    private int floor; // số tầng lầu

    public Villa() {
    }

    public Villa(String room, double area, int floor) {
        this.room = room;
        this.area = area;
        this.floor = floor;
    }

    public Villa(String name, double areaTotal, long price, int quantity, String type) {
        super(name, areaTotal, price, quantity, type);
    }

    public Villa(String name, double areaTotal, long price, int quantity, String type, String room, double area, int floor) {
        super(name, areaTotal, price, quantity, type);
        this.room = room;
        this.area = area;
        this.floor = floor;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "room='" + room + '\'' +
                ", area=" + area +
                ", floor=" + floor +
                '}';
    }
}
