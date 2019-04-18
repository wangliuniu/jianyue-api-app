package com.soft1721.jianyue.api.util;

import com.soft1721.jianyue.api.service.MailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Slf4j
@Component
public class TaskService {
   @Resource
    private MailService mailService;

    @Scheduled(cron ="0 9 10 15 4 ?")
    public void proces(){
        mailService.sendMail("16422802@qq.com","毛玥","老师辛苦了,定时10.09");
    }
}