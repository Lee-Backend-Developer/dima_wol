package file;

import java.io.*;

public class FileRead {

    public void fileRead() throws IOException {
        File file = new File(FilePathCustom.A30225);

        BufferedReader fileBuffer = new BufferedReader(new FileReader(file));

        // 1. 줄 마다 맥 주소를 저장한다. (사용자)
        // 2. 줄 마다 맥 주소를 가져온다. (내가 개발 몫)

        fileBuffer
                .lines()
                .forEach(System.out::println);


        // 파일읽기 닫기
        fileBuffer.close();

    }
}
