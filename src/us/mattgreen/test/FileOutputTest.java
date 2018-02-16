package us.mattgreen.test;

import org.junit.Test;
import us.mattgreen.FileOutput;

public class FileOutputTest
{
    FileOutput outData;

    @Test
    public void setUp()
    {
        outData = new FileOutput("the_book.csv");
    }
}
