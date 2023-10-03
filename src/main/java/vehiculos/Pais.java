package vehiculos;
import java.util.ArrayList;

public class Pais {
  private String nombre;
  public Pais(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return this.nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public static Pais paisMasVendedor() {
    ArrayList<Pais> paises = new ArrayList<Pais>();
    for (int i=0; i<Vehiculo.getVehiculos().size(); i++) {
      Pais x=Vehiculo.getVehiculos().get(i).getFabricante().getPais();
      if (paises.contains(x)==false) {
        paises.add(x);
      }
    }
    int lista[];
    lista = new int[paises.size()];
    for (Vehiculo vehiculo : Vehiculo.getVehiculos()) {
      int indice=paises.indexOf(vehiculo.getFabricante().getPais());
      lista[indice]++;
    }
    int n = 0;
    for (int i=1; i<lista.length; i++) {
      if (lista[i]>lista[n]) {
        n=i;
      }
    }
    return paises.get(n);
  }
}