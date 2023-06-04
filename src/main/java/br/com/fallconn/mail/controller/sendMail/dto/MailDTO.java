package br.com.fallconn.mail.controller.sendMail.dto;

import lombok.Data;

@Data
public class MailDTO {
    private String nome;
    private String telefone;
    private String email;
    private String mensagem;


    public String toEmail(){
        return "Email: " + this.email +
                "\nNome: " + this.nome +
                "\nTelefone: " + this.telefone +
                "\nMensagem: " + this.mensagem;
    }
}
