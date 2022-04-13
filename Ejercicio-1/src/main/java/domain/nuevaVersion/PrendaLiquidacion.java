package domain.nuevaVersion;

public class PrendaLiquidacion implements Estado {
    public Double precioPrenda(double valorBase) {
        return valorBase*0.5;
    }
}