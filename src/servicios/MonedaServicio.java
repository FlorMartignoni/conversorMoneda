package servicios;
import modelos.Moneda;
import java.util.Scanner;

public class MonedaServicio {

private Moneda moneda = new Moneda();
Scanner scanner = new Scanner(System.in);
Request request = new Request();
String monedaAConvertir;


public void establecerMonedaBase(){
    System.out.println("Ingrese el código de 3 letras que figuran en mayúsculas de la moneda base elegida:");
    request.Request();
}

public void establecerMonedaAConvertir(){
    System.out.println("Ingrese el código de 3 letras que figuran en mayúsculas de la moneda a convertir:");
    monedaAConvertir = scanner.next();
    request.establecerMonedaAConvertir(monedaAConvertir.toUpperCase());
}

public void calculo(){
    request.CalculoConversion(monedaAConvertir.toUpperCase());
}

}
