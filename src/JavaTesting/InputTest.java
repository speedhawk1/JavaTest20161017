package JavaTesting;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import static java.lang.System.out;

/**
 * Created by Administrator on 2016/10/16.
 */
public class InputTest {
    public static void main(String[] args) {
        try {
            InputStream input = new FileInputStream("d:/Meine Lerhenen/myproject/Test1.txt");
//            StringBuffer sb = new StringBuffer();
            int i;
            while ((i = input.read()) != -1){
//                sb = sb.append(input.read());
//                out.print((char)(input.read()));
                out.print((char)i);
//                ++a;
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
