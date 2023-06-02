package co.com.smartstock.test.interactions.TipoProducto;

import co.com.smartstock.test.userinterfaces.ObjectTraslado;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ProdSinSerial {

    public static Performable DivisionDestino (String DivisionDestino) {

        return Task.where("{0} enters name '" + DivisionDestino + "'",

                Click.on(ObjectTraslado.DivDestino));
    }
    public static Performable Cantidad (String Cantidad) {
        return Task.where("{0} enters name '" + Cantidad + "'",

                Enter.theValue(Cantidad).into(ObjectTraslado.CantProd));
    }

}
