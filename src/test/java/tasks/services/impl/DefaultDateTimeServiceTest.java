package tasks.services.impl;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DefaultDateTimeServiceTest {

    @BeforeAll
    static void beforeAll() {

    }

    @BeforeEach
    void setUp() {

    }

    @Test
    void name() {
        final String expected = "some";
        String actual = "some";


        assertEquals(expected,actual,"msg");
    }

    @AfterEach
    void tearDown() {

    }

    @AfterAll
    static void afterAll() {

    }
}