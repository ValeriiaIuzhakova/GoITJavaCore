package com.company;

import org.junit.Assert;
import org.junit.Test;
import org.apache.commons.io.FileUtils;

import java.io.File;

public class CaesarDataFileTest {

    final private String filename = "testdata.txt";
    final private String data = "Hello world";

    @Test
    public void testWriteDataFile() throws Exception {
        String result = CaesarDataFile.writeDataFile(data, filename);
        Assert.assertNotEquals(result, data);

        File file = new File(filename);
        Assert.assertTrue(file.exists());

        Assert.assertEquals(FileUtils.readFileToString(file), result);
    }

    @Test
    public void testReadDataFile() throws Exception {
        String result = CaesarDataFile.readDataFile(filename);
        Assert.assertNotNull(result);
        Assert.assertEquals(data, result);
    }
}