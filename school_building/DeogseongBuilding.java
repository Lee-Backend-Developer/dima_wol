package school_building;

import school.Building;
import school.ComputerLab;
import school.Floor;
import school.Room;
import wol.ip.list.IPBrodcastList;

import java.util.HashMap;
import java.util.Map;

import static wol.ip.list.DeogseongComputerComputerBuilding.*;

public class DeogseongBuilding extends Building {

    private static DeogseongBuilding instance = new DeogseongBuilding();


    public DeogseongBuilding() {
        super("덕성관");

        Map<String, Room> roomMap = new HashMap<>();

        // 2층
        roomMap.put("50203", new Room(2, "50203", a50203, IPBrodcastList.DEOKSEONGGWAN_2F.getBrodcast()));
        roomMap.put("50204", new Room(2, "50204", a50204, IPBrodcastList.DEOKSEONGGWAN_2F.getBrodcast()));
        roomMap.put("50206", new Room(2, "50206", a50206, IPBrodcastList.DEOKSEONGGWAN_2F.getBrodcast()));
        roomMap.put("50209", new Room(2, "50209", a50209, IPBrodcastList.DEOKSEONGGWAN_2F.getBrodcast()));

        // 3층
        roomMap.put("50305", new Room(3, "50305", a50305, IPBrodcastList.DEOKSEONGGWAN_3F.getBrodcast()));
        roomMap.put("50310", new Room(3, "50310", a50310, IPBrodcastList.DEOKSEONGGWAN_3F.getBrodcast()));

        // 4층
        roomMap.put("50408", new Room(4, "50408", a50408, IPBrodcastList.DEOKSEONGGWAN_4F.getBrodcast()));

        ComputerLab[] computerLabs = {
                new ComputerLab(1),
                new ComputerLab(2),
                new ComputerLab(3),
                new ComputerLab(4)
        };
        addFloor(computerLabs);

        Floor.addRoom(roomMap, computerLabs);

    }

    public static DeogseongBuilding getInstance() {
        return instance;
    }
}
