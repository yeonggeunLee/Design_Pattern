package design_pattern.ch03.javaIO;

import java.io.*;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InputTest2 {

    public void method01() {
        InputStream resource = getClass().getClassLoader().getResourceAsStream("ch03/test.txt");                // resources 디렉토리 아래부터 작성. ch03의 text.txt
        try (InputStream is = new LowerCaseInputStream(resource)) {                         // close() 따로 필요없음. InputTest1처럼 명시적으로 close 해주던데 InputTest2 처럼 사용
            while (is.available() > 0) {                                                     // 일반적으로 inputStream 읽을 때는 'is.available()' 사용. 현재 몇 바이트 남아있는지 표현
                System.out.print((char) is.read());
            }
        } catch (IOException e) {
            System.out.println("오류 발생 : " + e.getMessage());
        }
    }

    public void method02() {
        URL url = this.getClass().getClassLoader().getResource("ch03/test.txt");
        if (url != null) {
            try (InputStream is = new LowerCaseInputStream(
                    new FileInputStream(url.getFile()))) {      // 파일명 반환. (경로 포함)
                while (is.available() > 0) {
                    System.out.print((char) is.read());
                }
            } catch(IOException ex){
                Logger.getLogger(InputTest2.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("url이 null입니다.");
        }
    }

    public static void main(String[] args)  throws  IOException{
        new InputTest2().method01();
        new InputTest2().method02();
    }
}
