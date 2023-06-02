package co.com.smartstock.test.runners;

import co.com.smartstock.test.interactions.CerrarSesion;
import co.com.smartstock.test.interactions.Login;
import co.com.smartstock.test.models.Base;
import co.com.smartstock.test.tasks.AbrirPagina;
import co.com.smartstock.test.tasks.CerrarTraslado;
import co.com.smartstock.test.tasks.NuevosRegistros;
import co.com.smartstock.test.tasks.ProcesoTraslado;
import co.com.smartstock.test.userinterfaces.ObjectTraslado;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
@WithTag("login")

public class EjecutarTags extends Base {
    @Before
    public void navegar(){

        usuario.attemptsTo(AbrirPagina.ObjectTraslado());
        usuario.attemptsTo(Login.credenciales());
    }

    @Test
    @WithTagValuesOf({"smoke"})
    public void Crear_Traslado_Productos(){

        // Tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectTraslado.AlertaTrl), WebElementStateMatchers.isNotVisible()
        ).forNoLongerThan(30).seconds());

        OnStage.theActorCalled("usuario").wasAbleTo(ProcesoTraslado.Traslado());


        // Llamado al segundo Runner

        AgregarProductos runAgregarProductos = new AgregarProductos();
        Result result = JUnitCore.runClasses(runAgregarProductos.getClass());

        // Finalizar Proceso

        OnStage.theActorCalled("usuario").wasAbleTo(CerrarTraslado.FinTraslado());

        // Ver Traslado Creado

        OnStage.theActorCalled("usuario").wasAbleTo(NuevosRegistros.NvoRegistro());

    }

    @After
    public void SalirNavegar(){

        usuario.attemptsTo(CerrarSesion.Close());
    }

}
