package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class PointTest {
    /**
    *Test add.
    */
    
@Test
public void whenAddDataThanShowDistance() { 
    
    Point point1 = new Point(5d,5d);
    Point point2 = new Point(10d,5d);
    assertThat(point1.distanceTo(point2), is(5d));
    

   }
    
}