package com.ll.framwork.ioc;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ApplicationContextTest {
    private static ApplicationContext applicationContext;

    @BeforeAll
    public static void beforeAll() {
        ApplicationContext applicationContext = new ApplicationContext("com.ll");
        applicationContext.init();
    }

    @Test
    @DisplayName("ApplicationContext 객체 생성")
    public void t1() {
        System.out.println(applicationContext);
    }
}
