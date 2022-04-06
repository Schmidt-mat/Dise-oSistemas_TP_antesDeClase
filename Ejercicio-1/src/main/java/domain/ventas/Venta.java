package domain.ventas;

import domain.prendas.Prenda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Venta {
    private LocalDate fechaVenta;
    private List<Prenda> prendasVendidas=new ArrayList<>();
    public void agregarPrenda(Prenda prendaAAgregar){
        this.prendasVendidas.add(prendaAAgregar);
    }
    public void setFecha(LocalDate fechaventa){
        this.fechaVenta=fechaventa;
    }

//Nota: la cantidad de prendas vendidas las saco de la lista, no es como que guardo 2 pantalones,
// 1 camisa, etc. Sería [pantalon,pantalon,camisa]

    public Integer cantidadPrendasVendidas(){
        return this.prendasVendidas.size();
    }
    public abstract Double valorFinalVenta();
    public List<Prenda> prendasVendidas(){
        return  prendasVendidas;
    }
    public LocalDate fechaVenta(){
        return fechaVenta;
    }
}