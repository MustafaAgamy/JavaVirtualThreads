import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class Form2 {
    private SHAFT.GUI.WebDriver driver;

    private final By field1 = By.id("field1");
    private final By field2 = By.id("field2");
    private final By field3 = By.id("field3");
    private final By field4 = By.id("field4");
    private final By field5 = By.id("field5");
    private final By field6 = By.id("field6");
    private final By field7 = By.id("field7");
    private final By field8 = By.id("field8");
    private final By field9 = By.id("field9");
    private final By field10 = By.id("field10");
    private final By field11 = By.id("field11");
    private final By field12 = By.id("field12");
    private final By field13 = By.id("field13");
    private final By field14 = By.id("field14");
    private final By field15 = By.id("field15");
    private final By field16 = By.id("field16");
    private final By field17 = By.id("field17");
    private final By field18 = By.id("field18");
    private final By field19 = By.id("field19");
    private final By field20 = By.id("field20");
    private final By field21 = By.id("field21");
    private final By field22 = By.id("field22");
    private final By field23 = By.id("field23");
    private final By field24 = By.id("field24");
    private final By field25 = By.id("field25");
    private final By field26 = By.id("field26");
    private final By field27 = By.id("field27");
    private final By field28 = By.id("field28");
    private final By field29 = By.id("field29");
    private final By field30 = By.id("field30");
    private final By submitBtn = By.id("submit");

    public Form2(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    public Form2 fillForm1Data(String data) {
        driver.async().element()
                .type(field1, data).type(field2, data).type(field3, data).type(field4, data)
                .type(field5, data).type(field6, data).type(field7, data).type(field8, data)
                .type(field9, data).type(field10, data).type(field11, data).type(field12, data)
                .type(field13, data).type(field14, data).type(field15, data).type(field16, data)
                .type(field17, data).type(field18, data).type(field19, data).type(field20, data)
                .type(field21, data).type(field22, data).type(field23, data).type(field24, data)
                .type(field25, data).type(field26, data).type(field27, data).type(field28, data)
                .type(field29, data).type(field30, data).synchronize();

        return this;
    }

    public Form2 submit() {
        driver.element().click(submitBtn);
        return this;
    }
}
