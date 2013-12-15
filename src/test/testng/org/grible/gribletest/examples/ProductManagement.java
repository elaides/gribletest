package testng.org.grible.gribletest.examples;

import org.grible.gribletest.core.easybselenideintegration.conditionaliases.Be;
import org.grible.gribletest.pagesteps.ProductsList;
import org.grible.gribletest.widgets.Table;
import org.testng.annotations.Test;

import static org.grible.gribletest.pagesteps.Common.cleanReLogin;
import static org.grible.gribletest.resources.TestData.TEST_PRODUCT;
import static org.grible.gribletest.widgets.Table.cellByText;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 14.12.13
 * Time: 16:47
 */
public class ProductManagement {

    @Test
    public void testNewProductCanBeAdded() {
        ProductsList.page().get();
        Table.ensureHasNo(cellByText(TEST_PRODUCT));
        ProductsList.addProductForSure(TEST_PRODUCT);
        cleanReLogin();
        Table.cellByText(TEST_PRODUCT).should(Be.visible);
    }
}
