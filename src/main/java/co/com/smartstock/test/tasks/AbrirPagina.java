package co.com.smartstock.test.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina {

    public static Performable ObjectTraslado() {
        return Task.where("{0} opens the Sign Up  page",
                Open.url("http://infotrackstock.smartstockinfotracktest.link/autenticacion"));
    }

}
