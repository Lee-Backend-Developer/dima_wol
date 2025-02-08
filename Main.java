import file.FileRead;
import ui.MainForm;
import wol.WolSendArrayAdapter;

import java.io.IOException;

public class Main {
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
