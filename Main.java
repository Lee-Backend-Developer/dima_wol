import school.Floor;
import school_building.Deogseong;
import school_building.Dijain;
import school_building.Giyegwan;

public class Main {
    // 초기 설정하고 나서 UI를 띄운다
    public static Giyegwan giyegwan = new Giyegwan();
    public static Deogseong deogseong = new Deogseong();
    public static Dijain dijain = new Dijain();

    public static void main(String[] args) {
        System.out.println("층 수 " + giyegwan.getFloorCount());
        System.out.println("층 마다 호실 수 " + giyegwan.getFloors().get(2).getRoomCount());
        System.out.println(giyegwan.getFloors().get(2).getRoomsName());
        System.out.println(giyegwan.getFloors().get(2).getRooms().get(0).getMacAddress());

//        new MainForm();
    }
}
