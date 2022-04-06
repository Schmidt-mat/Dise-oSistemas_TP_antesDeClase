package domain.ventas;

import static java.util.Arrays.stream;

public class VentaTarjeta extends Venta{
    private Integer cantidadCuotas;
    private CoeficienteTarjeta traerCoeficiente=new CoeficienteTarjeta();
    public Double valorFinalVenta(){
        return cantidadCuotas*traerCoeficiente.getCoeficiente()+
                this.prendasVendidas().stream().mapToDouble(prenda -> prenda.precioVentaConEstado()*0.01).sum();
    }

}
