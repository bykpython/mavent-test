package com.bigdata.sub;


import com.bigdata.Hello;

public class HelloFriend {

    public String sayHelloToFriend(String name){
        Hello hello = new Hello();
        String string  = hello.sayHello(name) + "i am " + this.getMyName();
        System.out.println(string);
        return string;
    }

    private String getMyName() {
        return "join";
    }
}
