package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class TriangleTest {





public class TriangleTest {
    @Test
    public void whenAddDataThanShowArea() {
        Point a = new Point(15d,10d);
        Point b = new Point(10d,5d);
        Point c = new Point(0d,10d);
        Triangle triangle = new Triangle(a,b,c);
        assertThat(triangle.area(), is(0d));
    }

    
}