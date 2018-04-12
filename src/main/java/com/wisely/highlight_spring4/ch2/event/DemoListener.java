package com.wisely.highlight_spring4.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    public void onApplicationEvent(DemoEvent event){
        String msg = event.getMsg();
        System.out.println("我bean-demolistener 接收到了 bean-demo-publisher 发布的消息："+msg);
    }
}
