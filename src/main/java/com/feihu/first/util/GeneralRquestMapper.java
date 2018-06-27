package com.feihu.first.util;

import java.util.List;
import java.util.Map;

import com.feihu.first.exception.ParameterNotFondException;

public class GeneralRquestMapper {
	public static String getStringPram(Map requestMap, String paramName, WhetherNull whetherNull) {
		if (whetherNull == whetherNull.CanNULL) {
			return String.valueOf(requestMap.get(paramName));
		} else {
			String a = String.valueOf(requestMap.get(paramName));
			if (a == null && a.trim().equals("")) {
				// 参数为空的时候
				throw new ParameterNotFondException("参数" + paramName + "为null或空");
			} else {
				return a;
			}

		}

	}

	public static Boolean gebooleanPram(Map requestMap, String paramName, WhetherNull whetherNull) {
		if (whetherNull == whetherNull.CanNULL) {

			return Boolean.valueOf(String.valueOf(requestMap.get(paramName)));
		} else {
			String a = String.valueOf(requestMap.get(paramName));
			if (a == null && a.trim().equals("")) {
				// 参数为空的时候
				throw new ParameterNotFondException("参数" + paramName + "为null或空");
			} else {
				return Boolean.valueOf(String.valueOf(requestMap.get(paramName)));
			}

		}

	}

	public static Integer getIntegerPram(Map requestMap, WhetherNull whetherNull) {
		return null;
	}

	public static Long getLongPram(Map requestMap, WhetherNull whetherNull) {
		return null;
	}

	public static Double getDoublePram(Map requestMap, WhetherNull whetherNull) {
		return null;
	}

	public static List getListPram(Map requestMap, WhetherNull whetherNull) {
		return null;
	}
}
