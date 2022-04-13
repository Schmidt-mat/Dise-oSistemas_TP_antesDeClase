package domain.nuevaVersion;

public class Prenda {
    private TipoPrenda tipoPrenda;
    private Estado estadoPrenda;
    private Integer precioBase;

    public Integer getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Integer precioBase) {
        this.precioBase = precioBase;
    }
    public double precioFinal(){
        return this.estadoPrenda.precioPrenda(precioBase);
    }
}
