package Principal;

import calculos.MonedaServicio;
import calculos.Request;
import modelos.Moneda;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Moneda moneda = new Moneda();
        MonedaServicio monedaServicio = new MonedaServicio();
        Request request = new Request();
        String monedas = """
                A.	 ARS - Peso argentino (Argentina)
                B.	 AUD - Dólar australiano (Australia)
                C.	 BOB - Boliviano (Bolivia)
                D.	 BRL - Real brasileño (Brasil)
                E.	 CAD - Dólar canadiense (Canadá)
                F.   USD - Dólar norteamericano (EE UU)
                G.	 CLP - Peso chileno (Chile)
                H.	 COP - Peso colombiano (Colombia)
                I.	 EUR - Euro (Unión Europea)
                J.	 GBP - Libra esterlina (Reino Unido)
                """;
        String menu = """
                ------ MENU -------
                1. Ver el listado de monedas completos
                2. Establecer la moneda base a convertir
                3. Establecer la moneda a la que desea convertir
                4. Realizar el cálculo de conversión
                5. Salir
                """;

        int opcion = 0;

            do {
                System.out.println(menu);
                boolean inputValida = false;

            while (!inputValida) {
                try {
                    System.out.println("Ingrese la opción elegida del Menu:");
                    opcion = scanner.nextInt();
                    inputValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("Ingreso inválido, debe elegir un número del 1 al 5.");
                    scanner.next(); // Limpiar el buffer del scanner
                }
            }

            
            switch(opcion){
                case 1:
                    System.out.println("UD ELIGIÓ: Ver el listado de monedas completos");
                    System.out.println(monedas);
                    break;
                case 2:
                    System.out.println("UD ELIGIÓ: Establecer la moneda base a convertir");
                    monedaServicio.establecerMonedaBase();
                    break;
                case 3:
                    System.out.println("UD ELIGIÓ: Establecer la moneda a la que desea convertir");
                    monedaServicio.establecerMonedaAConvertir();
                    break;
                case 4:
                    System.out.println("UD ELIGIÓ: Realizar el cálculo de conversión");
                    monedaServicio.calculo();
                    break;
            }

        }while(opcion != 5);

        System.out.println("Gracias por utilizar el Conversor de Monedas! Lo esperamos pronto.");
    }
}