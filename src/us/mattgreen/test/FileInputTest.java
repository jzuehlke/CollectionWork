package us.mattgreen.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.mattgreen.FileInput;

import static junit.framework.TestCase.assertNotNull;

//testing FileInput class
public class FileInputTest
{
    //variable for testing
    FileInput indata;

    //before is for file input
    @Before
    public void setUp()
    {
        //test the constructor.  This test example was copied from the main
        indata = new FileInput("the_book.csv");
    }

    //test the FileInput class' methods
    @Test
    public void testFile()
    {
        //see if fileReadLine returns null.  It shouldn't.
        assertNotNull("Reader should return data.",
                indata.fileReadLine());
    }

    //after is for file closing
    @After
    public void tearDown()
    {
        indata.fileClose();
    }
}
