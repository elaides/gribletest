package org.grible.gribletest.pagesteps;

import com.codeborne.selenide.SelenideElement;
import org.grible.gribletest.pageobjects.LoginPage;
import org.grible.gribletest.resources.TestConfig;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 29.11.13
 * Time: 12:13
 * To change this template use File | Settings | File Templates.
 */
public class Login {
    public static LoginPage page(){
        return new LoginPage(TestConfig.baseurl);
    }

    public static SelenideElement usernameField(){ return $(By.name("username"));}
    public static SelenideElement passwordField(){ return $(By.name("pass"));}
    public static SelenideElement loginButton(){ return $(".ui-button[value='Log in']");}

    public static void doLogin(String login, String password){
        usernameField().setValue(login);
        passwordField().setValue(password);
        loginButton().click();
    }
}
