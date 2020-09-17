package com.bittu.springJavaProject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class BurgerKing implements Burger{
    @Override
    public String getBrandName() {
        return "BurgerKing";
    }
}
