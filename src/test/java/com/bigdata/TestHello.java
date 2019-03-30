package com.bigdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHello {

    @Test
    public void  HelloTest(){
        Hello hello = new Hello();
        String result = hello.sayHello("hahaha");
        assertEquals("Hellohahaha!", result);
    }
}
