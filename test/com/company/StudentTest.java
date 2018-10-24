package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void medo() {
        Student amel = new Student("Amel", "Karšić", 17338);
        assertEquals("Amel Karšić (17338)", amel.toString());
    }
}