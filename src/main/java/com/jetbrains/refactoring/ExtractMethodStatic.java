package com.jetbrains.refactoring;

/**
 * Created by seokangchun on 15. 4. 19..
 */
public class ExtractMethodStatic {

    String myName;
    static void sayHello() {
        System.out.println("Hello, ");
    }

    void sayName() {
        System.out.println(myName);
    }

}
