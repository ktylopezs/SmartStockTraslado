package co.com.smartstock.test.userinterfaces;

import javafx.application.Application;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public abstract class ObjectNvosRegistros extends Application {

    public static final Target BuscarNvoReg = Target.the("Buscar Nuevo Registro").located(By.xpath("//input[@placeholder='Buscar']"));
    public static final Target Alerta = Target.the("Alerta ").located(By.xpath("//div[contains(text(),'Cambios almacenados correctamente.')]"));

    // Nueva Persona
    public static final Target Admin = Target.the("Menu Administración").located(By.xpath("//span[contains(text(),'Administración')]"));
    public static final Target Usuario = Target.the("Opción Usuario").located(By.xpath("//h6[contains(text(),'Usuario')]"));

    // Nuevo Tipo Documento
    public static final Target Parametros = Target.the("Menu Parametros").located(By.xpath("//span[contains(text(),'Parametrización')]"));
    public static final Target TiposDoc = Target.the("Opción Tipos Documento").located(By.xpath("//h6[contains(text(),'Tipos Documento')]"));

    // Nueva Bodega
    public static final Target Bodegas = Target.the("Menu Bodegas").located(By.xpath("//span[contains(text(),'Bodegas')]"));
    public static final Target GBodegas = Target.the("Opción Gestion Bodegas").located(By.xpath("//h6[contains(text(),'Gestión bodegas')]"));

    // Nuevo Producto
    public static final Target MProductos = Target.the("Menu Productos").located(By.xpath("//span[contains(text(),'Productos')]"));
    public static final Target Productos = Target.the("Gestion Productos").located(By.xpath("//h6[contains(text(),'Gestión producto')]"));
    public static final Target DigitarProd = Target.the("Digitar Producto").located(By.xpath("//input[@name='DescripcionItem']"));
    public static final Target BuscarProd = Target.the("Buscar Producto").located(By.xpath("//span[contains(text(),'Buscar')]"));

}
