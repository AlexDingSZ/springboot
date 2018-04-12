package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {
    @Action(name="注解式拦截的add bbb操作")
    public void add(){
        System.out.println("text 注解式拦截的add bbb操作");
    }

}
