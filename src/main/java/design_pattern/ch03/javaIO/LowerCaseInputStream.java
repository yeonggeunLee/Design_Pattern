package design_pattern.ch03.javaIO;

import java.io.*;

public class LowerCaseInputStream  extends FilterInputStream {

    protected LowerCaseInputStream(InputStream in) {
        super(in);      // 중요! FilterInputStream으로 넘기기 위해서
    }

    /**
     *
     * @return 한 바이트를 읽어와서 소문자로 바꾸어준다, 리턴 타입은 int. 만약에 c가 -1이면 c를 그대로 사용 '-1'은 end of file을 뜯한다.
     * @throws IOException
     */
    @Override
    public int read() throws IOException{
        int c = super.read();       // 한 바이트 읽어온다.
        return (c == -1 ? c : Character.toLowerCase((char)c));
    }

    @Override
    public int read(byte[] b, int offset, int len) throws IOException{
        int result = super.read(b, offset, len);        // 전부 다 읽는다. byte 배열로 저장해서 처리
        for(int i = offset; i < offset + result; i++){
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }
}
