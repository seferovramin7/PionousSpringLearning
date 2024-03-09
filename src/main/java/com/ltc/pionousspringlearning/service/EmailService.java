package com.ltc.pionousspringlearning.service;

import com.ltc.pionousspringlearning.dto.EmailDto;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import java.io.IOException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class EmailService {


//    private final JavaMailSender javaMailSender;
//
//    public void sendEmail(EmailDto emailDto) {
//        SimpleMailMessage msg = new SimpleMailMessage();
//        msg.setTo(emailDto.getTo());
//        msg.setFrom(emailDto.getFrom());
//        msg.setSubject(emailDto.getSubject());
//        msg.setText(emailDto.getMessage());
//        javaMailSender.send(msg);
//    }
//
//
//    public void sendEmailWithAttachment() throws MessagingException, IOException {
//        MimeMessage msg = javaMailSender.createMimeMessage();
//
//        MimeMessageHelper helper = new MimeMessageHelper(msg, true);
//        helper.setTo("seferovramin7@gmail.com");
//        helper.setFrom("seferovramin7@yahoo.com");
//        helper.setSubject("Testing from Spring Boot");
//
//
//        helper.setText("<h1>Check attachment for image!</h1>", true);
//
//
//        helper.addAttachment("ferrari.jpg", new ClassPathResource("ferrari.jpg"));
//
//        javaMailSender.send(msg);
//    }

}
