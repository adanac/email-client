package com.adanac.commonclient.email_client.dto;

import java.io.Serializable;

/**
 * 发送邮件相关参数
 */
public class EmailInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8683595306894520835L;

	/**
	 * 发送服务器
	 */
	private String host = "smtp.ym.163.com";

	/**
	 * 邮件协议
	 */
	private String smtp = "smtp";

	/**
	 * 发送者账号
	 */
	private String myEmail = "babyshop@bizcent.com";

	/**
	 * 发送者密码
	 */
	private String myPw = "babyshop";

	/**
	 * 邮件主题
	 */
	private String subject;

	/**
	 * 邮件内容
	 */
	private String content;

	/**
	 * 收件人邮箱
	 */
	private String toEmail;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getToEmail() {
		return toEmail;
	}

	public void setToEmail(String toEmail) {
		this.toEmail = toEmail;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getSmtp() {
		return smtp;
	}

	public void setSmtp(String smtp) {
		this.smtp = smtp;
	}

	public String getMyEmail() {
		return myEmail;
	}

	public void setMyEmail(String myEmail) {
		this.myEmail = myEmail;
	}

	public String getMyPw() {
		return myPw;
	}

	public void setMyPw(String myPw) {
		this.myPw = myPw;
	}

}
