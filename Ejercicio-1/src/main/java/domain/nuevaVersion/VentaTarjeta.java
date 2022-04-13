package domain.nuevaVersion;

public class VentaTarjeta extends Venta{
    private Double cantidadCuotas;
    private Integer coeficiente;
    @Override
    public Double valorTotalVenta(){
        return super.valorTotalVenta()+cantidadCuotas*coeficiente+0.01*super.valorTotalVenta();
    }
}
