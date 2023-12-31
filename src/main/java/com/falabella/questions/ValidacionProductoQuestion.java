package com.falabella.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.falabella.ui.DetallesProductoUI.TXT_NOMBRE;

public class ValidacionProductoQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade nombreCarrito = TXT_NOMBRE.resolveFor(actor);
        String nombreProducto = actor.recall("nombre").toString();
        return nombreCarrito.getText().equals(nombreProducto);

    }

    public static Question<Boolean> from(){
        return new ValidacionProductoQuestion();
    }
}