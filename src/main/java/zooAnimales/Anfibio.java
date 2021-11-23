package zooAnimales;

import gestion.Zona;
import java.util.*;

public class Anfibio extends Animal {
	private static List<Anfibio> listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, String colorPiel, boolean venenoso) {
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		setZona(zona);
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
	
	public void crearRana(String nombre, int edad, String genero, Zona zona) {
		new Anfibio(nombre, edad, "selva", genero, zona, "rojo", true);
		Anfibio.ranas++;
	}
	
	public void crearSalamandra(String nombre, int edad, String genero, Zona zona) {
		new Anfibio(nombre, edad, "selva", genero, zona, "negro y amarillo", false);
		Anfibio.ranas++;
	}
	
	public String getColorPiel() {
		return this.colorPiel;
	}
	
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean getVenenoso() {
		return this.venenoso;
	}
	
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	public static List<Anfibio> getListado() {
		return Anfibio.listado;
	}
}
