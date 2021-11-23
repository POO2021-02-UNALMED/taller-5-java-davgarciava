package zooAnimales;

import java.util.*;

public class Anfibio extends Animal {
	private static List<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		Anfibio.listado.add(this);
	}
	
	public static int cantidadAnfibios() {
		int cantidadAnfibios = 0;
		for(int i = 0; i < listado.size(); i++) {
			cantidadAnfibios++;
		}
		return cantidadAnfibios;
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		Anfibio.ranas++;
		return rana;
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		Anfibio.ranas++;
		return salamandra;
	}
	
	public String getColorPiel() {
		return this.colorPiel;
	}
	
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return this.venenoso;
	}
	
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	public static List<Anfibio> getListado() {
		return Anfibio.listado;
	}
}
