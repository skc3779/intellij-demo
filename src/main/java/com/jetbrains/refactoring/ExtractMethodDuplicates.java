package com.jetbrains.refactoring;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by seokangchun on 15. 4. 19..
 */
@Slf4j
public class ExtractMethodDuplicates {

    public static void main(String[] args) {
        print("Print SomeThing!!");
        print("Print Another Thing!!");
    }

    private static void print(String s) {
        System.out.print(s);
    }

    /**
     * Extract Method ..
     * System. ~ 에서 Refactor > Extract > Method 선택  ( alt+cmd+m for mac )
     */

}
