package domain.nuevaVersion;

import java.time.LocalDate;
import java.util.List;

public class Empresa {
    private List<Venta> ventasRealizadas;
    private Double gananciasDelDia(LocalDate fechaABuscar){
        return ventasRealizadas.stream().filter(venta -> venta.esDeFecha(fechaABuscar)).
                mapToDouble(ventasDeEseDia -> ventasDeEseDia.valorTotalVenta()).sum();
    }
}
