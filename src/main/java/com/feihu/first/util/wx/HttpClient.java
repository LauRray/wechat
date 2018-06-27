package com.feihu.first.util.wx;
import com.alibaba.fastjson.JSONObject;  
import org.apache.http.HttpEntity;  
import org.apache.http.HttpResponse;  
import org.apache.http.NameValuePair;  
import org.apache.http.client.entity.UrlEncodedFormEntity;  
import org.apache.http.client.methods.HttpGet;  
import org.apache.http.client.methods.HttpPost;  
import org.apache.http.entity.StringEntity;  
import org.apache.http.impl.client.CloseableHttpClient;  
import org.apache.http.impl.client.HttpClients;  
import org.apache.http.message.BasicNameValuePair;  
import org.apache.http.util.EntityUtils;  
  
import java.io.IOException;  
import java.io.UnsupportedEncodingException;  
import java.util.ArrayList;  
import java.util.List;  
import java.util.Map;  
  
/** 
 * HttpClient客户端 
 * Created by itdragons on 2017-8-8. 
 */  
public class HttpClient {  
      
    /** 
     * post请求-json参数 
     */  
    public static String postHttp(String url, JSONObject paramJson) {  
        return postHttp(url, new StringEntity(paramJson.toString(),"UTF-8"));  
    }  
      
    /** 
     * post请求-参数 
     */  
    public static String postHttp(String url, Map<String, String> paramMap) throws UnsupportedEncodingException {  
        List<NameValuePair> params = new ArrayList<NameValuePair>();  
        if(paramMap != null){  
            for(Map.Entry<String,String> entry : paramMap.entrySet()){  
                params.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));  
            }  
        }  
        return postHttp(url, new UrlEncodedFormEntity(params, "UTF-8"));  
    }  
      
    /** 
     * post请求 
     */  
    private static String postHttp(String url, HttpEntity formEntity) {  
        CloseableHttpClient client = null;  
        HttpPost post = null;  
        String result = "";  
        try {  
            client = HttpClients.createDefault();  
            //HttpClient httpClient = new DefaultHttpClient();  
            post = new HttpPost(url);  
            post.setEntity(formEntity);  
            HttpResponse resp = client.execute(post);  
            HttpEntity entity = resp.getEntity();  
            result = EntityUtils.toString(entity, "UTF-8");  
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally {  
            //关闭连接，释放资源  
            //httpClient.getConnectionManager().shutdown();httpClient = null;  
            if (post != null) {  
                post.releaseConnection();  
            }  
            if (client != null) {  
                try {  
                    client.close();  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
        return result;  
    }  
  
    /** 
     * get请求 
     */  
    public static String getHttp(String url) {  
        CloseableHttpClient client = null;  
        HttpGet get = null;  
        String result = "";  
        try {  
            client = HttpClients.createDefault();  
            get = new HttpGet(url);  
            HttpResponse resp = client.execute(get);  
            HttpEntity entity = resp.getEntity();  
            result = EntityUtils.toString(entity, "UTF-8");  
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally {  
            //关闭连接，释放资源  
            if (get != null) {  
                get.releaseConnection();  
            }  
            if (client != null) {  
                try {  
                    client.close();  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
        return result;  
    }  
}  