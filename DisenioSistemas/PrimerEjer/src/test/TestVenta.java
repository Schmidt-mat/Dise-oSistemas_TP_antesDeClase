package test;

import com.sun.org.apache.xpath.internal.operations.Equals;
import main.Empresa;
import main.Prenda;
import main.VentaEfectivo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static main.EstadoPrenda.LIQUIDACION;
import static main.EstadoPrenda.NUEVA;
import static main.TipoPrenda.PANTALON;
import static main.TipoPrenda.SACO;


public class TestVenta {
    Empresa empresaPrueba = new Empresa();

    public void metodoTest(Prenda prendaAAgregar){
        prendaAAgregar.setprecioBase(100);
        prendaAAgregar.settipoPrenda(SACO);
        prendaAAgregar.setestadoPrenda(NUEVA);
    }

    public Prenda segundoMetodoTest(Prenda prendaAAgregar){
        prendaAAgregar.setprecioBase(1000);
        prendaAAgregar.settipoPrenda(PANTALON);
        prendaAAgregar.setestadoPrenda(LIQUIDACION);

        return prendaAAgregar;
    }
    @Before
    public void pruebaEfectivo (){
        Prenda prendaSacoPrueba= new Prenda();
        metodoTest(prendaSacoPrueba);
        Prenda prendaPantalonPrueba= new Prenda();
        segundoMetodoTest(prendaPantalonPrueba);

        VentaEfectivo pruebaVentaEfectivo= new VentaEfectivo();
        pruebaVentaEfectivo.agregarPrenda(prendaSacoPrueba);
        pruebaVentaEfectivo.agregarPrenda(prendaPantalonPrueba);

        pruebaVentaEfectivo.setFecha(LocalDate.now());
        empresaPrueba.agregarVenta(pruebaVentaEfectivo);

    }
    @Test
    public void deberiaDar600() {
        Assert.assertTrue(empresaPrueba.gananciasDeUnDia(LocalDate.now())==(new Float (600)));
       // Assert.assertEquals(empresaPrueba.gananciasDeUnDia(LocalDate.now()),100);

    }

}