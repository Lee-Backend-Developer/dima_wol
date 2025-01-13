package school_building;

import school.Building;
import school.ComputerLab;
import school.Floor;
import school.Room;
import wol.ip.list.IPBrodcastList;

import java.util.HashMap;
import java.util.Map;

import static wol.ip.list.DijainComputerRoomMacAddr.*;

public class DijainBuilding extends Building{

    public DijainBuilding() {
        super("디자인센터");
        Map<String, Room> roomMap = new HashMap<>();
        // 1층
        roomMap.put("100111", new Room(1, "100111", a100111, IPBrodcastList.DIJAINCENTER_1F_2F.getBrodcast()));
        roomMap.put("100116", new Room(1, "100116", a100116, IPBrodcastList.DIJAINCENTER_1F_2F.getBrodcast()));
        // 2층
        roomMap.put("100212", new Room(2, "100212", a100212, IPBrodcastList.DIJAINCENTER_1F_2F.getBrodcast()));

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
