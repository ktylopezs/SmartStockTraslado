package co.com.smartstock.test.interactions;

import co.com.smartstock.test.userinterfaces.LoginPagina;
import co.com.smartstock.test.utils.CargarArchivos;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.IOException;

public class Login implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            CargarArchivos.datoslogin();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(Enter.theValue(CargarArchivos.properties.
                        getProperty("Username")).into(LoginPagina.TXT_USUARIO),
                Enter.theValue(CargarArchivos.properties.getProperty("Password")).into(LoginPagina.TXT_PASSWORD),
                Click.on(LoginPagina.BTN_LOGIN));
    }

    public static Login credenciales() {
        return Instrumented.instanceOf(Login.class).withProperties();
    }

}
