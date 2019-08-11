package net.screenplay.tasks;
import net.screenplay.ui.URL_page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenPage implements Task{

   private URL_page url_page;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn().the(url_page));
 //       actor.attemptsTo(OpenPage.s());

    }
    public static OpenPage theApplicationPage(){
        return instrumented(OpenPage.class);
    }
    public static void s(){}
}
