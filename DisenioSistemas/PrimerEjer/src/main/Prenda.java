package main;

public class Prenda {
    private Integer valorPromocion;
    private Integer precioBase;
    private TipoPrenda tipoPrenda;
    private EstadoPrenda estadoPrenda;

public void setValorPromocion(Integer valorpromocion){
    this.valorPromocion=valorpromocion;
}
public void setprecioBase(Integer preciobase){
    this.precioBase=preciobase;
}
public void settipoPrenda(TipoPrenda tipoprenda){
    this.tipoPrenda=tipoprenda;
}
public void setestadoPrenda(EstadoPrenda estadoprenda){
    this.estadoPrenda=estadoprenda;
}
    public Integer precioVentaConEstado(){
        //return this.estadoPrenda.modificador(this.precioBase,this.valorPromocion);
        switch (estadoPrenda){
            case NUEVA:
                return precioBase;
            case PROMOCION:
                return precioBase-valorPromocion;
            case LIQUIDACION:
                return precioBase/2;
            default:
                return 0;
        }
    }
    public TipoPrenda tipoPrenda() {
        return this.tipoPrenda;
    }
}

