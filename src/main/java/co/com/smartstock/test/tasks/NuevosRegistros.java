package co.com.smartstock.test.tasks;

import co.com.smartstock.test.userinterfaces.ObjectTraslado;
import co.com.smartstock.test.utils.CargarArchivos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

import java.io.IOException;
import java.util.Collections;
import java.util.List;


public class NuevosRegistros implements Task  {

    public static NuevosRegistros NvoRegistro() {return Tasks.instrumented(NuevosRegistros.class);}

    @Override
    public <T extends Actor> void performAs(T usuario) {

        try {
            CargarArchivos.NvosRegistros();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Obtener Codigo Traslado

        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectTraslado.AlertaTrl), WebElementStateMatchers.isNotVisible()
        ).forNoLongerThan(30).seconds());

        // Cerrar Pantalla

        usuario.attemptsTo(Click.on(ObjectTraslado.CerrarTrl));

        // Obtener Numero de Traslado

        List<String> Traslado = Collections.singletonList(ObjectTraslado.NroTraslado.resolveFor(usuario).getText());
        String CodTraslado = Traslado.get(0);

        System.out.println("El codigo de traslado es : " + CodTraslado);

        // Consultar Traslado

        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectTraslado.AlertaTrl), WebElementStateMatchers.isNotVisible()
        ).forNoLongerThan(30).seconds());

        usuario.attemptsTo(
                Click.on(ObjectTraslado.AbrirFiltros),
                Enter.theValue(CodTraslado).into(ObjectTraslado.CodDocumento),
                Click.on(ObjectTraslado.BuscarDoc));

    }
}
