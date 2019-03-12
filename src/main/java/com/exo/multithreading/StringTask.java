package com.exo.multithreading;

import java.util.concurrent.Callable;

public class StringTask implements Callable<String> {
    private String name;


    public StringTask(String name) {
        this.name = name;
    }


    public java.lang.String call() throws Exception {
        // TODO Auto-generated method stub
        return name + "  " + Thread.currentThread();
    }

}
