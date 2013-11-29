package org.grible.gribletest.pageobjects;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.grible.gribletest.core.SelenideLoadablePage;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 29.11.13
 * Time: 11:42
 * To change this template use File | Settings | File Templates.
 */



public class LoginPage extends SelenideLoadablePage {
    String baseurl;


    public LoginPage(String baseurl) {
        this.baseurl = baseurl;
    }

    @Override
    public void open() {
        Selenide.open(baseurl);
    }

    @Override
    public SelenideElement container() {
        return $("#login-form");
    }

    @Override
    protected void load() {
        open();
    }
}
