package school_building;

import school.Building;
import school.ComputerLab;
import school.Room;
import wol.ip.list.IPBrodcastList;

import static wol.ip.list.GiyegwanComputerRoomMacAddr.*;

public class Giyegwan extends Building {

    public Giyegwan() {
        super("기예관");
        ComputerLab[] computerLabs = {new ComputerLab(1), new ComputerLab(2), new ComputerLab(3), new ComputerLab(4)};

        Room[][] rooms = {
                // 1층
                {},
                // 2층
                {
                        new Room(2, "50203", a30225, IPBrodcastList.DEOKSEONGGWAN_2F.getBrodcast()),
                },

                // 3층
                {
                        new Room(3, "50305", a30311, IPBrodcastList.DEOKSEONGGWAN_3F.getBrodcast()),
                        new Room(3, "50310", a30323, IPBrodcastList.DEOKSEONGGWAN_3F.getBrodcast())
                },
                // 4층
                {}

        };

        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                computerLabs[i].getRooms().add(rooms[i][j]);
            }
            getFloors().add(computerLabs[i]);
        }


    }
}