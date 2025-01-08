package wol.school;

import wol.ip.list.IPBrodcastList;
import wol.ip.list.MacAddr;
import wol.school.frame.Building;
import wol.school.frame.Floor;
import wol.school.frame.Room;

public class Deogseong extends Building {
    private final String buildingName = "덕성관";

    public Deogseong() {
        Floor[] floors = new Floor[4];
        Room a50203 = new Room("2층", "50203", MacAddr.a50203, IPBrodcastList.DEOKSEONGGWAN_2F.getBrodcast());
        for (int i = 0; i < 4; i++) {
            floors[i] = new Floor(i+"층");
        }
        super(buildingName, );
    }

}
