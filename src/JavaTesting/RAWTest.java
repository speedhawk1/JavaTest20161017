package JavaTesting;

import java.io.*;
import java.util.Vector;

/**
 * Created by Administrator on 2016/10/16.
 */
public class RAWTest {
    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream("C:/some.txt");
             OutputStream outputStream = new FileOutputStream("C:/some_new.txt")
        ) {
            int i;
            while((i = inputStream.read()) != -1){
                outputStream.write(i);
            }
        }
//            int i;
//            String
//            while((i = inputStream.read()) != -1){
//                System.out.print((char)i);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }try(OutputStream outputStream = new FileOutputStream("C:/some_new.txt")){
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}