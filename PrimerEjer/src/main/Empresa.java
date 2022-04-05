package main;

import java.time.LocalDate;
import java.util.List;

public class Empresa {
    private List<Venta> ventasRealizadas;
    public void agregarVenta(Venta ventaAAgregar){
        this.ventasRealizadas.add(ventaAAgregar);
    }
    public double gananciasDeUnDia(LocalDate fechaBuscada){
        return this.ventasRealizadas.stream().filter(venta -> venta.fechaVenta().equals(fechaBuscada)).
                mapToDouble(ventaDelDia -> ventaDelDia.valorFinalVenta()).sum();
    }
}
