package co.com.smartstock.test.runners;

import co.com.smartstock.test.interactions.TipoProducto.ProdSerialConsecutivo;
import co.com.smartstock.test.interactions.TipoProducto.ProdSinSerial;
import co.com.smartstock.test.models.Base;
import co.com.smartstock.test.models.Variables;
import co.com.smartstock.test.userinterfaces.ObjectTraslado;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.Wait;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTagValuesOf;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src/test/resources/Datos/DetalleProdutos.csv")
@WithTag("login")

public class AgregarProductos extends Base {

    private String TipoProducto;
    private String Producto;
    private String DivisionOrigen;
    private String DivisionDestino;
    private String Cantidad;
    private String BaseSerialC;
    private String SerialConsecutivo;
    private String Serial;

    @Test
    @WithTagValuesOf({"smoke"})
    public void Crear_Traslado_Productos(){

        // Seleccionar Producto
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectTraslado.AlertaTrl), WebElementStateMatchers.isNotVisible()
        ).forNoLongerThan(30).seconds());

        try { Thread.sleep(2000); } catch (InterruptedException e) { throw new RuntimeException(e); }

        Target SelProducto = Target.the("Seleccionar Primer Producto").located(By.xpath("//li[normalize-space()='"+ Producto +"']"));
        Target SelDivisionOrigen1 = Target.the("Seleccionar Division Origen").located(By.xpath("//div[normalize-space()='Todas']"));
        Target SelDivisionOrigen = Target.the("Seleccionar Division Origen").located(By.xpath("//li[normalize-space()='"+ DivisionOrigen +"']"));

        usuario.attemptsTo(
            Click.on(ObjectTraslado.DescProducto),
            Click.on(SelProducto),
            Click.on(ObjectTraslado.BuscarProd),
            Click.on(SelDivisionOrigen1),
            Click.on(SelDivisionOrigen),
            Click.on(ObjectTraslado.BuscarProd));

        // Agregar Detalles del Producto

        String TipoProducto1 = TipoProducto;
        switch (TipoProducto1) {
            case "SERIALC":

                // Tiempo de espera - elemento
                usuario.attemptsTo(Wait.until(
                        WebElementQuestion.the(ObjectTraslado.DivDestino),
                        WebElementStateMatchers.isEnabled()
                ).forNoLongerThan(30).seconds());
                try { Thread.sleep(2000); } catch (InterruptedException e) { throw new RuntimeException(e); }

                Target SelDivDestino = Target.the("Seleccionar Division Origen").located(By.xpath("//li[normalize-space()='"+ DivisionDestino +"']"));

                usuario.attemptsTo(

                        ProdSerialConsecutivo.DivisionDestino(DivisionDestino),
                        Click.on(SelDivDestino),
                        ProdSerialConsecutivo.Cantidad(Cantidad));

                try { Thread.sleep(2000); } catch (InterruptedException e) { throw new RuntimeException(e); }

                usuario.attemptsTo(
                        ProdSerialConsecutivo.BaseSerialC(BaseSerialC),
                        ProdSerialConsecutivo.SerialConsecutivo(SerialConsecutivo));

                try { Thread.sleep(3000); } catch (InterruptedException e) { throw new RuntimeException(e); }

                break;
            case "FIFO":
            case "FEFO":

                // Tiempo de espera - elemento
                usuario.attemptsTo(Wait.until(
                        WebElementQuestion.the(ObjectTraslado.DivDestino),
                        WebElementStateMatchers.isEnabled()
                ).forNoLongerThan(30).seconds());
                try { Thread.sleep(2000); } catch (InterruptedException e) { throw new RuntimeException(e); }

                Target SelDivDestino1 = Target.the("Seleccionar Division Destino").located(By.xpath("//li[normalize-space()='" + DivisionDestino + "']"));

                usuario.attemptsTo(
                        ProdSinSerial.DivisionDestino(DivisionDestino),
                        Click.on(SelDivDestino1),
                        ProdSinSerial.Cantidad(Cantidad),
                        Click.on(ObjectTraslado.AgrProd));
            break;
            case "SERIAL":

                // Tiempo de espera - elemento

                usuario.attemptsTo(Wait.until(
                        WebElementQuestion.the(ObjectTraslado.DivDestino),
                        WebElementStateMatchers.isEnabled()
                ).forNoLongerThan(30).seconds());
                try { Thread.sleep(2000); } catch (InterruptedException e) { throw new RuntimeException(e); }

                Target SelDivDestino2 = Target.the("Seleccionar Division Origen").located(By.xpath("//li[normalize-space()='"+ DivisionDestino +"']"));

                usuario.attemptsTo(
                        ProdSinSerial.DivisionDestino(DivisionDestino),
                        Click.on(SelDivDestino2),
                        ProdSinSerial.Cantidad(Cantidad),
                        Click.on(ObjectTraslado.IngSerial),
                        Click.on(ObjectTraslado.Serial));

                Target SelSerial = Target.the("Seleccionar Serial").located(By.xpath("//li[normalize-space()='"+ Serial +"']"));

                usuario.attemptsTo(
                        Click.on(SelSerial),
                        Click.on(ObjectTraslado.GuardarSerialCon),
                        Click.on(ObjectTraslado.AgrProd));
            break;
            default:
                System.out.println("No se ha asignado un tipo de producto");
            break;

        }

    }

}
