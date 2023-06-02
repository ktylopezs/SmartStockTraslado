package co.com.smartstock.test.models;

import co.com.smartstock.test.utils.CargarArchivos;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Variables {


    //// OPCION TRASLADOS ////

    //Encabezado
    private static String BodOrigen1;
    public static String getBodOrigen1() {return BodOrigen1;}
    public static void setBodOrigen1(String bodOrigen1) {BodOrigen1 = bodOrigen1;}
    private static String BodDestino1;
    public static String getBodDestino1() {return BodDestino1;}
    public static void setBodDestino1(String bodDestino1) {BodDestino1 = bodDestino1;}
    private static String TipoDocu;
    public static String getTipoDocu() {return TipoDocu;}
    public static void setTipoDocu(String tipoDocu) {TipoDocu = tipoDocu;}
    private static String FechaActual;
    public static String getFechaActual() {return FechaActual;}
    public static void setFechaActual(String fechaActual) {FechaActual = fechaActual;}
    private static String PrimerEtapa;
    public static String getPrimerEtapa() {return PrimerEtapa;}
    public static void setPrimerEtapa(String primerEtapa) {PrimerEtapa = primerEtapa;}
    private static String SegundaEtapa;
    public static String getSegundaEtapa() {return SegundaEtapa;}
    public static void setSegundaEtapa(String segundaEtapa) {SegundaEtapa = segundaEtapa;}

    //ENCABEZADO

    //Seleccionar bodegas
        public static String BodOrigen1() {

            try {
                CargarArchivos.Traslados();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        setBodOrigen1(CargarArchivos.properties.getProperty("BodegaOrigen"));
        System.out.println("La bodega origen es : " + getBodOrigen1());
        return getBodOrigen1();
    }

    public static String BodDestino1() {

        try {
            CargarArchivos.Traslados();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        setBodDestino1(CargarArchivos.properties.getProperty("BodegaDestino"));
        System.out.println("La bodega destino es : " + getBodDestino1());
        return getBodDestino1();
    }

    //Seleccionar Tipo Documento
    public static String TipoDocu() {
        try {
            CargarArchivos.Traslados();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        setTipoDocu(CargarArchivos.properties.getProperty("TipoDocumento"));
        System.out.println("El tipo documento es : " + getTipoDocu());
        return getTipoDocu();
    }

    //Obtener el día de la fecha actual
    static DateFormat FechaActual1 = new SimpleDateFormat("dd");
    static String FechaActual2 = FechaActual1.format(new Date());
    public static String FechaActual() {
        setFechaActual(FechaActual2.toString());
        System.out.println("El día actual es : " + getFechaActual());
        return getFechaActual();
    }

    //Cambiar Etapa Documento
    public static String PrimerEtapa() {

        try {
            CargarArchivos.Traslados();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        setPrimerEtapa(CargarArchivos.properties.getProperty("Etapa1"));
        System.out.println("La primera etapa es : " + getPrimerEtapa());
        return getPrimerEtapa();
    }

    public static String SegundaEtapa() {
        try {
            CargarArchivos.Traslados();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        setSegundaEtapa(CargarArchivos.properties.getProperty("Etapa2"));
        System.out.println("La segunda etapa es : " + getSegundaEtapa());
        return getSegundaEtapa();
    }

}