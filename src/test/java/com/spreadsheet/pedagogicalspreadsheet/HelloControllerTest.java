package com.spreadsheet.pedagogicalspreadsheet;

import org.junit.jupiter.api.Test;

class HelloControllerTest {

    @Test
    void JUnitTest() {
        TestController helloController = new TestController();
        assert(helloController.JUnitTest().equals("Hello"));
    }
}