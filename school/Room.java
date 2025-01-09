package school;

public class Room extends Floor {
    // 호실명
    private String roomName;

    // 컴퓨터 맥 어드레스
    private String[] macAddress;

    // 컴퓨터 브로드캐스트 주소
    private String broadcastAddress;

    public Room(int floorNumber, String roomName, String[] macAddress, String broadcastAddress) {
        super(floorNumber);

        this.roomName = roomName;
        this.macAddress = macAddress;
        this.broadcastAddress = broadcastAddress;
    }
}
