package com.tevolvers.stepdefinitions;

import com.tevolvers.driver.OwnDriver;
import com.tevolvers.driver.PlayTheApp;
import com.tevolvers.models.Operation;
import com.tevolvers.questions.TheResult;
import com.tevolvers.tasks.Make;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.WebElementQuestion;


import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.*;
import static com.tevolvers.pageobjects.Calculator.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;
public class SumStepDefinition {

    @Given("that {actor} open the calculator")
    public void thatPedroOpenTheCalculator(Actor actor) {
        actor.whoCan(PlayTheApp.with(OwnDriver.init()));
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
