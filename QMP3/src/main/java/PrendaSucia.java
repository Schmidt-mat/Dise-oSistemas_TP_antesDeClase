public class PrendaSucia extends EstadoPrenda {

  @Override
  public void usar(Prenda prenda) {
    super.usar(prenda);

    if (prenda.getCantidadDeUsos() > 3) {
      prenda.setEstado(new PrendaPercudida());
    }
  }
  @Override
  public void lavarPrenda(Prenda prenda){
    prenda.setCantidadUsos(0);
    prenda.setEstado(new PrendaLimpia());
  }
}

