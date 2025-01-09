package ui.dijain;

import ui.common.BackMove;
import wol.ip.list.DijainComputerRoomMacAddr;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DijainTwoFloor<T extends DijainComputerRoomMacAddr> extends JFrame {
    private JButton 이전Button;
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
        a100212Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                for (String macAddress : T.a100212) {
                    //WolSend.wolStart(new IPObjectSocket(macAddress, IPBrodcastList.DIJAINCENTER_1F_2F));
                }
            }
        });
    }
}
