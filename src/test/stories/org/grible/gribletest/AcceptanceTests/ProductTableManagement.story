package stories.org.grible.gribletest.AcceptanceTests

description "Product Table Management"
tags "functional"

scenario "Add new table", {
    given "On TablesList page",{
        TablesList.page().get()
    }
    and "No custom table with '" + TEST_TABLE + "' name exist", {
//        TablesList.ensureHasNo(cellByText(TEST_PRODUCT))
    }
    then "new table can be added", {
//        ProductsList.addProductForSure(TEST_PRODUCT)
    }
    and "after relogin still present", {
//        cleanReLogin()
//        Table.cellByText(TEST_PRODUCT).should(Be.visible);
    }
}