package net.screenplay.Questions;

import net.screenplay.ui.ResultTest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Customer_account implements Question<String> {

   public static Customer_account displayed(){
    return new Customer_account();
   }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ResultTest.CUSTOMER_PROFILE).viewedBy(actor).asString();
    }

    @Override
    public String getSubject() {
        return null;
    }
}
