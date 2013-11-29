package org.grible.gribletest.widgets;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.grible.gribletest.core.helpers.SelenideHelpers.contextClick;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 29.11.13
 * Time: 16:07
 * To change this template use File | Settings | File Templates.
 */
public class Table {
    public static SelenideElement container(){
        return $(".table");
    }
    public static SelenideElement row(String index){
        return $(".table-row");
    }

    public static ElementsCollection cells(){
        return $$(".table-cell");
    }

    public static SelenideElement cellByText(String text){
//        return $(By.xpath(""));
        return cells().findBy(exactText(text)).find(".section");
    }

    public static void ensureHasNo(SelenideElement cell){
        if (cell.exists()){
            deleteCellForSure(cell);
        }
    }

    public static void deleteCellForSure(SelenideElement cell){
        delete(cell);
        cell.shouldBe(notPresent);
    }

    public static void delete(SelenideElement cell){
        contextClick(cell);
        PopUp.delete();
        ConfirmationBar.confirm();
    }

}
