package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextArea {

    String label;
    String locator = "//div[contains(@class,'isModal')]//span[contains(text(),'%s')]/../..//textarea";

    public TextArea(String label) {
        this.label = label;
    }

    public void write(WebDriver driver, String text) {
        driver.findElement(By.xpath(String.format(locator, label))).sendKeys(text);
    }
}
