package domain.nuevaVersion;

public class PrendaPromocion implements Estado{
    Integer valorDescuento;
    public Double precioPrenda(double valorBase) {
        return valorBase-valorDescuento;
    }
}
