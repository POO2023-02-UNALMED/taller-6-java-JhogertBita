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
}