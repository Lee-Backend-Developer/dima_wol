package ui.deogseong;

import javax.swing.*;

public class DeogseongTwoFloor extends JFrame {
    private JButton 이전Button;
    private JButton a50203Button;
    private JButton a50204Button;
    private JButton a50206Button;
    private JButton a50209Button;
    private JButton a50211Button;
    private JPanel panel;

    public DeogseongTwoFloor() {
        setContentPane(panel);
        setTitle("덕성관 전원켜기");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
