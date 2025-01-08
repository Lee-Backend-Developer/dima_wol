package ui.dijain;

import ui.common.BackMove;
import wol.IPObjectSocket;
import wol.WolSendArrayAdapter;
import wol.ip.list.DijainComputerRoomMacAddr;
import wol.ip.list.IPBrodcastList;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DijainOneFloor<T extends DijainComputerRoomMacAddr> extends JFrame{
    private JPanel panel;
    private JButton 이전Button;
    private JButton a100111Button;
    private JButton a100116Button;

    public DijainOneFloor() {
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
        a100111Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                for (String macAddress : T.a100111) {
                    WolSendArrayAdapter.ipObjectSocket((new IPObjectSocket(macAddress, IPBrodcastList.DIJAINCENTER_1F_2F)));
                }
            }
        });
        a100116Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                for (String macAddress : T.a100116) {
                    WolSend.wolStart(new IPObjectSocket(macAddress, IPBrodcastList.DIJAINCENTER_1F_2F));
                }
            }
        });
    }
}