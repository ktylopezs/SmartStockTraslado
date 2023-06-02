package co.com.smartstock.test.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class CargarArchivos {

    public static Properties properties;

    public static void datoslogin() throws IOException {
        properties = new Properties();
        properties.load(new FileReader("Login.properties"));
    }

    public static void Traslados() throws IOException {
        properties = new Properties();
        properties.load(new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get("Traslados.properties")), StandardCharsets.UTF_8)));
    }

    public static void NvosRegistros() throws IOException {
        properties = new Properties();
        properties.load(new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get("NvosRegistros.properties")), StandardCharsets.UTF_8)));
    }

}

