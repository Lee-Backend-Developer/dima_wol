package school_building;

import school.Building;
import school.ComputerLab;
import school.Room;
import wol.ip.list.IPBrodcastList;

import static wol.ip.list.DijainComputerRoomMacAddr.*;

public class Dijain extends Building{
    private ComputerLab[] computerLabs = {new ComputerLab(1), new ComputerLab(2), new ComputerLab(3), new ComputerLab(4)};

    public Dijain() {
        super("디자인센터");
        Room[][] rooms = {
                // 1층
                {
                        new Room(1, "100111", a100111, IPBrodcastList.DIJAINCENTER_1F_2F.getBrodcast()),
                        new Room(1, "100116", a100116, IPBrodcastList.DIJAINCENTER_1F_2F.getBrodcast()),
                },
                // 2층
                {
                        new Room(2, "100212", a100212, IPBrodcastList.DIJAINCENTER_1F_2F.getBrodcast()),
                },

                // 3층
                {},
                // 4층
                {}

        };

        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                computerLabs[i].getRooms().add(rooms[i][j]);
            }
        }

    }
}
