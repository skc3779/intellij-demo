package com.jetbrains.refactoring;

/**
 * Created by seokangchun on 15. 4. 19..
 */
public class CallHierarchy {
    private void foo() { bar(); }
    private void bar() { baz(); }
    private void baz() {}
    /**
     * http://blog.jetbrains.com/idea/2015/02/new-refactorings-around-the-call-hierarchy/
     *
     * 1. Change Signature (cmd + f6 for mac)
     * Type, Name 입력
     * select Methods To Propagate New Parameters 를 선택
     *
     * 2. Safe Delete of Method Call Hierarchy
     * 생성된 Parameter를 삭제한다.
     *
     * 3. Make Method Static ( Refactor > Make Method Static )
     * 정적 메소드를 만들기 위해서는 Make Method Static을 사용한다.
     *
     *
     */
}
