package net.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class AutentificationPage extends PageObject {
    public static Target EMAIL_ADDRES=Target.the("email").locatedBy("//*[@id=\"email_create\"]");
    public static Target CREATE_ACCOUNT=Target.the("Create account").locatedBy("//*[@id=\"SubmitCreate\"]/span");
}
