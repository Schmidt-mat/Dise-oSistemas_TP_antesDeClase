public class PrendaLimpia extends EstadoPrenda {

  @Override
  public void usar(Prenda prenda) {
    super.usar(prenda);

    if (prenda.getCantidadDeUsos() == 3) {
      prenda.setEstado(new PrendaSucia());
    }

  }
}
