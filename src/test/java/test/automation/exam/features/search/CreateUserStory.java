package test.automation.exam.features.search;

import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import net.screenplay.Questions.Customer_account;
import net.screenplay.tasks.CreateAccount;
import net.screenplay.tasks.OpenPage;
import net.screenplay.tasks.RegisterUser;
import net.screenplay.tasks.SignIn;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.util.Locale;


import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.CoreMatchers.is;

@RunWith(SerenityRunner.class)
public class CreateUserStory {
    private Actor jose = Actor.named("Jose");
   // private String email="walasuno@aasdsd.com";
    @Managed
    private WebDriver webDriver;

    @Before
    public void actorCanOpenHisBrowser() {
        jose.can(BrowseTheWeb.with(webDriver));
    }

    @Test
    public void name_of_the_user_registered_should_be_display_inside_profile() {
        FakeValuesService fakeValuesService = new FakeValuesService(new Locale("en-US"),new RandomService());
        String email= fakeValuesService.bothify("U?????###@gmail.com");
        givenThat(jose).wasAbleTo(OpenPage.theApplicationPage());
        and(jose).wasAbleTo(SignIn.selectSingInButton());
        and(jose).wasAbleTo(CreateAccount.enterEmail(email));
        when(jose).attemptsTo(RegisterUser.fillPersonlaInformation("Adalid", "Claure", email));
        then(jose).should(seeThat(Customer_account.displayed(),is("Adalid Claure")));
    }
}
