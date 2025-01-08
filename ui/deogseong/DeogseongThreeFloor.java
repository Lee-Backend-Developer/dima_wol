package ui.deogseong;

import ui.common.BackMove;
import wol.IPObjectSocket;
import wol.WolSend;
import wol.ip.list.IPBrodcastList;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DeogseongThreeFloor<T extends DeogseongComputerComputerBulid> extends JFrame {
    private JPanel panel;
    private JButton 이전Button;
    private JButton a50305Button;
    private JButton a50310Button;

    public DeogseongThreeFloor() {
        setContentPane(panel);
        setTitle("덕성관 3층");
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
        a50305Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                for (String macAddress : T.a50305) {
                    WolSend.wolStart(new IPObjectSocket(macAddress, IPBrodcastList.DEOKSEONGGWAN_3F));
                }
            }
        });
        a50310Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                for (String macAddress : T.a50310) {
                    WolSend.wolStart(new IPObjectSocket(macAddress, IPBrodcastList.DEOKSEONGGWAN_3F));
                }
            }
        });
    }
}
