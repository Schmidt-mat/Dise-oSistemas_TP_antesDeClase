package domain.prendas;

public class PrendaPromocion extends Prenda {
    private Integer valorPromocion;
    public  Integer precioVentaConEstado(){ return this.getPrecioBase()-valorPromocion; }

}
