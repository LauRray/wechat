package com.feihu.first.controller.wx;

import org.apache.commons.codec.digest.DigestUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.http.message.BasicNameValuePair;
import org.springframework.stereotype.Controller;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.feihu.first.controller.AbstractController;
import com.feihu.first.exception.CommunicationException;
import com.feihu.first.service.wx.WxloginService;
import com.feihu.first.util.GeneralRquestMapper;

import com.feihu.first.util.HttpsClientUtil;
import com.feihu.first.util.Result;
import com.feihu.first.util.WhetherNull;
import com.feihu.first.util.wx.WXCore;

@Controller
@RequestMapping("/wx")

@Transactional(rollbackFor = Exception.class)
public class WxloginController extends AbstractController {
	@Resource
	WxloginService wxloginService;

	public static String APPID;
	public static String APPSECRET;
	public static String CONTEXTPATH;

	static {
		try {
			Properties Properties = new Properties();

			InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("wx/wx.properties");

			Properties.load(in);
			APPID = Properties.getProperty("AppID");
			System.out.println(APPID);
			APPSECRET = Properties.getProperty("AppSecret");
			System.out.println(APPSECRET);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// @RequestMapping(value = "/login", consumes = "application/json", produces =
	// "application/json")
	/**
	 * wx登录请求
	 * 
	 * @param requestMap
	 * @param session
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/login")

	@ResponseBody
	public Result login(@RequestBody Map requestMap, HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {
		String code = GeneralRquestMapper.getStringPram(requestMap, "code", WhetherNull.CanNULL);
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("appid", APPID);
		params.put("secret", APPSECRET);
		params.put("js_code", code);
		params.put("grant_type", "authorization_code");
		JSONObject jo = HttpsClientUtil.sendByHttpJsonObject(params, "https://api.weixin.qq.com/sns/jscode2session");
		session.setAttribute("openId", jo.get("openid"));
		session.setAttribute("session_key", jo.get("session_key"));

		CONTEXTPATH = request.getContextPath();

		String SessionId = session.getId();
		System.out.println(SessionId);

		return new Result(500, "成功", jo).setObligateReturnJs(SessionId);
	};

	@RequestMapping(value = "/firstlog")

	@ResponseBody
	public Result getuserinfo(@RequestBody Map requestMap, HttpSession session) {

		System.out.println("FirstLogin");

		Map<String, Object> map = (Map<String, Object>) requestMap.get("detail");

		String encryptedData = String.valueOf(map.get("encryptedData"));

		String iv = String.valueOf(map.get("iv"));

		String date = WXCore.decrypt(APPID, encryptedData, String.valueOf(session.getAttribute("session_key")), iv);

		System.out.println(date);
		return new Result(500, "成功", date);

	};
	@RequestMapping(value = "/getuserphonenum")

	@ResponseBody
	public Result getuserphonenum(@RequestBody Map requestMap, HttpSession session) {

		System.out.println("FirstLogin");

		Map<String, Object> map = (Map<String, Object>) requestMap.get("detail");

		String encryptedData = String.valueOf(map.get("encryptedData"));

		String iv = String.valueOf(map.get("iv"));

		String date = WXCore.decrypt(APPID, encryptedData, String.valueOf(session.getAttribute("session_key")), iv);

		System.out.println(date);
		return new Result(500, "成功", date);

	};
	@RequestMapping(value = "/getwechataddress")

	@ResponseBody
	public Result getwechataddress(@RequestBody Map requestMap, HttpSession session) {

		System.out.println("FirstLogin");

		Map<String, Object> map = (Map<String, Object>) requestMap.get("detail");

		String encryptedData = String.valueOf(map.get("encryptedData"));

		String iv = String.valueOf(map.get("iv"));

		String date = WXCore.decrypt(APPID, encryptedData, String.valueOf(session.getAttribute("session_key")), iv);

		System.out.println(date);
		return new Result(500, "成功", date);

	};
}
