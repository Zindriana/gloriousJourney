package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    Hero heroA  = new Hero("Hero A");

    @Test
    void getNameTest() {
        assertEquals("Hero A", heroA.getName());
    }
}