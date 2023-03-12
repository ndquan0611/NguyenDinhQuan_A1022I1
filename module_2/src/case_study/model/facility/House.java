package case_study.model.facility;

public class House extends Facility {
    private String room; // tiêu chuẩn phòng
    private int floor; // tầng lầu


    public House() {
    }

    public House(String room, int floor) {
        this.room = room;
        this.floor = floor;
    }

    public House(String name, double areaTotal, long price, int quantity, String type) {
        super(name, areaTotal, price, quantity, type);
    }

    public House(String name, double areaTotal, long price, int quantity, String type, String room, int floor) {
        super(name, areaTotal, price, quantity, type);
        this.room = room;
        this.floor = floor;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                "room='" + room + '\'' +
                ", floor=" + floor +
                '}';
    }
}
