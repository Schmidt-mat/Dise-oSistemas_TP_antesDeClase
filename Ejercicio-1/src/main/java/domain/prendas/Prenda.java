package domain.prendas;

public abstract class Prenda {
    private Integer precioBase;
    private TipoPrenda tipoPrenda;
    public abstract Integer precioVentaConEstado();

    public TipoPrenda tipoPrenda() {
        return this.tipoPrenda;
    }
    public Integer getPrecioBase(){
        return precioBase;
    }
    public void setprecioBase(Integer preciobase){
        this.precioBase=preciobase;
    }
    public void settipoPrenda(TipoPrenda tipoprenda){
        this.tipoPrenda=tipoprenda;
    }

}

