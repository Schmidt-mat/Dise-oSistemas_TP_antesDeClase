package domain;

import com.sun.org.apache.xpath.internal.operations.Equals;

import domain.MacoWins.Empresa;
import domain.prendas.Prenda;
import domain.prendas.PrendaLiquidacion;
import domain.prendas.PrendaNueva;
import domain.ventas.VentaEfectivo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static domain.prendas.TipoPrenda.PANTALON;
import static domain.prendas.TipoPrenda.SACO;


public class VentaTest {
    Empresa empresaPrueba = new Empresa();
    VentaEfectivo pruebaVentaEfectivo= new VentaEfectivo();
    public void metodoTest(Prenda prendaAAgregar){
        prendaAAgregar.setprecioBase(100);
        prendaAAgregar.settipoPrenda(SACO);
    }

    public Prenda segundoMetodoTest(Prenda prendaAAgregar){
        prendaAAgregar.setprecioBase(1000);
        prendaAAgregar.settipoPrenda(PANTALON);

        return prendaAAgregar;
    }
    @Before
    public void pruebaEfectivo (){
        Prenda prendaSacoPrueba= new PrendaNueva();
        metodoTest(prendaSacoPrueba);
        Prenda prendaPantalonPrueba= new PrendaLiquidacion();
        segundoMetodoTest(prendaPantalonPrueba);

        pruebaVentaEfectivo.agregarPrenda(prendaSacoPrueba);
        pruebaVentaEfectivo.agregarPrenda(prendaPantalonPrueba);

        pruebaVentaEfectivo.setFecha(LocalDate.now());
        empresaPrueba.agregarVenta(pruebaVentaEfectivo);

    }
    @Test
    public void deberiaDar600() {
        Assert.assertTrue(empresaPrueba.gananciasDeUnDia(LocalDate.now())==(new Float (600)));
    }
    @Test
    public void tieneDosVentas() {
        Assert.assertTrue(pruebaVentaEfectivo.cantidadPrendasVendidas()==2);
    }
}