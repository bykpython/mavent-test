package com.bigdata.sub;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHelloFriend {

    @Test
    public void testHelloFriend(){
        HelloFriend helloFriend = new HelloFriend();

        String result = helloFriend.sayHelloToFriend("hhh");

        assertEquals("Hellohhh!i am join", result);
    }
}
