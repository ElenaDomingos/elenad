package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class MaxTest {
    /**
    *Test add.
    */
    
@Test
public void WhenFirstIsBiggerThanShowFirstIsMax() { 

				
				assertThat(max(4,2,1), is(4));
				
				
}

}
