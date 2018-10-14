/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apoio;

import java.util.*;
import org.apache.log4j.Logger;;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

/**
 *
 * @author Morgana
 */
public class Email {
    
    private static Logger logger = Logger.getLogger(Email.class);

    public static void enviarEmail(String de, String para, String arquivo) {
        
        // Email de autenticação
        final String username = "morganabagatini@universo.univates.br";
        final String password = "@Wilde69";

        // Recipient's email ID needs to be mentioned.
        String to = para;

        // Sender's email ID needs to be mentioned
        String from = de;

        // Assuming you are sending email from localhost
        String host = "smtp.gmail.com";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.setProperty("mail.smtp.host", host);
        properties.setProperty("mail.smtp.socketFactory.port", "465");
        properties.setProperty("mail.smtp.port", "465");
        properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.setProperty("mail.smtp.auth", "true");

        // Get the default Session object.
        Authenticator aut = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        };

        Session session = Session.getDefaultInstance(properties, aut);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress("SmartAgro" + "<" + de + ">"));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("This is the Subject Line!");

            // Part two is attachment
            if (!arquivo.trim().isEmpty()) {
                // Create the message part 
                BodyPart messageBodyPart = new MimeBodyPart();

                // Fill the message
                messageBodyPart.setText("This is message body");

                // Create a multipar message
                Multipart multipart = new MimeMultipart();

                // Set text message part
                multipart.addBodyPart(messageBodyPart);
                
                messageBodyPart = new MimeBodyPart();
                String filename = arquivo;
                DataSource source = new FileDataSource(filename);
                messageBodyPart.setDataHandler(new DataHandler(source));
                messageBodyPart.setFileName(filename);
                multipart.addBodyPart(messageBodyPart);
            }

            // Send the actual HTML message, as big as you like
            message.setContent("<h1>This is actual message</h1>", "text/html");

            // Send message
            Transport.send(message);
            System.out.println("E-mail enviado com sucesso!");
        } catch (MessagingException mex) {
            mex.printStackTrace();
            logger.error("Erro ao enviar e-mail", mex);
        }
    }

}
