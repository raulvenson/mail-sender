package br.com.fallconn.mail.controller.sendMail;

import br.com.fallconn.mail.controller.sendMail.dto.MailDTO;
import br.com.fallconn.mail.service.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.bind.annotation.*;

import java.util.Properties;

@RestController
@RequestMapping("/mail")
public class SendMailResource {

    @Autowired
    private SendMailService sendMailService;

    @PostMapping()
    public ResponseEntity sendMail(@RequestBody MailDTO dto) {
        sendMailService.sendSimpleMessage(dto);
        return ResponseEntity.ok().build();
    }

}
