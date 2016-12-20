package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class FactorialTest {
    /**
    *Test add.
    */
    
@Test
public void WhenAddBothOfParamThanCalculateFactorial() { 

				
				assertThat(factorial(4,5), is(480));
				
				
}

}
