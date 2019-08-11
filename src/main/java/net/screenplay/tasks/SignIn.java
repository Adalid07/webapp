package net.screenplay.tasks;

import net.screenplay.ui.SignIn_Button;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SignIn implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SignIn_Button.SIGN_IN));

    }
    public static  SignIn selectSingInButton(){
        return instrumented(SignIn.class);
    }
}
