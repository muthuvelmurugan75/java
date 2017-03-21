package com.work.www;w
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

public class Emailsender {
public static boolean sendmail(String from,String password,String message, String to [] ){
	String host="smtp.gmail.com";
	Properties props=System.getProperties();
	props.put("mail.smtp.starttis.enable","true" );
	props.put("mail.smtp.host",host );
	props.put("mail.smtp.user",from );
	props.put("mail.smtp.password",password);
	props.put("mail.smtp.port",587);
	props.put("mail.smtp.auth","true");
	Session session=Session.getDefaultInstance(props,null);
	MimeMessage miMemessage=new MimeMessage(session);
	try{
	miMemessage.setFrom(new InternetAddress(from));
	InternetAddress[] toAddress=new InternetAddress[to.length];
	for(int i=0;i<to.length;i++){
		toAddress[i]=new InternetAddress(to[i]);
		
	}
	for(int i=0;i<toAddress.length;i++){
		miMemessage.addRecipient(RecipientType.TO,toAddress[i] );
		
	}
	miMemessage.setSubject("mail using javamail api");
	miMemessage.setText(message);
	Transport transport=session.getTransport("smtp");
	transport.connect(host,from,password);
	transport.send(miMemessage,miMemessage.getAllRecipients());
	transport.close();
	return true;
	
	}
	catch(MessagingException me){
		me.printStackTrace();
	}

	return false;
	
}
	
	
}
