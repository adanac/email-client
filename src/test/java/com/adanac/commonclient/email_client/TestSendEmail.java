package com.adanac.commonclient.email_client;

import com.adanac.commonclient.email_client.dto.EmailInfo;
import com.adanac.commonclient.email_client.util.EmailUtil;

/**
 * 发送邮件demo
 * @author adanac
 *
 */
public class TestSendEmail {

	public static void main(String[] args) {
		EmailInfo emailInfo = new EmailInfo();
		emailInfo.setSubject("邮件主题1");
		emailInfo.setToEmail("xxx@qq.com");
		emailInfo.setContent("邮件内容1");
		EmailUtil.sendEmail(emailInfo);
	}

}
