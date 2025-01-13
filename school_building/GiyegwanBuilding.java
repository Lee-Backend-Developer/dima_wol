package school_building;

import school.Building;
import school.ComputerLab;
import school.Floor;
import school.Room;
import wol.ip.list.IPBrodcastList;

import java.util.HashMap;
import java.util.Map;

import static wol.ip.list.GiyegwanComputerRoomMacAddr.*;

public class GiyegwanBuilding extends Building {

    public GiyegwanBuilding() {
        super("기예관");

        Map<String, Room> roomMap = new HashMap<>();

        // 2층
        roomMap.put("30225", new Room(2, "30225", a30225, IPBrodcastList.GIYEGWAN_2F.getBrodcast()));

        // 3층
        roomMap.put("30311", new Room(3, "30311", a30311, IPBrodcastList.GIYEGWAN_3F.getBrodcast()));
        roomMap.put("30323", new Room(3, "30323", a30323, IPBrodcastList.GIYEGWAN_3F.getBrodcast()));

        ComputerLab[] computerLabs = {
                new ComputerLab(1),
                new ComputerLab(2),
                new ComputerLab(3),
                new ComputerLab(4)
        };
        addFloor(computerLabs);

        Floor.addRoom(roomMap, computerLabs);

    }

}
