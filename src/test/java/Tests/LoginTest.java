package Tests;

import models.User;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void login() {
        User user = new User("yanju-pwvb@force.com", "Bannenter1");
        loginPage
                .openPage()
                .login(user)
                .verifyLogin()
                .openPage()
                .clickNew()
                .createAcount();
    }
}