package school;

import java.util.ArrayList;
import java.util.List;

public class Building {
    // 건물 이름
    private final String buildingName;
    // 건물에 있는 층
    private final List<Floor> floors = new ArrayList<>();

    public Building(String buildingName) {
        this.buildingName = buildingName;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    // 층수 가져오기
    public int getFloorCount() {
        return floors.size();
    }
}
