package com.feihu.first.util;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Result implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1538956663431899980L;

	public static final int ERROR = 0;

	/***
	 * 后台传数代码的包结构
	 * 
	 * 
	 * 状态码
	 */

	private Integer status;
	/*
	 * 定义的消息头
	 */
	private Object head;
	/*
	 * 预留
	 * 
	 */
	private Object obligate;
	/*
	 * 实体数据
	 */
	private Object data;

	public Result(Integer status, Object head, Object data) {
		super();
		this.status = status;
		this.head = head;

		this.data = data;
	}

	public Result() {
		super();
	}

	public Object getStatus() {
		return status;
	}

	public Result setStatusReturnJs(Integer status) {
		this.status = status;
		return this;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Result setHeadReturnJs(Object head) {
		this.head = head;
		return this;

	}

	public Object getHead() {
		return head;
	}

	public void setHead(Object head) {
		this.head = head;
	}

	public Object getObligate() {
		return obligate;
	}

	public void setObligate(Object obligate) {
		this.obligate = obligate;
	}

	public Result setObligateReturnJs(Object obligate) {
		this.obligate = obligate;
		return this;

	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Result setDataReturnJs(Object data) {
		this.data = data;
		return this;

	}

	@Override
	public String toString() {
		return "JsonResult [resultTypeID=" + status + ", head=" + head + ", rowcount=" + obligate + ", data=" + data
				+ "]";
	}

	public Result(Object data) {
		super();
		this.data = data;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((head == null) ? 0 : head.hashCode());
		result = prime * result + ((obligate == null) ? 0 : obligate.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}

}
