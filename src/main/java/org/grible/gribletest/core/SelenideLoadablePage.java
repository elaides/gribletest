package org.grible.gribletest.core;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 29.11.13
 * Time: 10:51
 * To change this template use File | Settings | File Templates.
 */
public abstract class SelenideLoadablePage extends SelenideLoadableComponent {
    public abstract void open();

    public abstract SelenideElement identity();

    public void isLoaded(){
        identity().shouldBe(visible);
    }
}
