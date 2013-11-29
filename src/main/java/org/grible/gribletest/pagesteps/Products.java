package org.grible.gribletest.pagesteps;

import com.codeborne.selenide.SelenideElement;
import org.grible.gribletest.pageobjects.ProductsPage;
import org.grible.gribletest.resources.TestConfig;
import org.grible.gribletest.widgets.Dialog;
import org.grible.gribletest.widgets.Table;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 29.11.13
 * Time: 12:52
 * To change this template use File | Settings | File Templates.
 */

public class Products {
    public static ProductsPage page(){
        return page(TestConfig.login, TestConfig.password);
    }
    public static ProductsPage page(String login, String password){
        return new ProductsPage(Login.page(), login, password);
    }

    public static SelenideElement addProductButton() {
        return $("#btn-add-product");
    }

    public static void addProductForSure(String text){
        addProductButton().click();
        Dialog.editBox().setValue(text);
        Dialog.addButton().click();
        Table.cellByText(text).should(appear);
    }
}

