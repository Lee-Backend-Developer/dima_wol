package button_event;

import file.FileRead;
import wol.WolSendArrayAdapter;

import java.util.List;

public class GiyegwanButton implements ButtonEvent{
    /** 기예관 **/
    public static void a30225() {
        List<String> mac = FileRead.fileRead("30225");
        String brodcast = FileRead.fileRead("giyegwan2f").getFirst();

        WolSendArrayAdapter.ipObjectSocket(mac.toArray(new String[0]), brodcast);
    }

    public static void a30311() {
        List<String> mac = FileRead.fileRead("30111");
        String brodcast = FileRead.fileRead("giyegwan3f").getFirst();

        WolSendArrayAdapter.ipObjectSocket(mac.toArray(new String[0]), brodcast);
    }

    public static void a30323() {
        List<String> mac = FileRead.fileRead("30323");
        String brodcast = FileRead.fileRead("giyegwan3f").getFirst();

        WolSendArrayAdapter.ipObjectSocket(mac.toArray(new String[0]), brodcast);
    }
}
