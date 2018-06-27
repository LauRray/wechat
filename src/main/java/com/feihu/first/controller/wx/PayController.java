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
@RequestMapping("/wx/core")

@Transactional(rollbackFor = Exception.class)
public class PayController extends AbstractController {
	@Resource
  
	/**
	 * wx支付模拟
	 * 
	 * @param requestMap
	 * @param session
	 * @param request
	 * @param response
	 * @return
	 */

	// 小程序的登录 需要使用appid和secret以及前段的code去获取登录着 的openid 以后该可以获取unicodeId 就是类似微信id一样的东西
	// 唯一的标识码
	@RequestMapping(value = "/pay")

	@ResponseBody
	public Result Pay(@RequestBody Map requestMap, HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {

		return new Result(500, "成功", 11);
	};

}
