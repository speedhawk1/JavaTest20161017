package JavaTesting;

import java.io.*;

/**
 * Created by Administrator on 2016/10/16.
 */
public class BufferIOTest {
    public static void main(String[] args) {
        try(Reader reader = new BufferedReader(new FileReader("c:/some_new.txt"));
        Writer writer = new BufferedWriter(new FileWriter("c:/some_new_new.txt"))) {
            int i;
            while((i = reader.read()) != -1){
                writer.write(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
