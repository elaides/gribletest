package org.grible.gribletest.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.grible.gribletest.core.SelenideLoadablePage;
import org.grible.gribletest.pagesteps.Products;
import org.grible.gribletest.pagesteps.Login;
import org.openqa.selenium.By;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 29.11.13
 * Time: 11:39
 * To change this template use File | Settings | File Templates.
 */
public class ProductsPage extends SelenideLoadablePage {
    private LoginPage parent;
    private String login;
    private String password;

    public ProductsPage(LoginPage parent, String login, String password) {
        this.parent = parent;
        this.login = login;
        this.password = password;
    }

    @Override
    public void open() {
        Login.doLogin(login, password);
    }

    @Override
    public SelenideElement container() {
        return Products.addProductButton().find(By.xpath("parent::*/parent::body"));
    }

    @Override
    protected void load() {
        parent.get();
        open();
    }
}
