package lt.eimantas.piguLt.tests;

import lt.eimantas.piguLt.pages.Common;
import lt.eimantas.piguLt.utils.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public abstract class TestBase {

    @BeforeMethod
    public abstract void setUp();

    @AfterMethod
    public void tearDown(){
        Common.quitDriver();
    }
}