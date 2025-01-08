package wol;

import wol.ip.list.IPBrodcastList;

public interface WolSendArrayAdapter {

    /**
     * 패킷 전송(복수) 구현 필수
     */
    static IPObjectSocket[] ipObjectSocket(String[] macAddress) {
        IPObjectSocket[] ipObjectSockets = new IPObjectSocket[macAddress.length];
        for (int i = 0; i < macAddress.length - 1; i++) {
            ipObjectSockets[i] = new IPObjectSocket(macAddress[i], IPBrodcastList.GIYEGWAN_2F);
        }
        WolSend.wolStart(ipObjectSockets);
        return ipObjectSockets;
    }
}
