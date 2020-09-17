package com.bittu.springJavaProject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier(" Burger")
public class MacD implements Burger{

    @Override

    public String getBrandName() {
        return "MacD";
    }
}
