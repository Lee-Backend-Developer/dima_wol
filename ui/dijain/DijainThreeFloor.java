package ui.dijain;

import ui.common.BackMove;
import wol.IPObjectSocket;
import wol.WolSend;
import wol.ip.list.DeogseongComputerRoomMacAddr;
import wol.ip.list.DijainComputerRoomMacAddr;
import wol.ip.list.IPBrodcastList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DijainThreeFloor<T extends DijainComputerRoomMacAddr> extends JFrame {
    private JButton 이전Button;
    private JButton a100315Button;
    private JPanel panel;

    public DijainThreeFloor() {
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
        a100315Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //todo 임시
                for (String macAddress : T.a100212) {
                    WolSend.wolStart(new IPObjectSocket(macAddress, IPBrodcastList.DIJAINCENTER_1F_2F));
                }
            }
        });
    }
}
