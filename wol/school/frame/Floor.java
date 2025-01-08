package wol.school.frame;

public abstract class Floor {
    private String floorName;
    private Room[] rooms;

    public Floor(String floorName, Room[] rooms) {
        this.floorName = floorName;
        this.rooms = rooms;
    }

    public Floor(String floorName) {
        this.floorName = floorName;
    }
}
