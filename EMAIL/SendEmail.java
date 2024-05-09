package EMAIL;

import java.util.Properties;

public class SendEmail {
    public static <Session> void main(String[] args) throws Exception{
        
        String from = "me23@gmail.com";
        String to = "you23@gmail.com";
        String host = "localhost";
        
        Properties props = System.getProperties();
        props.setProperty("mail.smtp.host",host);

        Session ssn = Session.getDefaultInstance(props);

        MimeMessage msg = new MimeMEssage(ssn);
        msg.setFrame(new InternetAddress(from));
        msg.addWindowListener
        msg.setSubject("Urgent");
        msg.setText("Hello");
        Transport.send(msg);
    }

}
