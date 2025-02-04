package button_event;

import file.FileRead;
import wol.WolSendArrayAdapter;

import java.util.List;

public class DeogseongButton implements ButtonEvent {
    /** 덕성관 **/
    public static void a50203() {
        List<String> mac = FileRead.fileRead("50203");
        String brodcast = FileRead.fileRead("deogseong2f").getFirst();

        WolSendArrayAdapter.ipObjectSocket(mac.toArray(new String[0]), brodcast);
    }

    public static void a50204() {
        List<String> mac = FileRead.fileRead("50204");
        String brodcast = FileRead.fileRead("deogseong2f").getFirst();

        WolSendArrayAdapter.ipObjectSocket(mac.toArray(new String[0]), brodcast);
    }

    public static void a50206() {
        List<String> mac = FileRead.fileRead("50206");
        String brodcast = FileRead.fileRead("deogseong2f").getFirst();

        WolSendArrayAdapter.ipObjectSocket(mac.toArray(new String[0]), brodcast);
    }

    public static void a50209() {
        List<String> mac = FileRead.fileRead("50209");
        String brodcast = FileRead.fileRead("deogseong2f").getFirst();

        WolSendArrayAdapter.ipObjectSocket(mac.toArray(new String[0]), brodcast);
    }

    public static void a50211() {
        List<String> mac = FileRead.fileRead("50211");
        String brodcast = FileRead.fileRead("deogseong2f").getFirst();

        WolSendArrayAdapter.ipObjectSocket(mac.toArray(new String[0]), brodcast);
    }
    public static void a50305() {
        List<String> mac = FileRead.fileRead("50305");
        String brodcast = FileRead.fileRead("deogseong3f").getFirst();

        WolSendArrayAdapter.ipObjectSocket(mac.toArray(new String[0]), brodcast);
    }

    public static void a50310() {
        List<String> mac = FileRead.fileRead("50310");
        String brodcast = FileRead.fileRead("deogseong3f").getFirst();

        WolSendArrayAdapter.ipObjectSocket(mac.toArray(new String[0]), brodcast);
    }

    public static void a50408() {
        List<String> mac = FileRead.fileRead("50408");
        String brodcast = FileRead.fileRead("deogseong4f").getFirst();

        WolSendArrayAdapter.ipObjectSocket(mac.toArray(new String[0]), brodcast);
    }
}
