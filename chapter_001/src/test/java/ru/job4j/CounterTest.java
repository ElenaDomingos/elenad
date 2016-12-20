package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class CounterTest {
    /**
    *Test add.
    */
    
@Test
public void WhenCounterStartThanShowSum() { 

				
				assertThat(add(20,25), is(66));
				
				
}

}