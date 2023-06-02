package co.com.smartstock.test.interactions;

import co.com.smartstock.test.userinterfaces.ObjectCerrarPagina;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

public class CerrarSesion implements Interaction {

    // Cerrar sitio
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectCerrarPagina.Perfil),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(15).seconds());
        actor.attemptsTo(
                Click.on(ObjectCerrarPagina.Perfil),
                Click.on(ObjectCerrarPagina.CerrarSesion)
        );
    }
    public static CerrarSesion Close() {return Instrumented.instanceOf(CerrarSesion.class).withProperties();}
}


