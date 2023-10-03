package vehiculos;
import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	public Fabricante(String nombre,Pais pais) {
		this.nombre=nombre;
		this.pais=pais;
	}

	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public Pais getPais() {
		return this.pais;
	}
	public void setPais(Pais pais) {
		this.pais=pais;
	}
    public static Fabricante fabricaMayorVentas() {
  		ArrayList<Fabricante> fabricantes=new ArrayList<Fabricante>();
  		for (int i=0; i<Vehiculo.getVehiculos().size(); i++) {
  			Fabricante x = Vehiculo.getVehiculos().get(i).getFabricante();
  			if (fabricantes.contains(x)==false) {
  				fabricantes.add(x);
  			}
  		}
  		int lista[]; 
  		lista=new int[fabricantes.size()];
  		for (Vehiculo vehiculo: Vehiculo.getVehiculos()) {
  			int indice=fabricantes.indexOf(vehiculo.getFabricante());
  			lista[indice]++;
  		}
  		int n=0;
  		for (int i=1; i<lista.length; i++) {
  			if (lista[i]>lista[n]) {
  				n=i;
  			}
  		}
  		return fabricantes.get(n);
  	}
}