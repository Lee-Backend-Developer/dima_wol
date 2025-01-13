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

    // 맥어드레스 문자열로 가져오기
    public String getMacAddress() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String mac : macAddress) {
            stringBuilder.append(mac).append("\n");
        }
        return stringBuilder.toString();
    }

    // 맥어드레스 배열로 가져옴
    public String[] getMacAddressArray() {
        return macAddress;
    }


    public String getRoomName() {
        return roomName;
    }

    public String getBroadcastAddress() {
        return broadcastAddress;
    }
}
