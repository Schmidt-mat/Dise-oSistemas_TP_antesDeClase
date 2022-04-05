package main;
import static java.util.Arrays.stream;


public class VentaEfectivo extends Venta{
    public Double valorFinalVenta(){
        return this.prendasVendidas().stream().mapToDouble(prenda -> prenda.precioVentaConEstado()).sum();
    }

}
