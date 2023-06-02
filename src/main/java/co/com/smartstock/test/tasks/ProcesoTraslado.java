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


public class ProcesoTraslado implements Task  {

    public static ProcesoTraslado Traslado() {return Tasks.instrumented(ProcesoTraslado.class);}

    @Override
    public <T extends Actor> void performAs(T usuario) {

        //// MENU PROCESOS ////

        try {
            CargarArchivos.Traslados();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Desplegar menu procesos

        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectTraslado.Procesos),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());
        usuario.attemptsTo(Click.on(ObjectTraslado.Procesos));

        //// OPCION TRASLADOS ////

        // Abrir Traslados
        usuario.attemptsTo(Click.on(ObjectTraslado.Traslado));

        try { Thread.sleep(3000); } catch (InterruptedException e) { throw new RuntimeException(e); }

        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectTraslado.AgrTraslado), WebElementStateMatchers.isVisible()
        ).forNoLongerThan(30).seconds());
        usuario.attemptsTo(Click.on(ObjectTraslado.AgrTraslado));

        // Tiempo de espera - Agregar Traslado
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectTraslado.BodOrigen),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        // Encabezado del Traslado
        usuario.attemptsTo(
                Click.on(ObjectTraslado.BodOrigen),
                Click.on(ObjectTraslado.SelBodOrigen),
                Click.on(ObjectTraslado.BodDestino),
                Click.on(ObjectTraslado.SelBodDestino),
                Click.on(ObjectTraslado.TipoDocumento),
                Click.on(ObjectTraslado.SelTipoDoc),
                Enter.theValue(CargarArchivos.properties.getProperty("Direccion")).into(ObjectTraslado.DirEntrega),
//                Click.on(ObjectTraslado.FechaEntrega),
//                Click.on(ObjectTraslado.SelFechaEntga),
//                Click.on(ObjectTraslado.AceptarFecEntga),
                Enter.theValue(CargarArchivos.properties.getProperty("CondComercial")).into(ObjectTraslado.CondiComercial),
                Enter.theValue(CargarArchivos.properties.getProperty("DocRelacionado")).into(ObjectTraslado.DocRelacionado),
                Enter.theValue(CargarArchivos.properties.getProperty("Observaciones")).into(ObjectTraslado.Observacion),
                Click.on(ObjectTraslado.GuardarTrl));

  }
}
