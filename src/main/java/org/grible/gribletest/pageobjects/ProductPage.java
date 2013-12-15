package org.grible.gribletest.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.grible.gribletest.core.SelenideLoadablePage;
import org.grible.gribletest.pagesteps.Product;
import org.grible.gribletest.pagesteps.ProductsList;

import static org.grible.gribletest.widgets.Table.cellByText;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 14.12.13
 * Time: 18:18
 * To change this template use File | Settings | File Templates.
 */
public class ProductPage extends SelenideLoadablePage {
    private ProductsListPage parent;
    private String productName;

    public ProductPage(ProductsListPage parent, String productName){
        this.parent = parent;
        this.productName = productName;
    }

    @Override
    public void open() {
        cellByText(productName).click();
    }

    @Override
    public SelenideElement identity() {
         return Product.testTableItem();
    }

    @Override
    protected void load() {
        parent.get();
        ProductsList.ensureHasProduct(productName);
        open();
    }
}
