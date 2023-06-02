package co.com.smartstock.test.models;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Base {
    protected Actor usuario;
//    private EnvironmentVariables environmentVariables;

    @Managed
    WebDriver browser;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        usuario = theActorCalled("usuario");

        usuario.can(BrowseTheWeb.with(browser));
        browser.manage().window().maximize();

    }

}
