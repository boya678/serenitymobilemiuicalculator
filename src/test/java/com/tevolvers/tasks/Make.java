package com.tevolvers.tasks;

import com.tevolvers.models.Operation;
import com.tevolvers.pageobjects.Calculator;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;

import java.util.List;

public class Make implements Task {

    private Operation operation;

    public Make(List<Operation> operations){
        this.operation=operations.get(0);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        tapNumbers(operation.getNumber1(),actor);
        tapOperator(operation.getOperand(),actor);
        tapNumbers(operation.getNumber2(),actor);
        tapOperator("=",actor);
    }

    public void tapNumbers(String number,Actor actor){
        for (int i = 0; i < number.length(); i++) {
            actor.attemptsTo(Click.on(Calculator.NUMBER.of(String.valueOf(number.charAt(i)))));
        }
    }

    public void tapOperator(String operator, Actor actor){
        switch (operator){
            case ("+"):
                actor.attemptsTo(Click.on(Calculator.OPERAND.of("add")));
                break;
            case ("="):
                actor.attemptsTo(Click.on(Calculator.EQUAL));
                break;
        }
    }

    public static Make the(List<Operation> operations){
        return new Make(operations);
    }
}
