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
    public String path(String location) {
        // 입력한 값 검증
        Objects.isNull(location);

        // 파일 경로 가져오기
        return switch (location) {
            // 기예관
            case "30225" -> FilePathCustom.A30225;
            case "30311" -> FilePathCustom.A30311;
            case "30323" -> FilePathCustom.A30323;

            // 덕성관
            case "50203" -> FilePathCustom.A50203;
            case "50204" -> FilePathCustom.A50204;
            case "50206" -> FilePathCustom.A50206;
            case "50209" -> FilePathCustom.A50209;
            case "50211" -> FilePathCustom.A50211;
            case "50305" -> FilePathCustom.A50305;
            case "50310" -> FilePathCustom.A50310;
            case "50408" -> FilePathCustom.A50408;

            // 디자인 센터
            case "100111" -> FilePathCustom.A100111;
            case "100116" -> FilePathCustom.A100116;
            case "100210" -> FilePathCustom.A100210;

            default -> "";
        };

    }
}
