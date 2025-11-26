package com.mycompany.dateproject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    private Date date;

    @BeforeEach
    void setUp() {
        date = new Date(25,11,2025);
    }

    @AfterEach
    void tearDown() {
        date = null;
    }

    @Test
    void Constructor() {
        assertEquals(2025, date.getYear());
        assertEquals(11, date.getMonth());
        assertEquals(25, date.getDay());
    }

    @Test
    void testSetAndGetYear() {
        date.setYear(2026);
        assertEquals(2026, date.getYear());
    }

    @Test
    void testSetAndGetMonth() {
        date.setMonth(12);
        int expectedMonthCannotBe = 11;
        assertFalse(expectedMonthCannotBe == date.getMonth());
    }

    @Test
    void testSetAndGetDay() {
        date.setDay(20);
        int expectedDay = 20;
        assertTrue(date.getDay() == expectedDay);
    }


}