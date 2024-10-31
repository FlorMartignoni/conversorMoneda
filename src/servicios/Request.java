package servicios;

import com.google.gson.*;
import modelos.Moneda;
import modelos.MonedaAPI;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Request {

    Moneda moneda = new Moneda();
    Scanner scanner = new Scanner(System.in);
    String monedaAConvertirLocal;
    Double valorMonedaAConvertir;


    public void Request() {        
        {
            try {

                String ingreso = "";

                do {
                    ingreso = scanner.next();

                    // Verificar si la entrada contiene solo letras
                    if (!ingreso.matches("[a-zA-Z]+") || ingreso.length() != 3) {
                        System.out.println("Ingreso inválido, debe ingresar solo tres letras. Intente nuevamente.");
                    }

                } while (!ingreso.matches("[a-zA-Z]+") || ingreso.length() != 3);

                String direccion = "https://v6.exchangerate-api.com/ApiKey" + ingreso.toUpperCase();
                //System.out.println(direccion);
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();

                HttpResponse<String> response;
                response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();

                Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_DASHES).create();
                MonedaAPI monedaApi = gson.fromJson(json, MonedaAPI.class);


                if (monedaApi != null) {
                    moneda.generarMoneda(monedaApi);
                } else {
                    System.out.println("No se pudo inicializar MonedaAPI");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);

            }
        }
    }

        public void establecerMonedaAConvertir (String monedaAConvertir){

            monedaAConvertirLocal = monedaAConvertir;
            valorMonedaAConvertir = moneda.getMonedaAConvertirLista().get(monedaAConvertir);

            System.out.println("La moneda elegida fue: " + monedaAConvertir + ", y su valor es: "
                    + valorMonedaAConvertir);
        }



    public void CalculoConversion(String monedaLocal) {
        System.out.println("Ingrese el monto de " + moneda.getMonedaBase() + " que desea convertir a "
                + monedaLocal);
        valorMonedaAConvertir = moneda.getMonedaAConvertirLista().get(monedaLocal);
        double monto = scanner.nextDouble();
        monto = monto * valorMonedaAConvertir;
        System.out.println("El resultado de la conversión es: " + monto + " " + monedaLocal);
    }

}




