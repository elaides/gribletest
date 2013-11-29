package org.grible.gribletest.core;

import com.codeborne.selenide.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 29.11.13
 * Time: 10:34
 * To change this template use File | Settings | File Templates.
 */


public abstract class SelenideLoadableComponent {

    public void get() {
        long originalTimeout = Configuration.timeout;
        try {
            Configuration.timeout = 0;
            isLoaded();
            Configuration.timeout = originalTimeout;
        } catch (Error e) {
            Configuration.timeout = originalTimeout;
            load();
        }

        isLoaded();
    }

    protected abstract void load();  /*
            THere may be more than one way to open some pageobjects, depending on what was the parent of this page
            TODO: think about design and refactor, or provide some pattern as a solution
        */

    protected abstract void isLoaded();
}