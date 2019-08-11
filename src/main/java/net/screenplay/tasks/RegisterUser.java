package net.screenplay.tasks;

import com.github.javafaker.Faker;
import net.screenplay.ui.FillPersonalInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterUser implements Task {
    private  String firsname, lastname, email;

    public RegisterUser(String firsname, String lastname, String email) {
        this.firsname = firsname;
        this.lastname = lastname;
        this.email = email;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Faker faker = new Faker();
        String address= faker.address().fullAddress();
        actor.attemptsTo(Enter.theValue(firsname).into(FillPersonalInformation.FIRSTNAME),
                Enter.theValue(lastname).into(FillPersonalInformation.LASTNAME),
                Enter.theValue(email).into(FillPersonalInformation.EMAIL),
                Enter.theValue("Password1!").into(FillPersonalInformation.PASS),
                Enter.theValue(address).into(FillPersonalInformation.ADRESS),
                Enter.theValue("Texas").into(FillPersonalInformation.CITY),
                SelectFromOptions.byValue(String.valueOf(faker.number().numberBetween(1,50))).from(FillPersonalInformation.STATE),
                Enter.theValue(faker.address().zipCode()).into(FillPersonalInformation.ZIP),
                Enter.theValue("323132132").into(FillPersonalInformation.PHONE_NUMBER),
                Click.on(FillPersonalInformation.REGISTER_BUTTON)
        );

    }

    public static RegisterUser fillPersonlaInformation(String firsName, String lastName, String email) {
        return instrumented(RegisterUser.class, firsName, lastName, email);
    }
}
