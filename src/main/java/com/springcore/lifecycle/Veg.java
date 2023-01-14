package com.springcore.lifecycle;

import lombok.*;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class Veg implements InitializingBean, DisposableBean {
    private double price;

    @Override
    public void afterPropertiesSet() throws Exception {
        //init
        System.out.println("init");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }
}
