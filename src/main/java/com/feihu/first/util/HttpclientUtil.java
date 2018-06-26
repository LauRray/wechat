package com.feihu.first.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;

import com.alibaba.fastjson.JSONObject;

public class HttpclientUtil {

	public static Object wechatLogin(String code, String appId, String appsecret) throws Exception {

		CloseableHttpClient HttpClient = HttpClients.createDefault();
		HttpPost post = new HttpPost("https://api.weixin.qq.com/sns/jscode2session");
		List<NameValuePair> list = new ArrayList<NameValuePair>();
		list.add(new BasicNameValuePair("appid", appId));
		list.add(new BasicNameValuePair("secret", appsecret));
		list.add(new BasicNameValuePair("js_code", code));
		list.add(new BasicNameValuePair("grant_type", "authorization_code"));
		System.out.println(list);
		// url格式编码
		UrlEncodedFormEntity uefEntity = new UrlEncodedFormEntity(list, "UTF-8");
		post.setHeader(new BasicHeader("Content-Type", "charset=utf-8"));
		post.setEntity(uefEntity);

		CloseableHttpResponse

		response = HttpClient.execute(post);
		System.out.println(response);
		HttpEntity entity = response.getEntity();
		String responseString = entity.toString();
		System.out.println(responseString);
 

		return responseString;

	}
	//
	// public static Object wechatLogin(String code, String appId, String appsecret)
	// throws Exception {
	// CloseableHttpClient HttpClient = HttpClients.createDefault();
	// HttpPost post = new HttpPost("https://api.weixin.qq.com/sns/jscode2session");
	// List<NameValuePair> list = new ArrayList<NameValuePair>();
	// list.add(new BasicNameValuePair("appid", appId));
	// list.add(new BasicNameValuePair("secret", appsecret));
	// list.add(new BasicNameValuePair("js_code", code));
	// list.add(new BasicNameValuePair("grant_type", "authorization_code"));
	//
	// /设置请求的报文头部的编码
	// get.setHeader(new BasicHeader("Content-Type",
	// "application/x-www-form-urlencoded; charset=utf-8"));

	// 设置期望服务端返回的编码
	// get.setHeader(new BasicHeader("Accept", "text/plain;charset=utf-8"));
	// // url格式编码
	// UrlEncodedFormEntity uefEntity = new UrlEncodedFormEntity(list, "UTF-8");
	// post.setEntity(uefEntity);
	//
	// CloseableHttpResponse
	//
	// response = HttpClient.execute(post);
	//
	// HttpEntity entity = response.getEntity();
	// String responseString = entity.toString();
	// System.out.println(responseString);
	// return responseString;
	// }

}
