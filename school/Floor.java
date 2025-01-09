package school;

import java.util.ArrayList;
import java.util.List;

public abstract class Floor {
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

    // 호실 수 가져오기
    public int getRoomCount() {
        return rooms.size();
    }

    // 층 마다 호실 이름 가져오기
    public String getRoomsName() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Room room : rooms) {
            stringBuilder
                    .append("호실명: ")
                    .append(room.getRoomName())
                    .append(" ")
                    .append("브로드캐스트 주소 : ")
                    .append(room.getBroadcastAddress())
                    .append("\n");
        }
        return stringBuilder.toString();
    }

}
