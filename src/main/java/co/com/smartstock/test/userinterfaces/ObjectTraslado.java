package co.com.smartstock.test.userinterfaces;

import co.com.smartstock.test.models.Variables;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ObjectTraslado {


    public static final Target Procesos = Target.the("Menu Procesos").located(By.xpath("//span[contains(text(),'Procesos')][1][1]"));

    // AGREGAR TRASLADOS //
    public static final Target AlertaTrl = Target.the("Alerta Crear Traslado").located(By.xpath("//div[contains(text(),'Cambios almacenados correctamente.')]"));

    // Datos Encabezado
    public static final Target Traslado = Target.the("Opción Traslado").located(By.xpath("//h6[contains(text(),'Traslado')]"));
    public static final Target AgrTraslado = Target.the("Agregar Traslado").located(By.xpath("//span[contains(text(),'add')]"));
    public static final Target BodOrigen = Target.the("Bodega Origen").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear Traslado'])[1]/following::input[1]"));
    public static final Target SelBodOrigen = Target.the("Seleccionar Bodega Origen").located(By.xpath("//li[normalize-space()='"+Variables.BodOrigen1()+"']"));
    public static final Target BodDestino = Target.the("Bodega Destino").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear Traslado'])[1]/following::input[2]"));
    public static final Target SelBodDestino = Target.the("Seleccionar Bodega Destino").located(By.xpath("//li[normalize-space()='"+Variables.BodDestino1()+"']"));
    public static final Target TipoDocumento = Target.the("Tipo Documento").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear Traslado'])[1]/following::input[3]"));
    public static final Target SelTipoDoc = Target.the("Seleccionar Tipo Documento").located(By.xpath("//li[normalize-space()='"+Variables.TipoDocu()+"']"));
    public static final Target DirEntrega = Target.the("Direccion Entrega").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear Traslado'])[1]/following::input[5]"));
    public static final Target FechaEntrega = Target.the("Fecha Entrega").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear Traslado'])[1]/following::div[37]"));
    public static final Target SelFechaEntga = Target.the("Seleccionar Fecha Entrega").located(By.xpath("//p[contains(text(),'"+Variables.FechaActual()+"')]"));
    public static final Target AceptarFecEntga = Target.the("Aceptar Fecha Entrega").located(By.xpath("//span[contains(text(),'OK')]"));
    public static final Target CondiComercial = Target.the("Condicion Comercial").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear Traslado'])[1]/following::input[7]"));
    public static final Target DocRelacionado = Target.the("Documento Relacionado").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear Traslado'])[1]/following::input[8]"));
    public static final Target Observacion = Target.the("Observacion").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear Traslado'])[1]/following::input[9]"));
    public static final Target GuardarTrl = Target.the("Guardar Traslado").located(By.xpath("//span[contains(text(),'Guardar')]"));

    // Datos Detalle
    public static final Target DescProducto = Target.the("Descripción Producto").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Editar'])[1]/following::input[2]"));

    // Buscar Producto

    public static final Target BuscarProd = Target.the("Buscar Producto").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear Traslado'])[1]/following::button[12]"));

    // Detalle Productos
    public static final Target DivDestino = Target.the("Division Destino").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Editar'])[1]/following::input[7]"));
    public static final Target CantProd = Target.the("Cantidad Producto").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Editar'])[1]/following::input[8]"));
    public static final Target IngSerial = Target.the("Ingresar Serial").located(By.xpath("//tbody/tr[1]/td[10]/button[1]/span[1]//*[name()='svg']"));
    public static final Target BaseSerialCon = Target.the("Base Serial Consecutivo").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Base'])[1]/following::input[1]"));
    public static final Target InicioSerialCon = Target.the("Inicio Serial Consecutivo").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Inicio seriales consecutivos'])[1]/following::input[1]"));
    public static final Target Serial = Target.the("Agregar Serial").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Serial'])[6]/following::input[1]"));
    public static final Target GuardarSerialCon = Target.the("Guardar Serial Consecutivo").located(By.xpath("//span[contains(text(),'Guardar')]"));
    public static final Target AgrProd = Target.the("Agregar Producto").located(By.xpath("//span[contains(text(),'Agregar')]"));

    // Cambiar Etapa
    public static final Target CambioEt = Target.the("Cambiar Etapa").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Doc. relacionado'])[2]/following::input[2]/.."));
    public static final Target SelCambioEt1 = Target.the("Cambiar Primera Etapa").located(By.xpath("//li[normalize-space()='"+Variables.PrimerEtapa()+"']"));
    public static final Target SelCambioEt2 = Target.the("Cambiar Segunda Etapa").located(By.xpath("//li[normalize-space()='"+Variables.SegundaEtapa()+"']"));
    public static final Target ConTrl = Target.the("Continuar Traslado").located(By.xpath("//span[contains(text(),'Continuar')]"));

    // Consultar Traslado Creado
    public static final Target NroTraslado = Target.the("Número Traslado").located(By.xpath("//td[4]"));
    public static final Target AbrirFiltros = Target.the("Abrir Filtros").located(By.xpath("//span[contains(text(),'Filtros')]"));
    public static final Target CodDocumento = Target.the("Codigo Documentos").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Filtros'])[1]/following::input[6]"));
    public static final Target BuscarDoc = Target.the("Buscar Traslado").located(By.xpath("//span[contains(text(),'Buscar')]"));

    // Salir del documento
    public static final Target CerrarTrl = Target.the("Cerrar Traslado").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear Traslado'])[1]/following::button[1]"));

    }
