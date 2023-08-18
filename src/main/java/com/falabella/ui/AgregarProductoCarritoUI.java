package com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;

public class AgregarProductoCarritoUI {

    //Antes de ir al carrito

    public static final Target BTN_AGREGAR_CARRITO = Target.the("btn carrito")
            .locatedBy("//*[@id='add-to-cart-button']");
    public static Target NOMBRE_PRODCTO_ANTES = Target.the("nombre producto antes")
            .locatedBy("//section[@id='product-b2c-ui']//h1");

    public static final Target TXT_CANTIDAD = Target.the("cantidad")
            .locatedBy("//*[@id='testId-stepper-input']");

    public static final Target BTN_IR_CARRITO = Target.the("btn ir carrito")
            .locatedBy("//*[@id='linkButton']");

    //Boton incrementar
    public static final Target BTN_INCREMENTAR = Target.the("btn incrementar")
            .locatedBy("//button[@id='increment-button']");
}
