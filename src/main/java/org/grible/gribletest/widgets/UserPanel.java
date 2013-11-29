package org.grible.gribletest.widgets;

import com.codeborne.selenide.SelenideElement;
import org.grible.gribletest.pagesteps.Login;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 29.11.13
 * Time: 18:17
 * To change this template use File | Settings | File Templates.
 */
public class UserPanel {
    public static SelenideElement container() {
        return $("#user-panel");
    }
    public static void doLogout(){
        container().find("#lnk-logout>a").click();
    }
    public static void doLogoutForSure(){
        doLogout();
        Login.page().isLoaded();
    }
}
