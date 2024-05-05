package com.anything;


/**
 * Unit test for simple App.
 */
public class AppTest {

    @org.junit.Test
    public void getEnv() {
        System.out.println("#######");
        System.out.println(System.getenv("TEST_HOST"));
    }
}
