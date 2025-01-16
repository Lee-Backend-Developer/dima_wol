import file.FileRead;
import school_building.DeogseongBuilding;
import school_building.DijainBuilding;
import school_building.GiyegwanBuilding;
import ui.MainForm;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    // 초기 설정하고 나서 UI를 띄운다
    public static GiyegwanBuilding giyegwanBuilding = new GiyegwanBuilding();
    public static DeogseongBuilding deogseongBuilding = new DeogseongBuilding();
    public static DijainBuilding dijainBuilding = new DijainBuilding();

    public static void main(String[] args) {
        FileRead fileRead = new FileRead();
        try {
            fileRead.fileRead();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        new MainForm();
    }
}
