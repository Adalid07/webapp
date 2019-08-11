package net.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class FillPersonalInformation extends PageObject {
    public static Target FIRSTNAME= Target.the("firstName").locatedBy("//*[@id=\"customer_firstname\"]");
    public static Target LASTNAME= Target.the("LASTNAME").locatedBy("//*[@id=\"customer_lastname\"]");
    public static Target EMAIL= Target.the("EMAIL").locatedBy("//*[@id=\"email\"]");
    public static Target PASS= Target.the("PASS").locatedBy("//*[@id=\"passwd\"]");
    public static Target ADRESS= Target.the("ADRESS").locatedBy("//*[@id=\"address1\"]");
    public static Target CITY= Target.the("CITY").locatedBy("//*[@id=\"city\"]");
    public static Target STATE= Target.the("STATE").locatedBy("//*[@id=\"id_state\"]");
    public static Target ZIP= Target.the("ZIP").locatedBy("//*[@id=\"postcode\"]");
    public static Target PHONE_NUMBER = Target.the("Phone Number").locatedBy("//*[@id=\"phone\"]");
    public static Target REGISTER_BUTTON = Target.the("Select register button").locatedBy("//*[@id=\"submitAccount\"]/span");
}
