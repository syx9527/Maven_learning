package com.shaoyx.maven;


import org.junit.Test;

public class HelloTest {

    @Test
    public void showMassage() {
        Hello hello = new Hello();
        hello.showMessage();
    }
}