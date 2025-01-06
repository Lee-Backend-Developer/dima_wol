package ui.dijain;

import ui.common.BackMove;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DijainTwoFloor extends JFrame {
    private JButton 이전Button;
    private JButton a100211Button;
    private JButton a100212Button;
    private JPanel panel;

    public DijainTwoFloor() {
        setContentPane(panel);
        setTitle("디자인센터 전원켜기");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        이전Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                BackMove.designCenter();
                setVisible(false);
            }
        });
    }
}
