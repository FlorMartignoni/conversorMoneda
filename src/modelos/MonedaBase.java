package modelos;

public class MonedaBase {
    private String monedaBase;

    public String getMonedaBase() {
        return monedaBase;
    }

    public void setMonedaBase(MonedaAPI monedaApi) {
        this.monedaBase = monedaApi.base_code();;
    }
}
