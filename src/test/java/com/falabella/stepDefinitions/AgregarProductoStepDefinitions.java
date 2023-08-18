package com.falabella.stepDefinitions;

import com.falabella.questions.ValidacionCantidadCarritoQuestion;
import com.falabella.questions.ValidacionProductoQuestion;
import com.falabella.tasks.AgregarProductoCarritoTask;
import com.falabella.tasks.BusquedaProductoTask;
import com.falabella.tasks.ObtenerProductoTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AgregarProductoStepDefinitions {

    // Configura el actor
    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Dado("que el usuario abre la aplicacion y busca un producto en la barra de busqueda")
    public void que_el_usuario_abre_la_aplicacion_y_busca_un_producto_en_la_barra_de_busqueda() {
        theActorCalled("user").wasAbleTo(
                Open.url("https://www.falabella.com.co/falabella-co"),
                BusquedaProductoTask.on()
        );
    }
    @Cuando("el usuario selecciona un producto y lo agrega una cantidad al carrito")
    public void el_usuario_selecciona_un_producto_y_lo_agrega_una_cantidad_al_carrito() {
        theActorInTheSpotlight().attemptsTo(
                ObtenerProductoTask.on(),
                AgregarProductoCarritoTask.on()
        );
    }
    @Entonces("el usuario visualiza su producto en el carrito")
    public void el_usuario_visualiza_su_producto_en_el_carrito() {
        // theActorInTheSpotlight() obtiene el actor principal en la prueba actual.
        theActorInTheSpotlight().should(
                seeThat(
                        ValidacionProductoQuestion.from(), Matchers.equalTo(true)
                ),
                seeThat(
                        ValidacionCantidadCarritoQuestion.from(), Matchers.equalTo(true)
                )
        );
    }
}
