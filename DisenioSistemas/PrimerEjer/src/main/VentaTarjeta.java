package main;

import java.util.List;

import static java.util.Arrays.stream;

public class VentaTarjeta extends Venta{
    private Integer coeficiente;
    private Integer cantidadCuotas;

    public Double valorFinalVenta(){
        return cantidadCuotas*coeficiente+
                this.prendasVendidas().stream().mapToDouble(prenda -> prenda.precioVentaConEstado()*0.01).sum();
    }

}
