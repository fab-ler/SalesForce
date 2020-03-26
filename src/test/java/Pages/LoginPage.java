package Pages;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {


    @FindBy(id = "username")
    WebElement userNameField;
    @FindBy(id = "password")
    WebElement passwordField;
    @FindBy(id = "Login")
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LoginPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOf(loginButton));
        return this;
    }

    public LoginPage openPage() {
        driver.get("https://ap16.lightning.force.com/");
        isPageOpened();
        return this;
    }

    public LoginPage writeEmail(String email) {
        userNameField.sendKeys(email);
        return this;
    }

    public LoginPage writePassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public LoginPage login(User user) {
        writeEmail(user.getEmail());
        writePassword(user.getPassword());
        loginButton.click();
        return this;
    }

    public AccountsPage verifyLogin() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("trial-subscribe-now")));
        return new AccountsPage(driver);
    }
}

