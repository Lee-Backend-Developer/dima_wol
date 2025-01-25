package file;

import java.io.*;
import java.util.List;

public class FileRead {

    public void fileRead() throws IOException {
        File file = new File(FilePathCustom.A30225);

        BufferedReader fileBuffer = new BufferedReader(new FileReader(file));

        // 맥 주소, 브로드캐스트 주소를 어떻게 처리할 껏 인가,,,,


        fileBuffer
                .lines()
                .forEach(System.out::println);


        // 파일읽기 닫기
        fileBuffer.close();

    }

    public void macAddressFileRead(String location) throws IOException {



        File file = new File(FilePathCustom.A30225);

        BufferedReader fileBuffer = new BufferedReader(new FileReader(file));

        // 맥 주소, 브로드캐스트 주소를 어떻게 처리할 껏 인가,,,,
        // 1. 맥주소 맨 밑에 브로드캐스트 주소를 적는다 (?)
        // 2. 맥주소랑 브로드캐스트 주소를 따로 분리해서 저장한다.


        List<String> fileStrings = fileBuffer
                .lines()
                .toList();



        // 파일읽기 닫기
        fileBuffer.close();
    }
}
