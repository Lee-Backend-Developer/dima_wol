package school;

import java.util.ArrayList;
import java.util.List;

abstract class Floor {
    // 층 수
    private final int floorNumber;

    // 층에 있는 방
    private List<Room> rooms = new ArrayList<>();

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<Room> getRooms() {
        return rooms;
    }

}
