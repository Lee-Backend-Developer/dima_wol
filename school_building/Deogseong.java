package school_building;

import school.Building;
import school.ComputerLab;
import school.Room;
import wol.ip.list.IPBrodcastList;

import static wol.ip.list.DeogseongComputerComputerBuilding.*;

public class Deogseong extends Building {
    private ComputerLab[] computerLabs = {
            new ComputerLab(1),
            new ComputerLab(2),
            new ComputerLab(3),
            new ComputerLab(4)
    };

    public Deogseong() {
        super("덕성관");
        Room[][] rooms = {
                // 1층
                {},
                // 2층
                {
                        new Room(2, "50203", a50203, IPBrodcastList.DEOKSEONGGWAN_2F.getBrodcast()),
                        new Room(2, "50204", a50204, IPBrodcastList.DEOKSEONGGWAN_2F.getBrodcast()),
                        new Room(2, "50206", a50206, IPBrodcastList.DEOKSEONGGWAN_2F.getBrodcast()),
                        new Room(2, "50209", a50209, IPBrodcastList.DEOKSEONGGWAN_2F.getBrodcast()),
                },

                // 3층
                {
                        new Room(3, "50305", a50305, IPBrodcastList.DEOKSEONGGWAN_3F.getBrodcast()),
                        new Room(3, "50310", a50310, IPBrodcastList.DEOKSEONGGWAN_3F.getBrodcast())
                },
                // 4층
                {
                        new Room(4, "50408", a50408, IPBrodcastList.DEOKSEONGGWAN_4F.getBrodcast())
                }

        };

        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                computerLabs[i].getRooms().add(rooms[i][j]);
            }
        }

    }
}
