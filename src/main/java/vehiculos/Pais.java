package vehiculos;

import java.util.ArrayList;

public class Pais {
	
	private String nombre;
	public int vendidos=0;
	public static ArrayList<Pais> lista = new ArrayList<Pais>();
	
	public Pais(String nombre, int vendidos) {
		super();
		this.nombre = nombre;
		this.vendidos = vendidos;
		lista.add(this);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVendidos() {
		return vendidos;
	}
	public void setVendidos(int vendidos) {
		this.vendidos = vendidos;
	}
	
	public static String paisMasVendedor() {
		String vendedor= "";
		int vendidos=0;
		for (Pais pais: lista) {
			if(pais.vendidos>vendidos) {
				vendidos = pais.vendidos;
				vendedor = pais.getNombre();
			}
		}
		return vendedor;
	}
	
	
}
