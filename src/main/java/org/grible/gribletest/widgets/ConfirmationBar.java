package org.grible.gribletest.widgets;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 29.11.13
 * Time: 17:44
 * To change this template use File | Settings | File Templates.
 */
public class ConfirmationBar {
    public static SelenideElement container(){ return $(".noty_bar");}

    public static void confirm(){
        container().find(".btn-primary").click();
    }
    public static void decline(){
        container().find(".btn-danger").click();
    }
}
