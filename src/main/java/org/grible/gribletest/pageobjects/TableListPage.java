package org.grible.gribletest.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.grible.gribletest.core.SelenideLoadablePage;
import org.grible.gribletest.pagesteps.TableList;

import static org.grible.gribletest.pagesteps.Product.testTableItem;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 14.12.13
 * Time: 20:01
 * To change this template use File | Settings | File Templates.
 */
public class TableListPage extends SelenideLoadablePage{
    private ProductPage parent;


    public TableListPage(ProductPage parent){
        this.parent = parent;
    }

    @Override
    public void open(){
        testTableItem().click();
    }

    @Override
    public SelenideElement identity() {
        return TableList.addCategoryButton();
    }

    @Override
    protected void load() {
        parent.get();
        open();
    }
}
