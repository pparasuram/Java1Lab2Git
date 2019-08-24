package edu.cscc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJava1Lab2Git {
    @Test
    public void givenNothingTestJava1Lab2Git(){
        HelloWorld helloW = new HelloWorld("from test HW");
        assertEquals("from test HW", helloW.getMessage());
    }
}
