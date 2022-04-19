package Ropa;

import java.util.Arrays;
import java.util.List;

import static Ropa.CategoriaPrenda.*;
import static Ropa.Material.ALGODON;

public class Prenda {
    private Material material;
    private TipoPrenda tipoPrenda;
    private List<Color> colores= Arrays.asList(new Color[2]);

    //cargar una prenda y que obligatoriamente tenga que tener todos los datos
    public Prenda(Material material, TipoPrenda tipoPrenda, Color color){
        this.material=material;
        this.colores.add(0,color);
        this.tipoPrenda=tipoPrenda;
    }
    public void agregarColorSecundario(Color colorAAgregar){
        this.colores.add(1,colorAAgregar);
    }
    //EXPLICAR cuando entregue que la posición 0 de la lista es el color principal y que la posicion 1 es el secundario
}
