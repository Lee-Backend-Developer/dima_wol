package file;

import java.util.Objects;

public class FilePathExport {
    public static FilePathExport instance = new FilePathExport();

    private FilePathExport() {}

    public static FilePathExport getInstance() {
        return instance;
    }

    // 장소 이름에 따라서 파일 경로 가져오기
    // ex) 입력값은 30225로 했을 때
    public String roomPath(String location) {
        // 입력한 값 검증
        Objects.isNull(location);

        // 파일 경로 가져오기
        return switch (location) {
            // 기예관
            case "30225" -> FilePathCustom.A30225;
            case "30311" -> FilePathCustom.A30311;
            case "30323" -> FilePathCustom.A30323;

            case "giyegwan2f" -> FilePathCustom.GIYEGWAN_2F_BRODCAST;
            case "giyegwan3f" -> FilePathCustom.GIYEGWAN_3F_BRODCAST;

            // 덕성관
            case "50203" -> FilePathCustom.A50203;
            case "50204" -> FilePathCustom.A50204;
            case "50206" -> FilePathCustom.A50206;
            case "50209" -> FilePathCustom.A50209;
            case "50211" -> FilePathCustom.A50211;
            case "50305" -> FilePathCustom.A50305;
            case "50310" -> FilePathCustom.A50310;
            case "50408" -> FilePathCustom.A50408;

            case "deogseong2f" -> FilePathCustom.DEOGSEONG_2F_BRODCAST;
            case "deogseong3f" -> FilePathCustom.DEOGSEONG_3F_BRODCAST;
            case "deogseong4f" -> FilePathCustom.DEOGSEONG_4F_BRODCAST;

            // 디자인 센터
            case "100111" -> FilePathCustom.A100111;
            case "100116" -> FilePathCustom.A100116;
            case "100210" -> FilePathCustom.A100210;
            case "dijain1f" -> FilePathCustom.DIJAIN_1F_BRODCAST;
            case "dijain2f" -> FilePathCustom.DIJAIN_2F_BRODCAST;

            default -> "";
        };

    }
}
