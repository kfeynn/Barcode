package com.barcode.core.databases;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect // for aop
@Component // for auto scan
@Order(0) // execute before @Transactional
public class DynamicChangeDbSource {

	@Pointcut("execution(public * com.inventory.ferrari.service.data.ferrari..*.*(..))")
    public void invanyMethod() {
    };

    @Pointcut("execution(public * com.inventory.ferrari.service.data.galaxy..*.*(..))")
    public void galaxyanyMethod() {
    };

    @Before("invanyMethod()")
    public void beforeinv(JoinPoint jp) {
        Object[] args = jp.getArgs();
        if(args==null){
            DataSourceTypeManager.set(DataSources.local);
            //return;
        }
        //System.out.println("-------------" + args[0]);
        DataSourceTypeManager.set(DataSources.local);
        System.out.println("method : beforeinv");
    }

    @Before("galaxyanyMethod()")
    public void beforegalaxy(JoinPoint jp) {
        DataSourceTypeManager.set(DataSources.local);
        System.out.println("method : beforegalaxy");
    }
}
