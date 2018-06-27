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
import com.feihu.first.util.wx.GetQRImge;
import com.feihu.first.util.wx.HttpClient;
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

	// 小程序的登录 需要使用appid和secret以及前段的code去获取登录着 的openid 以后该可以获取unicodeId 就是类似微信id一样的东西
	// 唯一的标识码
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

	// 第一次登录i 及没有给予小程序授权的情况下 需要解密一些东西
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

	// 保存微信模板的收货地址
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

	// 获取微信的taken 为了支付做准备 获取小程序码
	@RequestMapping(value = "/getWechatTaken")

	@ResponseBody
	public Result getWechatTaken() {
		System.out.println("=========令牌==========");
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("appid", APPID);
		params.put("secret", APPSECRET);

		Object jo = HttpsClientUtil.sendByHttp(params,
				"https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=" + APPID + "&secret="
						+ APPSECRET);

		System.out.println(jo);

		return new Result(500, "成功", jo);
	};

	// 获取小程序码 可获得的path参数长 但是次数有限
	@RequestMapping(value = "/getWechatQRCodeA")

	@ResponseBody
	public Result getWechatQRCodeFirst(@RequestBody Map requestMap) {
		String taken = GeneralRquestMapper.getStringPram(requestMap, "taken", WhetherNull.NOTNULL);
		String path = GeneralRquestMapper.getStringPram(requestMap, "path", WhetherNull.NOTNULL);
		System.out.println("=========令牌==========");
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("appid", APPID);
		params.put("secret", APPSECRET);
		params.put("path", path);
		/*
		 * 一下无所为的
		 */
		params.put("width", 430);
		params.put("auto_color", true);
		// params.put("line_color", {"r":"0","g":"0","b":"0"});

		params.put("is_hyaline", false);
		// Object jo = HttpsClientUtil.sendJsonByHttp(params,

		// "https://api.weixin.qq.com/wxa/getwxacode?access_token=" + APPID + taken);
		String map = GetQRImge.getminiqrQrA(taken, params);
		System.out.println(map);

		return new Result(500, "成功", map);
	};

	// 获取小程序码 path较短 可是次数无线
	@RequestMapping(value = "/getWechatQRCodeB")

	@ResponseBody
	public Result getWechatQRCodeSec(@RequestBody Map requestMap) {
		String taken = GeneralRquestMapper.getStringPram(requestMap, "taken", WhetherNull.NOTNULL);
		String path = GeneralRquestMapper.getStringPram(requestMap, "path", WhetherNull.NOTNULL);
		/*
		 * 一些特殊的业务信息
		 */
		String scene = GeneralRquestMapper.getStringPram(requestMap, "scene", WhetherNull.NOTNULL);
		System.out.println("=========令牌==========");
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("appid", APPID);
		params.put("secret", APPSECRET);
		params.put("path", path);
		params.put("scene", scene);

		/*
		 * 一下无所为的
		 */
		params.put("width", 430);
		params.put("auto_color", true);
		// params.put("line_color", {"r":"0","g":"0","b":"0"});

		params.put("is_hyaline", false);
		Object jo = HttpsClientUtil.sendByHttp(params,
				"https://api.weixin.qq.com/wxa/getwxacodeunlimit?access_token=ACCESS_TOKEN" + taken);

		System.out.println(jo);

		return new Result(500, "成功", jo);
	};

	// 获取小程序码 适用于需要的码数量较少的业务场景
	@RequestMapping(value = "/getWechatQRCodeC")

	@ResponseBody
	public Result getWechatQRCodeC(@RequestBody Map requestMap) {
		String path = GeneralRquestMapper.getStringPram(requestMap, "path", WhetherNull.NOTNULL);
		String taken = GeneralRquestMapper.getStringPram(requestMap, "taken", WhetherNull.NOTNULL);
		System.out.println("=========令牌==========");
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("appid", APPID);
		params.put("path", path);
		params.put("secret", APPSECRET);

		Object jo = HttpsClientUtil.sendByHttp(params,
				"https://api.weixin.qq.com/cgi-bin/wxaapp/createwxaqrcode?access_token=" + taken);

		System.out.println(jo);

		return new Result(500, "成功", jo);
	};
}
