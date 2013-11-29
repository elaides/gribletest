import org.grible.gribletest.pagesteps.Login
import org.grible.gribletest.pagesteps.Products
import org.grible.gribletest.widgets.UserPanel

description "Smoke suite"
tags "smoke"

scenario "Surf Pages", {
    then "Login", { Login.page().get()}
    then "Products", { Products.page().get()}
    then "Login via logout", { UserPanel.doLogoutForSure()}
}