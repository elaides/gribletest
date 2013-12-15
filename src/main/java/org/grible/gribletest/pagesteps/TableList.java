package org.grible.gribletest.pagesteps;

import com.codeborne.selenide.SelenideElement;
import org.grible.gribletest.pageobjects.TableListPage;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 14.12.13
 * Time: 20:07
 * To change this template use File | Settings | File Templates.
 */
public class TableList {
    public static TableListPage page(String productName){
        return new TableListPage(Product.page(productName));
    }

    public static SelenideElement addCategoryButton() { return $("#btn-add-category");}
}
