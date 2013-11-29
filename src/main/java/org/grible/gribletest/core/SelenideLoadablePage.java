package org.grible.gribletest.core;

import static com.codeborne.selenide.Condition.visible;

import com.codeborne.selenide.SelenideElement;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 29.11.13
 * Time: 10:51
 * To change this template use File | Settings | File Templates.
 */
public abstract class SelenideLoadablePage extends SelenideLoadableComponent {
    public abstract void open();

    public abstract SelenideElement container();

    public void isLoaded(){
        container().shouldBe(visible);
    }
}
