package testng.org.grible.gribletest.experiments;

import org.grible.gribletest.pagesteps.Product;
import org.grible.gribletest.pagesteps.TableList;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 14.12.13
 * Time: 20:32
 * To change this template use File | Settings | File Templates.
 */
public class UnderTest {

    @Test
    public void test(){
//        ProductsList.page().get();
        Product.page("Product_1").get();
        TableList.page("Product_1").get();
    }
}
