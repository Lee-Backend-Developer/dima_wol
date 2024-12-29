package wol;

import ip.list.IPBrodcastList;

public class IPObjectSocket {

    private final String macAddr;
    private final byte[] macBytes;
    private final IPBrodcastList ipBrodcastList;

    public IPObjectSocket(String macAddr, IPBrodcastList ipBrodcastList) {
        validationMacAddr(macAddr); // 맥주소 유효성 검사

        this.macAddr = macAddr;
        this.macBytes = getMacBytes(macAddr);
        this.ipBrodcastList = ipBrodcastList;
    }

    public String getMacAddr() {
        return macAddr;
    }

    public String getIpBroadcast() {
        return ipBrodcastList.getLocation();
    }

    public byte[] getMacBytes() {
        return macBytes;
    }

    private void validationMacAddr(String macAddr) {
        String[] macArr = macAddr.split("([:\\-])");

        if(macArr.length != 6) {
            throw new IllegalArgumentException("맥 주소는 6자리여야 합니다.");
        }
    }

    private byte[] getMacBytes(String macAddr) {
        String[] macArr = macAddr.split("([:\\-])");

        byte[] bytes = new byte[6];
        for (int i = 0; i < 6; i++) {
            bytes[i] = (byte) Integer.parseInt(macArr[i], 16);
        }

        return bytes;
    }
}
