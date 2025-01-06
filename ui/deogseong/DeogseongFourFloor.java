package ui.deogseong;

import ui.common.BackMove;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DeogseongFourFloor extends JFrame {
    private JButton 이전Button;
    private JButton a50408Button;
    private JPanel panel;

    public DeogseongFourFloor() {
        setContentPane(panel);
        setTitle("덕성관 전원켜기");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        이전Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                BackMove.deogseong();
                setVisible(false);
            }
        });
    }
}
