package org.grible.gribletest.pagesteps;

import org.grible.gribletest.widgets.UserPanel;

import static org.grible.gribletest.core.helpers.SelenideHelpers.cleanCookies;
import static org.grible.gribletest.core.helpers.SelenideHelpers.pressF5;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 29.11.13
 * Time: 19:02
 * To change this template use File | Settings | File Templates.
 */
public class Common {

    public static void cleanReLogin(){
        UserPanel.doLogout();
        cleanCookies();
        Products.page().get();
    }

    public static void cleanLogin(){
        cleanCookies();
        pressF5();
        Products.page().get();
    }
}
