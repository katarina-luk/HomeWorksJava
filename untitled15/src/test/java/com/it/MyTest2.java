package com.it;

import org.junit.*;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest2 {
    @Test
    public void name() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","lib/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://admin-coin.smarthomedevs.work/partners");
        Thread.sleep(5000);
        driver.quit();
    }
    /* @Before
    public void setUp() throws Exception {
        System.out.println("Before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Afrer");
    }

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("    @BeforeClass");

    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("    @AfterClass");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void name() {
        throw new IndexOutOfBoundsException();
       // System.out.println("Test");
    }

    @Category(FastTests.class)
    @Test
    public void name1() {
        System.out.println("Test1");
        Assert.assertTrue(false);

    }
@Category({FastTests.class,SlowTests.class})
    @Test
    public void name2() {
        System.out.println("Test2");

    }*/
}
