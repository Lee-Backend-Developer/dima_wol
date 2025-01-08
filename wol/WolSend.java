package wol;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * WOL이 작동이 되는 원리
 * FF FF FF FF FF FF -> 6Bytes
 * MAC Addr -> 48Bits(6Bytes)
 *
 * FF FF FF FF FF FF + MAC Addr * 16
 * 6 Byte + (6 Byte * 16) = 102 Byte
 *
 */
class WolSend {
    // WOL PORT
    private static final int PORT = 9;

    // WOL 패킷 전송(단일)
    public static void wolStart(IPObjectSocket ipObjectSocket) {
        try {
            byte[] macBytes = ipObjectSocket.getMacBytes();

            byte[] bytes = addHexFF(ipObjectSocket.getMacBytes());

            for (int i = 6; i < bytes.length; i += macBytes.length) {
                System.arraycopy(macBytes, 0, bytes, i, macBytes.length);
            }

            packetSend(ipObjectSocket, bytes);

            System.out.println("Wake-on-LAN packet sent.");
        }
        catch (Exception e) {
            System.out.println("Failed to send Wake-on-LAN packet: + e");
            System.exit(1);
        }
    }
    // // WOL 패킷 전송(복수)
    public static void wolStart(IPObjectSocket[] ipObjectSockets) {
        try {
            for (IPObjectSocket ipObjectSocket : ipObjectSockets) {

                byte[] bytes = addHexFF(ipObjectSocket.getMacBytes());

                for (int i = 6; i < bytes.length; i += ipObjectSocket.getMacBytes().length) {
                    System.arraycopy(ipObjectSocket.getMacBytes(), 0, bytes, i, ipObjectSocket.getMacBytes().length);
                }

                packetSend(ipObjectSocket, bytes);
            }

            System.out.println("Wake-on-LAN packet sent.");
        }
        catch (Exception e) {
            System.out.println("Failed to send Wake-on-LAN packet: + e");
            System.exit(1);
        }
    }

    // 패킷 전송
    private static void packetSend(IPObjectSocket ipObjectSocket, byte[] sendPacket) throws IOException {
        InetAddress address = InetAddress.getByName(ipObjectSocket.getIpBroadcast());
        DatagramPacket packet = new DatagramPacket(sendPacket, sendPacket.length, address, PORT);
        DatagramSocket socket = new DatagramSocket();
        socket.send(packet);
        socket.close();
    }

    /**
     * 패킷 앞부분에 ff ff ff ff ff ff를 추가
     */
    private static byte[] addHexFF(byte[] macAddressArray) {

        byte[] bytes = new byte[6 + 16 * macAddressArray.length];
        for (int i = 0; i < 6; i++) {
            bytes[i] = (byte) 0xff; // ff 패킷을 생성함
        }
        return bytes;
    }


}
