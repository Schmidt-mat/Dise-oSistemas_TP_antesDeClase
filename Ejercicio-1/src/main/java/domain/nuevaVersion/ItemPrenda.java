package domain.nuevaVersion;

public class ItemPrenda {
    private Prenda prendaAsociada;
    private Integer cantidad;
    public Double valorAPagar(){
        return cantidad*prendaAsociada.precioFinal();
    }
}
