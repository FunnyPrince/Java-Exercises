package com.day27;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 * @author FunnyPrince_
 * @date 2021/5/2 - 21:45
 *
 * 注意：运行要打开tomcat！
 */
public class URLTest1 {
    public static void main(String[] args) {
        HttpURLConnection urlConnection = null;
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            URL url = new URL("http://localhost:8080//examples/chengxiao.jpg");
            urlConnection = (HttpURLConnection) url.openConnection();

            urlConnection.connect();
            is = urlConnection.getInputStream();
            fos = new FileOutputStream("chengxiaoURL.jgp");//main()下输出在project下

            byte[] buffer = new byte[1024];
            int len;
            while((len = is.read(buffer)) != -1){
                fos.write(buffer,0,len);

            }
            System.out.println("下载完成！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(urlConnection != null){
                    urlConnection.disconnect();
            }
        }

    }
}
