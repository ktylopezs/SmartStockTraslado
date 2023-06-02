//package co.com.smartstock.test.definition;
//
//import co.com.smartstock.test.interactions.CerrarSesion;
//import co.com.smartstock.test.tasks.*;
//import cucumber.api.java.Before;
//import cucumber.api.java.ast.Cuando;
//import cucumber.api.java.es.Dado;
//import cucumber.api.java.es.Entonces;
//import cucumber.api.java.es.Y;
//import net.serenitybdd.screenplay.actors.OnStage;
//import net.serenitybdd.screenplay.actors.OnlineCast;
//
//public class MyDefinition {
//
//    private AbrirPagina openPage;
//
//    @Before
//    public void IniciarEscenario() {
//        OnStage.setTheStage(new OnlineCast());
//    }
//
//    @Dado("^que el usuario ingresa a la pagina SmartStock$")
//    public void queelusuarioingresaalapaginaSmartStock() {
//        OnStage.theActorCalled("usuario").wasAbleTo(AbrirPagina.urlApp());
//    }
//
//    @Cuando("^ingrese a traslados$")
//    public void ingreseatraslados() {
//       OnStage.theActorCalled("usuario").wasAbleTo(ProcesoTraslado.Traslado());
//
//    }
//
//    @Entonces("^se crea un traslado de productos$")
//    public void secreauntrasladodeproductos() {
//        //OnStage.theActorCalled("usuario").wasAbleTo(NuevosRegistros.NvoRegistro());
//        }
//
//    @Y("^se cierra la pagina de SmartStock$")
//    public void secierralapaginadeSmartStock() {
//        OnStage.theActorCalled("Usuario").wasAbleTo(CerrarSesion.Close());
//    }
//
//}
