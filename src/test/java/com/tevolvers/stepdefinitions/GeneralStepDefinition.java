package com.tevolvers.stepdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class GeneralStepDefinition {
    @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }
}
