package com.falabella.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Esperas {

    public static Actor.ErrorHandlingMode waitVisible(Target marca){
        WaitUntil.the(marca, isVisible()).forNoMoreThan(10).seconds();
        return null;
    }
}
