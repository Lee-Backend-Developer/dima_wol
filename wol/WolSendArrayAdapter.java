package wol;

import wol.ip.list.IPBrodcastList;

public interface WolSendArrayAdapter {

    /**
     * 패킷 전송(복수) 구현 필수
     */
    static IPObjectSocket[] ipObjectSocket(String[] macAddress, String ipBroadcast) {
        IPObjectSocket[] ipObjectSockets = new IPObjectSocket[macAddress.length];
        for (int i = 0; i < macAddress.length; i++) {
            ipObjectSockets[i] = new IPObjectSocket(macAddress[i],ipBroadcast);
        }
        WolSend.wolStart(ipObjectSockets);
        return ipObjectSockets;
    }
    /**
     * 패킷 전송(한개) 구현 필수
     */
    static IPObjectSocket ipObjectSocket(String macAddress, String ipBroadcast) {
        IPObjectSocket ipObjectSocket = new IPObjectSocket(macAddress, ipBroadcast);
        WolSend.wolStart(ipObjectSocket);
        return ipObjectSocket;
    }
}
