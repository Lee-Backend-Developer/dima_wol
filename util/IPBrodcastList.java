package util;

public enum IPBrodcastList {
    // 기예관 2층
    GIYEGWAN_2F("172.20.32.255"),

    // 기예관 3층
    GIYEGWAN_3F("172.20.33.255"),

    // 덕성관 2층
    DEOKSEONGGWAN_2F("172.20.42.255"),

    // 덕성관 3층
    DEOKSEONGGWAN_3F("172.20.43.255"),

    // 디자인센터 1층,2층
    DIJAINCENTER_1F_2F("172.20.51.255");

    private final String location;

    IPBrodcastList(String location) {
        this.location = location;
    }

    String getLocation() {
        return location;
    }
}
