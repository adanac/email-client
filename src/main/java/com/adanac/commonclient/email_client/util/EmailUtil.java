package com.adanac.commonclient.email_client.util;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.adanac.commonclient.email_client.dto.EmailInfo;

/**
 * 发送邮件方法
 */
public class EmailUtil {

	/**
	 * 发送邮件
	 */
	public static Boolean sendEmail(EmailInfo emailInfo) {
		Boolean b = false;
		try {
			Properties properties = new Properties();
			properties.setProperty("mail.transport.protocol", emailInfo.getSmtp());// 发送邮件协议
			properties.setProperty("mail.smtp.auth", "true");// 需要验证

			Session session = Session.getInstance(properties);
			session.setDebug(true);// debug模式

			// 邮件信息
			Message messgae = new MimeMessage(session);
			messgae.setSubject(emailInfo.getSubject());// 设置邮件主题
			messgae.setFrom(new InternetAddress(emailInfo.getMyEmail()));// 发送人
			messgae.setContent(emailInfo.getContent(), "text/html;charset=UTF-8");// 邮件内容

			// 发送邮件
			Transport tran = session.getTransport();
			tran.connect(emailInfo.getHost(), 25, emailInfo.getMyEmail(), emailInfo.getMyPw());// 连接到邮箱服务器
			tran.sendMessage(messgae, new Address[] { new InternetAddress(emailInfo.getToEmail()) });// 设置邮件接收人
			tran.close();
			b = true;
		} catch (AddressException e) {
			e.printStackTrace();
		} catch (NoSuchProviderException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		return b;
	}

}
