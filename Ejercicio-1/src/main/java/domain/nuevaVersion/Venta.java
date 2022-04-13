package domain.nuevaVersion;

import java.time.LocalDate;
import java.util.List;

public class Venta {
    private List<ItemPrenda> itemPrendas;
    private LocalDate fecha;
    public Double valorTotalVenta(){
        return this.itemPrendas.stream().mapToDouble(item -> item.valorAPagar()).sum();
    }

    public LocalDate getFecha() {
        return fecha;
    }
    public boolean esDeFecha(LocalDate fechaAVerificar){
        return fechaAVerificar==fecha;
    }
}
