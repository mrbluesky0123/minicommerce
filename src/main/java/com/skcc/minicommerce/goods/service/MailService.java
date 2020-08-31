package com.skcc.minicommerce.goods.service;

import com.skcc.minicommerce.goods.dto.MailDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class MailService {
    private JavaMailSender mailSender;
    private static final String FROM_ADDRESS = "YOUR_EMAIL_ADDRESS";

    public void mailSend() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("q90167@shinsegae.com");
        message.setFrom("donotreply@gmail.com");
        message.setSubject("Test mail");
        message.setText("This is a test mail");

        mailSender.send(message);
        log.debug("Mail sent.");
    }

}
