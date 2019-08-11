package net.screenplay.tasks;

import net.screenplay.ui.AutentificationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateAccount implements Task {
   private String email;
    public CreateAccount( String email) {
        this.email=email;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(email).into(AutentificationPage.EMAIL_ADDRES),
                Click.on(AutentificationPage.CREATE_ACCOUNT)

        );
    }
    public static CreateAccount enterEmail(String email){
        return instrumented(CreateAccount.class,email);
    }
}
