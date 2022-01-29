package com.tevolvers.stepdefinitions;

import com.tevolvers.models.Operation;
import io.cucumber.java.DataTableType;
import io.cucumber.java.ParameterType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.Map;

public class ParameterDefinition {

    @ParameterType(".*")
    public Actor actor(String actorName){
        return OnStage.theActorCalled(actorName);
    }

    @DataTableType
    public Operation operationTransformer(Map<String,String> data){
        return new Operation(data.get("number1"),data.get("number2"),data.get("operand"));
    }
}
