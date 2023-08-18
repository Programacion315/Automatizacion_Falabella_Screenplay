package com.falabella.tasks;

import com.falabella.utils.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.falabella.ui.BuscarProductoUI.BTN_COOKIES;
import static com.falabella.ui.BuscarProductoUI.TXT_BUSCAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BusquedaProductoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_COOKIES),
                Enter.theValue(Data.extractTo().get(0).get("PRODUCTO")).into(TXT_BUSCAR).thenHit(Keys.ENTER)
        );
    }
    public static BusquedaProductoTask on(){ return instrumented(BusquedaProductoTask.class);}

}
