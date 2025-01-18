import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestVirtualThreads {
    private SHAFT.GUI.WebDriver driver;


    @Test
    public void testMethod() {
        new Form1(driver)
                .fillForm1Data("data")
                .submit();
        new Form2(driver)
                .fillForm1Data("data")
                .submit();
    }

    @BeforeMethod
    public void setUp() {
        driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL(SHAFT.Properties.paths.testData() + "form1.html");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
