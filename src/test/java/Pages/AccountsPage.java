package Pages;

import elements.TextInput;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsPage extends BasePage {
    String URL = "https://ap16.lightning.force.com/lightning/o/Account/list";

    AccountsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AccountsPage isPageOpened() {
        return null;
    }

    @Override
    public AccountsPage openPage() {
        driver.get(URL);
        return this;
    }

    public AccountsPage clickNew() {
        driver.findElement(By.cssSelector("[title=New]")).click();
        return this;
    }

    public AccountsPage createAcount() {
        //       new DropDown("Type").selectValue(driver, "Reseller");
        new TextInput("Account Name").write(driver, "Name of account");
        new TextInput("Website").write(driver, "http://tut.by");
        new TextInput("Phone").write(driver, "+375297790008");
        new TextInput("Employees").write(driver, "21");
        new TextInput("Billing City").write(driver, "Minsk");
        new TextInput("Billing State/Province").write(driver, "Minsk Oblast");
        new TextInput("Billing Zip/Postal Code").write(driver, "220000");
        new TextInput("Billing Country").write(driver, "Belarus");
        new TextInput("Shipping City").write(driver, "Minsk");
        new TextInput("Shipping State/Province").write(driver, "Minsk Oblast");
        new TextInput("Shipping Zip/Postal Code").write(driver, "220000");
        new TextInput("Shipping Country").write(driver, "Belarus");
        driver.findElement(By.xpath("//div[contains(@class,'isModal')]//*[text()='Save']")).click();
        return this;
    }
}

