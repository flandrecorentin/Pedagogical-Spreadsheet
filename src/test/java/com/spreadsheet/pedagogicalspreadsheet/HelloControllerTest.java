package com.spreadsheet.pedagogicalspreadsheet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void JUnitTest() {
        HelloController helloController = new HelloController();
        assert(helloController.JUnitTest().equals("Hello"));
    }
}