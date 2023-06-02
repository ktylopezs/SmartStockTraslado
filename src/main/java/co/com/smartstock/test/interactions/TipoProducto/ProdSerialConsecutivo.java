package co.com.smartstock.test.interactions.TipoProducto;

import co.com.smartstock.test.userinterfaces.ObjectTraslado;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;
import org.junit.runner.RunWith;


public class ProdSerialConsecutivo {

    public static Performable DivisionDestino (String DivisionDestino) {

        return Task.where("{0} enters name '" + DivisionDestino + "'",

                Click.on(ObjectTraslado.DivDestino));
    }
    public static Performable Cantidad (String Cantidad) {
        return Task.where("{0} enters name '" + Cantidad + "'",

                Enter.theValue(Cantidad).into(ObjectTraslado.CantProd));
    }

    public static Performable BaseSerialC (String BaseSerialC) {
        return Task.where("{0} enters name '" + BaseSerialC + "'",

                Click.on(ObjectTraslado.IngSerial),
                Enter.theValue(BaseSerialC).into(ObjectTraslado.BaseSerialCon));

    }
    public static Performable SerialConsecutivo (String SerialConsecutivo) {
        return Task.where("{0} enters name '" + SerialConsecutivo + "'",

                Enter.theValue(SerialConsecutivo).into(ObjectTraslado.InicioSerialCon),
                Click.on(ObjectTraslado.GuardarSerialCon),
                Wait.until(
                        WebElementQuestion.the(ObjectTraslado.AgrProd),
                        WebElementStateMatchers.isCurrentlyVisible()
                ).forNoLongerThan(5).seconds(),
                Click.on(ObjectTraslado.AgrProd));

    }

}
