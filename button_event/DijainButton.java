package button_event;

import file.FileRead;
import wol.WolSendArrayAdapter;

import java.util.List;

public class DijainButton implements ButtonEvent {
    /** 디자인센터 **/
    public static void a100111() {
        List<String> mac = FileRead.fileRead("100111");
        String brodcast = FileRead.fileRead("dijain_1f").getFirst();

        WolSendArrayAdapter.ipObjectSocket(mac.toArray(new String[0]), brodcast);
    }

    public static void a100116() {
        List<String> mac = FileRead.fileRead("100116");
        String brodcast = FileRead.fileRead("dijain_1f").getFirst();

        WolSendArrayAdapter.ipObjectSocket(mac.toArray(new String[0]), brodcast);
    }
    public static void a100212() {
        List<String> mac = FileRead.fileRead("100212");
        String brodcast = FileRead.fileRead("dijain_2f").getFirst();

        WolSendArrayAdapter.ipObjectSocket(mac.toArray(new String[0]), brodcast);
    }
}
