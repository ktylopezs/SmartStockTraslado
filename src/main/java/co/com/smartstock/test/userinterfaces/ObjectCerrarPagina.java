package co.com.smartstock.test.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ObjectCerrarPagina extends PageObject {
    public static final Target Perfil = Target.the("Ir al cierre de sesión").located(By.xpath("(//*[name()='path'])[3]/.."));
    public static final Target CerrarSesion = Target.the("Cerrar sesión").located(By.xpath("//span[normalize-space()='Cerrar Sesión']"));

}
