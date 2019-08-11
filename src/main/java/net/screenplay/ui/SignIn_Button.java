package net.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class SignIn_Button extends PageObject{
        public static Target SIGN_IN=Target.the("gon sign").locatedBy("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
}

