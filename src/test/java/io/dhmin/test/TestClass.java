package io.dhmin.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestClass {
    @Test
    void alwaysHappy() {
        Assertions.assertTrue(true);
    }

    @Test
    void alwaysHappy2() {
        Assertions.assertTrue(true);
    }

    @Test
    void thisIsUnhappy() {
        Assertions.assertTrue(false);
    }
}
