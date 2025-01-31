package button_event;

import file.FileRead;
import wol.WolSendArrayAdapter;

import java.util.List;

public interface ButtonEvent {

    // 각각 흩어져 있는 버튼들을 여기로 모이게하기
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

    /** 덕성관 **/
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
