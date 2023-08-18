package com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;

public class BuscarProductoUI {

    //Button cookies
    public static final Target BTN_COOKIES = Target.the("btnCookis")
            .locatedBy("//*[@id='testId-accept-cookies-btn']");

    public static final Target TXT_BUSCAR = Target.the("buscador")
            .locatedBy("//input[@id='testId-SearchBar-Input']");

}
