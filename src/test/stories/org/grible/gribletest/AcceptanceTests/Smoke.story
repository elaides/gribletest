import org.grible.gribletest.pagesteps.Login
import org.grible.gribletest.pagesteps.Product
import org.grible.gribletest.pagesteps.ProductsList
import org.grible.gribletest.pagesteps.TableList
import org.grible.gribletest.widgets.UserPanel

description "Smoke suite"
tags "smoke"

scenario "Surf Pages", {
    then "Login", { Login.page().get()}
    then "ProductsList", { ProductsList.page().get()}
    then "Product", {Product.page("Product_1").get()}
    then "TableList", {TableList.page().get()}
    then "Login via logout", { UserPanel.doLogoutForSure()}

}