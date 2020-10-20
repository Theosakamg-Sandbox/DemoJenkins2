package com.tactfactory.demo;

import com.tactfactory.demo.commands.Addition;

public class Application {

    public static void main(String[] args) {
        System.out.println("Hello Java !");

        Addition add = new Addition(2);
        int result = add.apply(3);

        System.out.println(String.valueOf(result));
    }

}
