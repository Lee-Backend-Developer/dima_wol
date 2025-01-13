package school;

import java.util.ArrayList;
import java.util.List;

public class Building {
    // 건물 이름
    private final String buildingName;
    
    // 건물에 있는 층
    private final List<Floor> floors = new ArrayList<>();

    // 건물 이름으로 생성함
    public Building(String buildingName) {
        this.buildingName = buildingName;
    }

    // 건물 층 수 별로 ex) [컴퓨터실, 강의실] 등 가져옴
    public List<Floor> getFloors() {
        return floors;
    }

    // 층 수 가져오기
    public int getFloorCount() {
        return floors.size();
    }

    // 층 수 마다 호실을 추가함
    public void addFloor(Floor[] floorArray) {
        for (Floor floor : floorArray) {
            getFloors().add(floor);
        }
    }
}
