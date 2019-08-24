/*
    Java program to demonstrate unit Test capability and Github publish
    Prakash Parasuram
    Java I Programming (33851) WIIT-7310-02NI-33851-AU-2019
 */
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
