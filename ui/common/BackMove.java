package ui.common;

import ui.MainForm;
import ui.deogseong.Deogseong;
import ui.dijain.Dijain;
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

    // 덕성관으로 이동
    public static void deogseong() {
        new Deogseong();
    }

    // 디자인센터으로 이동
    public static void designCenter() {
        new Dijain();
    }
}
