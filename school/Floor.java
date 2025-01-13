package school;

import java.util.*;

public abstract class Floor {
    // 층 수
    private final int floorNumber;

    // 층에 있는 방
    private Map<String, Room> rooms = new HashMap<>();

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Map<String, Room> getRooms() {
        return rooms;
    }

    // 층 수 가져오기
    public int getFloorNumber() {
        return floorNumber;
    }

    // 호실 수 가져오기
    public int getRoomCount() {
        return rooms.size();
    }

    // 층 마다 호실 이름 가져오기
    public String getRoomsName() {
        StringBuilder stringBuilder = new StringBuilder();

        rooms
                .forEach((roomName, room) -> stringBuilder
                        .append("호실명: ")
                        .append(roomName)
                        .append(" ")
                        .append("브로드캐스트 주소 : ")
                        .append(room.getBroadcastAddress())
                        .append("\n"));

        return stringBuilder.toString();
    }

    // 강의실을 추가함
    public static void addRoom(Map<String, Room> roomMap, Floor[] floorArray) {
        if(Objects.isNull(roomMap))
            throw new IllegalArgumentException("rooms is null");

        roomMap.forEach((roomName, room) -> {
            floorArray[room.getFloorNumber() - 1]
                    .getRooms().put(roomName, room);
        });
    }

}
