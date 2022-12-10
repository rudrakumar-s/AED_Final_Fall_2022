/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 package Rental.Notification;
 
import java.util.Date;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

/**
 *
 * @author sunilrudrakumar
 */
public  class Email {
    
    
    public void sendMail(String msg,String item,String cid, String pid, String rid,  String fee, String rentd, String returnd, String email) throws Exception{
     Properties properties = new Properties();
     properties.put("mail.smtp.auth", "true");
     properties.put("mail.smtp.starttls.enable", "true");
     properties.put("mail.smtp.host", "smtp.gmail.com");
     properties.put("mail.smtp.port", "587");
     properties.put("mail.transport.protocol", "smtp");
     
     Session session = Session.getInstance(properties, new Authenticator(){
         @Override
         protected PasswordAuthentication getPasswordAuthentication(){
             return new PasswordAuthentication("sunilrudrakumar@gmail.com", "geqzwcaksdtslnkj");
         }         
     });
     
     Message message = new MimeMessage(session);
     message.setSubject( item + " Rental Service");
     
     
     Address toAddress = new InternetAddress(email);
     message.setRecipient(Message.RecipientType.TO, toAddress);
     
     MimeMultipart multipart = new MimeMultipart();   
     
     MimeBodyPart messageBody = new MimeBodyPart();
     
     messageBody.setContent("Rental Management" + "\n\n" + "------------------------------" + "\n" + "Customer ID :" + cid + "\n" + "Product ID: " + pid+ "\n" + "Return Date : " + returnd + "\n" + "Rent Date : " + rentd + "\n" + "Message :" + msg + "\n\n" + "------------------------------" + "\n" , "text/plain");

     multipart.addBodyPart(messageBody);
     message.setContent(multipart);
     Transport.send(message);         
    }

}

