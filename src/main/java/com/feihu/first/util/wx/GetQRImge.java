package com.feihu.first.util.wx;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.protocol.HTTP;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.feihu.first.exception.CommunicationException;

public class GetQRImge {
	public static String getminiqrQrA(String accessToken, Map<String, Object> params) {
		// 获取token
		String filename = "";
		String access_token = accessToken;
		if (accessToken != null) {
			try {

				System.out.println("token为");
				System.out.println(access_token);

				CloseableHttpClient httpClient = HttpClientBuilder.create().build();

				HttpPost httpPost = new HttpPost(
						"https://api.weixin.qq.com/wxa/getwxacodeunlimit?access_token=" + access_token);
				httpPost.addHeader(HTTP.CONTENT_TYPE, "application/json");
				String body = JSON.toJSONString(params);
				StringEntity entity;
				entity = new StringEntity(body);
				entity.setContentType("image/png");

				httpPost.setEntity(entity);
				HttpResponse response;

				response = httpClient.execute(httpPost);
				InputStream inputStream = response.getEntity().getContent();
				Date a = new Date();
				filename = String.valueOf(a.getTime());
				String path = "C:\\Users\\Administrator\\Desktop\\aaa\\";
				File targetFile = new File(path);

				if (!targetFile.exists()) {
					targetFile.mkdirs();
				}
				FileOutputStream out = new FileOutputStream(path + filename);

				byte[] buffer = new byte[8192];
				int bytesRead = 0;
				while ((bytesRead = inputStream.read(buffer, 0, 8192)) != -1) {
					out.write(buffer, 0, bytesRead);
				}

				out.flush();
				out.close();
			} catch (Exception e) {
				throw new CommunicationException(e);
			}
		} else {
			System.out.println("获取access_token错误");
		}
		return "" + filename;
	}

	public Map getminiqrQrB(String sceneStr, String accessToken) {
		RestTemplate rest = new RestTemplate();
		InputStream inputStream = null;
		OutputStream outputStream = null;
		try {
			String url = "https://api.weixin.qq.com/wxa/getwxacodeunlimit?access_token=" + accessToken;
			Map<String, Object> param = new HashMap<>();
			param.put("scene", sceneStr);
			param.put("page", "pages/index/index");
			param.put("width", 430);
			param.put("auto_color", false);
			Map<String, Object> line_color = new HashMap<>();
			line_color.put("r", 0);
			line_color.put("g", 0);
			line_color.put("b", 0);
			param.put("line_color", line_color);
			System.out.println("调用生成微信URL接口传参:" + param);
			MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
			HttpEntity requestEntity = new HttpEntity(param, headers);
			ResponseEntity<byte[]> entity = rest.exchange(url, HttpMethod.POST, requestEntity, byte[].class,
					new Object[0]);
			System.out.println("调用小程序生成微信永久小程序码URL接口返回结果:" + entity.getBody());
			byte[] result = entity.getBody();
			System.out.println(Base64.encodeBase64String(result));
			inputStream = new ByteArrayInputStream(result);

			File file = new File("C:/Users/wangqiulin/Desktop/1.png");
			if (!file.exists()) {
				file.createNewFile();
			}
			outputStream = new FileOutputStream(file);
			int len = 0;
			byte[] buf = new byte[1024];
			while ((len = inputStream.read(buf, 0, 1024)) != -1) {
				outputStream.write(buf, 0, len);
			}
			outputStream.flush();
		} catch (Exception e) {
			throw new CommunicationException(e);
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	public Map getminiqrQrC(String accessToken) {
		RestTemplate rest = new RestTemplate();
		InputStream inputStream = null;
		OutputStream outputStream = null;
		try {
			String url = "https://api.weixin.qq.com/wxaapp/createwxaqrcode?access_token=" + accessToken;
			Map<String, Object> param = new HashMap<>();
			param.put("page", "pages/index/index");
			param.put("width", 430);
			System.out.println("调用生成微信URL接口传参:" + param);
			MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
			HttpEntity requestEntity = new HttpEntity(param, headers);
			ResponseEntity<byte[]> entity = rest.exchange(url, HttpMethod.POST, requestEntity, byte[].class,
					new Object[0]);
			System.out.println("调用小程序生成微信永久二维码URL接口返回结果:" + entity.getBody());
			byte[] result = entity.getBody();
			System.out.println(Base64.encodeBase64String(result));
			inputStream = new ByteArrayInputStream(result);

			File file = new File("C:/Users/wangqiulin/Desktop/1.png");
			if (!file.exists()) {
				file.createNewFile();
			}
			outputStream = new FileOutputStream(file);
			int len = 0;
			byte[] buf = new byte[1024];
			while ((len = inputStream.read(buf, 0, 1024)) != -1) {
				outputStream.write(buf, 0, len);
			}
			outputStream.flush();
		} catch (Exception e) {
			throw new CommunicationException(e);
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}
}
