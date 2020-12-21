package com.it;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.junit.*;
import org.junit.experimental.categories.Category;

import java.io.ObjectInputStream;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
@Category(FastTests.class)
public class MyTest1 {


    @Test
    public void name() {
        byte[] bytes = "tria".getBytes();
        byte[] bytes1 = "trial".getBytes();
        assertArrayEquals("failure",bytes,bytes1);
        System.out.println("Test with assert");
    }

    @Test
    public void name1() {
        System.out.println("Test1");
        assertTrue(false);

    }

    @Test
    public void name2() {
    //    assertTrue("hello",false);
      /*  System.out.println("Test2");
        assertNull("frfrf",new Object());
        assertNotNull("frfrf",new Object());*/
   /*     assertNotSame("",new Object(),new Object());
        Object o = new Object();
        assertNotSame("",o,o);*/
//assertThat("albumen", both(containsString("a")).and(containsString("n")));
//assertThat(Arrays.asList("one","two","three"),hasItem("one"));
/*assertThat(Arrays.asList("one","two","three"),hasItem("one"));
assertThat(3,is(not(3)));*/
assertThat("albumen",either(containsString("a")).or(containsString("n")));
    }
}
