package com.ron.seekers.util;


import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.GzipDecompressingEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class HttpConnect {
    public static String send(String url) {
        try {
            HttpClient httpClient = new DefaultHttpClient();
            String responseContent = null;
            HttpPost httpPost = new HttpPost(url);
            httpPost.setHeader("Content-Type", "application/vnd.spring-boot.actuator.v2+json;charset=UTF-8");
//  httpPost.setHeader("Accept-Encoding", "gzip,deflate");//表示返回的数据是压缩的zip格式
            String postParam = "";//请求的参数内容
            StringEntity paramEntity = new StringEntity(postParam);//无参数名，只是参数内容
            httpPost.setEntity(paramEntity);
            HttpResponse response = httpClient.execute(httpPost);
            HttpEntity entity = response.getEntity();
            if (response.getStatusLine().getStatusCode() == 200) {
               return "true";
            }
        }catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "false";
    }
}
