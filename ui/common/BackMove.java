package ui.common;

import ui.MainForm;
import ui.giyegwan.Giyegwan;

public abstract class BackMove {

    // 메인으로 이동
    public static void mainForm() {
        new MainForm();
    }

    // 기예관으로 이동
    public static void giyegwan() {
        new Giyegwan();
    }
}
