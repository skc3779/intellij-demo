package com.jetbrains.refactoring;

/**
 * Created by seokangchun on 15. 4. 19..
 */
public class ExtractMethodStatic2 {

    String myName;
    static void sayHello() {
        print("Hello, ");
    }

    private static void print(String x) {
        System.out.println(x);
    }

    void sayName() {
        print(myName);
    }

    /**
     * Extract Method ..
     * System. ~ 에서 Refactor > Extract > Method 선택  ( alt+cmd+m for mac )
     *
     * private static void print , static method 가 자동으로 생성된다.
     */
}
