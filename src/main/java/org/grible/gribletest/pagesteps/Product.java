package org.grible.gribletest.pagesteps;

import com.codeborne.selenide.SelenideElement;
import org.grible.gribletest.pageobjects.ProductPage;

import static org.grible.gribletest.widgets.Table.cellByText;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 14.12.13
 * Time: 18:33
 * To change this template use File | Settings | File Templates.
 */
public class Product {
    public static SelenideElement testTableItem(){
        return cellByText("Test Tables");
    }
    public static ProductPage page(String productName){
        return new ProductPage(ProductsList.page(), productName);
    }
}
