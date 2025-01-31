import file.FileRead;
import school_building.DeogseongBuilding;
import school_building.DijainBuilding;
import school_building.GiyegwanBuilding;
import ui.MainForm;
import wol.WolSendArrayAdapter;

import java.io.IOException;

public class Main {
    // 초기 설정하고 나서 UI를 띄운다
    public static GiyegwanBuilding giyegwanBuilding = new GiyegwanBuilding();
    public static DeogseongBuilding deogseongBuilding = new DeogseongBuilding();
    public static DijainBuilding dijainBuilding = new DijainBuilding();

    public static void main(String[] args) {
        /*FileRead fileRead = new FileRead();
        try {
            WolSendArrayAdapter.ipObjectSocket(
                    fileRead.fileRead("giyegwan2f")
                            .toArray(String[]::new)
                    , "8.8.8.8");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        new MainForm();
    }
}
