package com.tevolvers.questions;

import com.tevolvers.pageobjects.Calculator;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.Queue;

public class TheResult implements Question<Boolean> {

    private Integer expectedResult;

    public TheResult(Integer expectedResult) {
        this.expectedResult = expectedResult;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return Calculator.RESULT.resolveFor(actor).getText().equals("= " + expectedResult);
    }

    public static TheResult isEqualTo(Integer expectedResult){
        return new TheResult(expectedResult);
    }
}
