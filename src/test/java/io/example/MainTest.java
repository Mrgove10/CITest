package io.example;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class MainTest {
    
    @Test
    public void testPrintHello() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        
        System.setOut(new PrintStream(out));
        
        Main main = new Main();
        main.printHello("bob");
        
        System.setOut(originalOut);
        
        assertTrue(out.toString().contains("bob"));
    }
    
    @Test
    public void testGetName() {
        InputStream originalIn = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("bob".getBytes());
        
        System.setIn(in);
        
        Main main = new Main();
        String name = main.getUserName();
        
        System.setIn(originalIn);
        
        assertEquals("bob", name);
    }
}
