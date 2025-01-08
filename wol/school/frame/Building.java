package wol.school.frame;

public abstract class Building {
    private String buildingName;
    private Floor[] floors;

    public Building(String buildingName, Floor[] floors) {
        this.buildingName = buildingName;
        this.floors = floors;
    }
}
