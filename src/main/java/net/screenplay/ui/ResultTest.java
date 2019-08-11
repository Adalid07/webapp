package net.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class ResultTest extends PageObject {
    public static Target CUSTOMER_PROFILE=Target.the("Value Found").
            locatedBy("#header > div.nav > div > div > nav > div:nth-child(1) > a");
}
