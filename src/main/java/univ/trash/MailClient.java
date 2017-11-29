package univ.trash;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Component;


public class MailClient {
    private JavaMailSender mailSender;

    @Autowired
    public MailClient(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }


    public void sendMail(String email,String title, String text) {
            MimeMessagePreparator messagePreparator = mimeMessage -> {
                MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage);
                messageHelper.setTo(email);
                messageHelper.setSubject(title);

                messageHelper.setText(text);
            };
            try {
                mailSender.send(messagePreparator);
            } catch (MailException e) {
                e.printStackTrace();
            }

    }

}
