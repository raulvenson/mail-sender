package br.com.fallconn.mail.service;

import br.com.fallconn.mail.controller.sendMail.dto.MailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendMailService{

    @Autowired
    private JavaMailSender emailSender;

    public void sendSimpleMessage(
            MailDTO dto) {

        SimpleMailMessage message = new SimpleMailMessage();
//        message.setFrom("raulvenson@gmail.com.br");
        message.setTo("raulvenson@gmail.com");
        message.setSubject("Solicitação de contato via site fallconn.com.br");
        message.setText(dto.toEmail());
        emailSender.send(message);

        message.setTo("rafael.rosar@hotmail.com");
        emailSender.send(message);
    }
}