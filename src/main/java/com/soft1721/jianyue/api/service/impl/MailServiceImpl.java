package com.soft1721.jianyue.api.service.impl;

import com.soft1721.jianyue.api.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class MailServiceImpl implements MailService {
    @Resource
    private JavaMailSender mailSender;

    @Override
    public void sendMail(String to, String subject, String content) {
        SimpleMailMessage smm=new SimpleMailMessage();
        smm.setFrom("3374465619@qq.com");//发起者
        smm.setTo(to);//接受者
        smm.setSubject(subject);
        smm.setText(content);
        mailSender.send(smm);
        try {
            mailSender.send(smm);
            System.out.println("发送简单邮件");
        }catch (Exception e){
            System.out.println("发送简单邮件失败");
        }
  }


    }