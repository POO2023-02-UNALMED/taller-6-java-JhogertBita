package vehiculos;

public class Automovil extends Vehiculo {
	private int puestos;
	static int cantidadAutomoviles;
	public Automovil(String placa,String nombre,int precio,int peso,Fabricante fabricante,int puestos) {
		super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
		this.puestos=puestos;
		Automovil.cantidadAutomoviles++;
		super.addVehiculos(this);
	}

	public int getPuestos() {
		return this.puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos=puestos;
	}
	public static int getCantidadAutomoviles() {
		return Automovil.cantidadAutomoviles;
    }
    public static void setCantidadAutomoviles(int automoviles) {
		Automovil.cantidadAutomoviles=automoviles;
    }
}