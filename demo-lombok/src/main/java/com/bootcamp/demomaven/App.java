package com.bootcamp.demomaven;

import java.util.ArrayList;
import java.util.List;

//java project = JDK + junit + lombok
//target folder -> generate main + test class files (similar to javaC)
public final class App {
    private App() {
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");

        StringBuilder sb = new StringBuilder();
        int x = (int) Math.pow(2.0,2.0); //no need install java.lang.xxx

        List<String> s = new ArrayList<>();// java.util 要import
        
    }
}
