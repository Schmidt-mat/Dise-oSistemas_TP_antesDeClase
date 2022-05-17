
class Prenda{
  private int cantidadDeUsos = 0;
  private EstadoPrenda estadoPrenda= new PrendaLimpia();

  public void serUsada(){
      estadoPrenda.usar(this);}

  public void lavar(){
      estadoPrenda.lavarPrenda(this);
  }
  public void nuevoUso(){
    this.cantidadDeUsos+=1;
  }

  public int getCantidadDeUsos() {
    return 0;
  }
  public void setEstado(EstadoPrenda estado){
    this.estadoPrenda =  estado;
  }

  public void setCantidadUsos(int i) {
    this.cantidadDeUsos = i;
  }
}