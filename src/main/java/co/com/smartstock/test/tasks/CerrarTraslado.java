package co.com.smartstock.test.tasks;

import co.com.smartstock.test.userinterfaces.ObjectTraslado;
import co.com.smartstock.test.utils.CargarArchivos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

import java.io.IOException;


public class CerrarTraslado implements Task  {

    public static CerrarTraslado FinTraslado() {return Tasks.instrumented(CerrarTraslado.class);}

    @Override
    public <T extends Actor> void performAs(T usuario) {

        //// MENU PROCESOS ////

        try {
            CargarArchivos.Traslados();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Cambiar Etapa

        // Tiempo de espera - Cambio Etapa
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectTraslado.AlertaTrl), WebElementStateMatchers.isNotVisible()
        ).forNoLongerThan(30).seconds());

        usuario.attemptsTo(
                Click.on(ObjectTraslado.CambioEt),
                Click.on(ObjectTraslado.SelCambioEt1),
                Click.on(ObjectTraslado.ConTrl));

    }
}
