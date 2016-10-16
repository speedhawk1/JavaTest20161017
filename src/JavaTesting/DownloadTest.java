package JavaTesting;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Administrator on 2016/10/16.
 */
public class DownloadTest {
    public static void main(String[] args) {
        try {
            URL url = null;
            try {
                url = new URL("http://jandan.net/tag/%E5%A4%A9%E6%96%87");
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            try {
                try(Reader reader = new BufferedReader(new InputStreamReader(url.openStream())){

                    }
            }catch (IOException e) {
                e.printStackTrace();
            }
    }
}
