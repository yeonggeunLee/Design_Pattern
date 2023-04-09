package design_pattern.ch03.javaIO;

import java.io.*;

public class InputTest {
    public static void main(String[] args) throws IOException {
        // 어디서 프로그램이 실행되고 있느냐를 기준으로 상대경로를 잡아야한다.
        System.out.println("File.getPath() : " + new java.io.File(".").getPath());          // '.' 은 현재폴더 의미
        System.out.println("File.getAbsolutePath() : " + new java.io.File(".").getAbsolutePath());
        System.out.println("File.getCanonicalPath() : " + new java.io.File(".").getCanonicalPath());

        //System.out.print("Working Directory = %s\n" , System.getProperties());
        System.out.println("-------------------------------------------");

        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(            // 버퍼링 사용 시 효율적으로 동작
                                    new FileInputStream("./src/main/resources/ch03/test.txt")));

            int c;
            while ((c = in.read()) >= 0){
                System.out.print((char) c);
            }

            in.close();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
