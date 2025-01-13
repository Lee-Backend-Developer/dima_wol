import school_building.DeogseongBuilding;
import school_building.DijainBuilding;
import school_building.GiyegwanBuilding;
import ui.MainForm;

public class Main {
    // 초기 설정하고 나서 UI를 띄운다
    public static GiyegwanBuilding giyegwanBuilding = new GiyegwanBuilding();
    public static DeogseongBuilding deogseongBuilding = new DeogseongBuilding();
    public static DijainBuilding dijainBuilding = new DijainBuilding();

    public static void main(String[] args) {
///*
//        System.out.println("층 수 " + giyegwanBuilding.getFloorCount());
//        System.out.println("층 마다 호실 수 " + giyegwanBuilding.getFloors());
//        System.out.println(giyegwanBuilding.getFloors().get(2).getRoomsName());
//        System.out.println(giyegwanBuilding.getFloors().get(2).getRooms());
//*/

        new MainForm();
    }
}
