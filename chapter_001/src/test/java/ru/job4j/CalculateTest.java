package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class CalculateTest {
    /**
    *Test add.
    */
    
@Test
public void whenAddOneToOneThenTwo() { 
    
    
       
        String lineSep = System.getProperty("line.separator");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Calculate.main(null);
        assertThat(out.toString(), is("Hello World" + lineSep));
    

   }
    
}
   
