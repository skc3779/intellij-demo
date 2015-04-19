package com.jetbrains.function;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by seokangchun on 15. 4. 19..
 */
@Slf4j
public class PieSlice {
    String name;
    public PieSlice(String name) {
        this.name = name;
    }

    public void increment() {
        log.info("{} increment", this.name);
    }
}
