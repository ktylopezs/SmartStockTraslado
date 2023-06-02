package co.com.smartstock.test.questions;

import co.com.smartstock.test.userinterfaces.LoginPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarLogueo implements Question<String> {

    public static VerificarLogueo Login() {
        return new VerificarLogueo();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LoginPagina.TituloPrincipal).viewedBy(actor).asString();
    }
}
