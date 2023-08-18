package com.falabella.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static com.falabella.ui.AgregarProductoCarritoUI.BTN_INCREMENTAR;
import static com.falabella.utils.Esperas.waitVisible;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickAgregar implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 0; i <= 3; i++) {
            actor.attemptsTo(
                    //Aca es el boton de mas
                    waitVisible(BTN_INCREMENTAR),
                    Click.on(BTN_INCREMENTAR)
            );
        }
    }

    public static Performable clickAgregar() {
        return instrumented(ClickAgregar.class);
    }

}
