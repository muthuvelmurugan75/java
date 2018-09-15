package com.java.practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;
import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.*;

class EmailUtil {

    /**
     * Utility method to send simple HTML email
     *
     * @param session
     * @param toEmail
     * @param subject
     * @param body
     */
    public static void sendEmail(Session session, String toEmail, String subject, String body) {
        try {
            MimeMessage msg = new MimeMessage(session);
            //set message headers
            msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
            msg.addHeader("format", "flowed");
            msg.addHeader("Content-Transfer-Encoding", "8bit");

            msg.setFrom(new InternetAddress("abc@xyz.com", "NoReply-JD"));

            msg.setReplyTo(InternetAddress.parse("abc@xyz.com", false));

            msg.setSubject(subject, "UTF-8");

            msg.setText(body, "UTF-8");

            msg.setSentDate(new Date());

            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
            System.out.println("\nSending Mail Now...");
            Transport.send(msg);

            System.out.println("\nEMail Sent Successfully!");
        } catch (Exception e) {
            e.printStackTrace();

        }

    }
    public static void sendAttachmentEmail(Session session, String toEmail, String subject, String body){
        try{
            MimeMessage msg = new MimeMessage(session);
            msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
            msg.addHeader("format", "flowed");
            msg.addHeader("Content-Transfer-Encoding", "8bit");
            
            msg.setFrom(new InternetAddress("jn1772@gmail.com", "Your friend"));
            msg.setReplyTo(InternetAddress.parse("jn1772@gmail.com", false));
            msg.setSubject(subject, "UTF-8");
            msg.setSentDate(new Date());
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
            
            //Create the message body part
            BodyPart messageBodyPart = new MimeBodyPart();
            
            //Fill the message body part
            messageBodyPart.setText(body);
            
            //Create a multipart message for attachment
            Multipart multipart = new MimeMultipart();
            
            //Set text message part
            multipart.addBodyPart(messageBodyPart);
            
            //second part is attachment
            messageBodyPart = new MimeBodyPart();
            System.out.println("File path: ");
                
            String filename = "";
            try{
            filename = new BufferedReader(new InputStreamReader(System.in)).readLine();
            }catch(IOException e){
                System.out.println("Error while reading filename");
            }
            
            DataSource source = new FileDataSource(filename);   //filename is the loation of the file here
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName("Attached File");
            
            //add the second part 
            multipart.addBodyPart(messageBodyPart);
            
            //Set the content
            msg.setContent(multipart);
            
            System.out.println("Attaching Files...");
            //Send message
            Transport.send(msg);
            System.out.println("EMail Sent Successfully with attachment!");
        }catch(MessagingException e){
            e.printStackTrace();
        }catch(UnsupportedEncodingException e){
            e.printStackTrace();
        } 
    }
    public static void sendImageEmail(Session session, String toEmail, String subject, String body){
        try{
            MimeMessage msg = new MimeMessage(session);
            msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
            msg.addHeader("format", "flowed");
            msg.addHeader("Content-Transfer-Encoding", "8bit");
            
            msg.setFrom(new InternetAddress("abc@xyz.com", "SomeOne"));
            
            msg.setReplyTo(InternetAddress.parse("no_reply@nowhere.com", false));
            
            msg.setSubject(subject, "UTF-8");
            
            msg.setSubject(subject, "UTF-8");
            
            msg.setSentDate(new Date());
            
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
            
            //Create the message body part
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            
            messageBodyPart.setText(body);
            
            //Create a multipart message for attachment
            Multipart multipart = new MimeMultipart();
            
            //set text messsage part
            multipart.addBodyPart(messageBodyPart);
            
            //Second part is image attachment
            messageBodyPart = new MimeBodyPart();
            System.out.println("Image Path: ");
            String image="";
            try{
            image = new BufferedReader(new InputStreamReader(System.in)).readLine();
            }catch(IOException e){
                System.out.println("Image could not be read");
            }
            
            DataSource source = new FileDataSource(image);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName("Embedded Image");
            
            //Set "Content-ID"
           
            messageBodyPart.setContentID("<image_id>");
            messageBodyPart.setDisposition(MimeBodyPart.INLINE);
            multipart.addBodyPart(messageBodyPart);
            
            //display the image in the email body
            messageBodyPart = new MimeBodyPart();
            messageBodyPart.setContent("<h1>Attached Image</h1><img src=\"cid:image_id\">","text/html");
            multipart.addBodyPart(messageBodyPart);
            
            //set the multipart message to the email message
            msg.setContent(multipart);
            
            System.out.println("Inserting Image...");
            Transport.send(msg);
            System.out.println("EMail sent successfully! [Image]");
        }catch(MessagingException e){
            e.printStackTrace();
        }catch(UnsupportedEncodingException e){
            e.printStackTrace();
        }
    }
}

public class Email_attach_imagesuccess {

    /**
     * Outgoing Mail (SMTP) Server requires TLS or SSL: smtp.gmail.com (use
     * authentication) Use Authentication: Yes Port for SSL: 465
     */
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your GMail id: ");
        final String fromEmail = br.readLine(); //requires valid gmail id
        System.out.println("Password: ");
        final String password = br.readLine(); // correct password for gmail id
        System.out.println("Send To: ");
        final String toEmail = br.readLine(); // can be any email id 

        System.out.println("\nSSL Email [Start]");
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
        props.put("mail.smtp.socketFactory.port", "465"); //SSL Port
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory"); //SSL Factory Class
        props.put("mail.smtp.auth", "true"); //Enabling SMTP Authentication
        props.put("mail.smtp.port", "465"); //SMTP Port
        props.put("mail.smtp.connectiontimeout", "5000");
        props.put("mail.smtp.timeout", "5000");
        Authenticator auth = new Authenticator() {
            //override the getPasswordAuthentication method
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        };

        Session session = Session.getDefaultInstance(props, auth);
        System.out.println("[Session created]");
        System.out.println("Subject: ");
        String subject = br.readLine();
        System.out.println("Body: [newline \"X\" ends the input]");
        String temp = "";
        String body="";
        while(!(temp=br.readLine()).equalsIgnoreCase("X")){
            body+=temp;
        }
        String choice = "";
        System.out.println("Insert an image?(y/n): ");
        choice = br.readLine();
        if(choice.equalsIgnoreCase("yes")|choice.equalsIgnoreCase("y"))
            EmailUtil.sendImageEmail(session, toEmail, subject, body);
        else
        {System.out.println("Add a file attachment?(y/n): ");
        choice = br.readLine();
        if(choice.equalsIgnoreCase("yes")|choice.equalsIgnoreCase("y"))
            EmailUtil.sendAttachmentEmail(session, toEmail, subject, body);
        else
            EmailUtil.sendEmail(session, toEmail, subject, body);
        }
    }
}