package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BoobleTest {
    /**
    *Test add.
    */
    
@Test
public void WhenArrayIsExistThanShowResult() { 

				int values[] = {1,2,3,4};

                int newArray[] = values.booble();
                int resultArray[] = {4,3,2,1};

				assertThat(newArray, is(resultArray));
				
				
}

}