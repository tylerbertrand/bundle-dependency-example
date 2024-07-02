package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FunctionalTest {

    @Test
    public void test() {
        final Boolean pass = true;
        Assertions.assertEquals(true, pass);
    }
}
