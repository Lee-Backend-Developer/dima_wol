package file;

import java.io.*;
import java.util.List;

public class FileRead {

    // 파일에서 맥주소를 가지고 온다.
    public static List<String> fileRead(String location) {

        List<String> fileStrings = null;
        try {
            String path = FilePathExport.getInstance()
                    .roomPath(location);

            if(path.isEmpty()) {
                throw new FileNotFoundException("존재하지 않는 파일 이름 입니다.");
            }

            File file = new File(path);

            BufferedReader fileBuffer = new BufferedReader(new FileReader(file));

            // 맥 주소, 브로드캐스트 주소를 어떻게 처리할 껏 인가,,,,
            // 1. 맥주소 맨 밑에 브로드캐스트 주소를 적는다 (?)
            // 2. 맥주소랑 브로드캐스트 주소를 따로 분리해서 저장한다.


            fileStrings = fileBuffer
                    .lines()
                    .toList();

            // 파일읽기 닫기
            fileBuffer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return fileStrings;
    }
}
