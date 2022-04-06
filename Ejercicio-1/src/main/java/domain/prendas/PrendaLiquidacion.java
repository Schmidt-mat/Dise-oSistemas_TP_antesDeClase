package domain.prendas;

public class PrendaLiquidacion extends Prenda {
    public  Integer precioVentaConEstado(){ return this.getPrecioBase()/2; }

}
