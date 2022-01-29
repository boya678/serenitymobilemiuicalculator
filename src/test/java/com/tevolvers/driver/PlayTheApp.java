package com.tevolvers.driver;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class PlayTheApp extends BrowseTheWeb {

    protected PlayTheApp(WebDriver browser) {
        super(browser);
    }
}
