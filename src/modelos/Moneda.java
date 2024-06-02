package modelos;
import java.util.Map;

public class Moneda {

    private String monedaBase;
    private Map<String, Double> monedaAConvertirLista;


    public void generarMoneda(MonedaAPI monedaApi){
        this.monedaBase = monedaApi.base_code();
        this.monedaAConvertirLista = (Map<String, Double>) monedaApi.conversion_rates();
    }

    public Map<String, Double> getMonedaAConvertirLista() {
        return monedaAConvertirLista;
    }

    public String getMonedaBase() {
        return monedaBase;
    }

    @Override
    public String toString() {
        return "Moneda Base: " + monedaBase +
                ", valor: 1 " +
                ", Moneda a Convertir Lista: " + monedaAConvertirLista +
                '.';
    }
}
