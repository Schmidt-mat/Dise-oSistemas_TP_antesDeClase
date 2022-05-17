import java.util.ArrayList;
import java.util.List;

public class Lavadero {
  private List<Prenda> prendasALavar = new ArrayList<Prenda>();

  public void porPrendaALavar(Prenda prenda){
    prendasALavar.add(prenda);
  }

  public boolean seEstaLabando(Prenda prenda){
    return prendasALavar.contains(prenda);
  }

  public void lavarPrendas(){
    prendasALavar.stream().forEach(prenda -> prenda.setEstado(new PrendaLimpia()));
  }
}
