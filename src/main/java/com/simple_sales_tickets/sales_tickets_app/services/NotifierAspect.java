package com.simple_sales_tickets.sales_tickets_app.services;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class NotifierAspect {

    @Pointcut("@annotation(com.simple_sales_tickets.sales_tickets_app.annotations.Notifiable)")
    public void send() {}

    @After("send()")
    public void sendMessage(JoinPoint point) {
        System.out.println("Письмо отправленно после окончания работы " + point.getSignature().getName() + "()");
    }
}
