package ui.deogseong;

import wol.IPObjectSocket;
import wol.WolSend;
import wol.ip.list.DeogseongComputerRoomMacAddr;
import wol.ip.list.IPBrodcastList;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DeogseongTwoFloor<T extends DeogseongComputerRoomMacAddr> extends JFrame {
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

        이전Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Deogseong();
                setVisible(false);
            }
        });
        a50203Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                for (String macAddress : T.a50203) {
                    WolSend.wolStart(new IPObjectSocket(macAddress, IPBrodcastList.DEOKSEONGGWAN_2F));
                }
            }
        });
        a50204Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                for (String macAddress : T.a50204) {
                    WolSend.wolStart(new IPObjectSocket(macAddress, IPBrodcastList.DEOKSEONGGWAN_2F));
                }
            }
        });
        a50206Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                for (String macAddress : T.a50206) {
                    WolSend.wolStart(new IPObjectSocket(macAddress, IPBrodcastList.DEOKSEONGGWAN_2F));
                }
            }
        });
        a50209Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                for (String macAddress : T.a50209) {
                    WolSend.wolStart(new IPObjectSocket(macAddress, IPBrodcastList.DEOKSEONGGWAN_2F));
                }
            }
        });
        a50211Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                for (String macAddress : T.a50211) {
                    WolSend.wolStart(new IPObjectSocket(macAddress, IPBrodcastList.DEOKSEONGGWAN_2F));
                }
            }
        });
    }
}
