package JavaTesting;

import java.io.*;

/**
 * Created by Administrator on 2016/10/16.
 */
public class BufferReadlineTest {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("c:/some_new.txt"))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
