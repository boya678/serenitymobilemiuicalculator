package com.tevolvers.pageobjects;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Calculator {
    public static Target NUMBER=Target.the("number {0}").locatedBy("//*[@resource-id='com.miui.calculator:id/btn_{0}_s']");
    public static Target OPERAND=Target.the("operand {0}").locatedBy("//*[@resource-id='com.miui.calculator:id/btn_{0}_s']");
    public static Target RESULT=Target.the("result").located(By.id("com.miui.calculator:id/result"));
}
