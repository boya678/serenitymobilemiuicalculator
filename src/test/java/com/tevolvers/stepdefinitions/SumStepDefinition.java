package com.tevolvers.stepdefinitions;

import com.tevolvers.driver.OwnDriver;
import com.tevolvers.driver.PlayTheApp;
import com.tevolvers.models.Operation;
import com.tevolvers.questions.TheResult;
import com.tevolvers.tasks.Make;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;

import java.util.List;

import static com.tevolvers.pageobjects.Calculator.RESULT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class SumStepDefinition {

    @Managed
    private AndroidDriver driver;
    
    @Given("that {actor} open the calculator")
    public void thatPedroOpenTheCalculator(Actor actor) {
        actor.whoCan(PlayTheApp.with(driver));
        //actor.whoCan(PlayTheApp.with(OwnDriver.init()));
    }

    @When("he makes the operation")
    public void heMakesTheOperation(List<Operation> operations) {
        theActorInTheSpotlight().attemptsTo(Make.the(operations));
    }

    @Then("he should see the result {int}")
    public void heShouldSeeTheResult(Integer expectedResult) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULT.resolveFor(theActorInTheSpotlight()).getText()).isEqualTo("= " + expectedResult));
        theActorInTheSpotlight().should(seeThat(TheResult.isEqualTo(expectedResult)));
    }
}
