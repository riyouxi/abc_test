package com.example.shanshan.test;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by shanshan on 16/11/19.
 */
public class UtilsTest {

    private static  Utils utils = new Utils();
    @Test
    public void setValue() throws Exception {
        Assert.assertEquals(3,utils.setValue(1,2));
    }

}