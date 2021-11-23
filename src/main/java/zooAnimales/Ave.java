package zooAnimales;

import gestion.Zona;
import java.util.*;

public class Ave extends Animal {
	private static List<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave() {}
	
	public Ave(String nombre, int edad, String habitat, String genero, Zona zona, String colorPlumas) {
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		setZona(zona);
		this.colorPlumas = colorPlumas;
		Ave.listado.add(this);
	}
	
	public static int cantidadAves() {
		int cantidadAves = 0;
		for(int i = 0; i < listado.size(); i++) {
			cantidadAves++;
		}
		return cantidadAves;
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public void crearHalcon(String nombre, int edad, String genero, Zona zona) {
		new Ave(nombre, edad, "montanas", genero, zona, "cafe glorioso");
		Ave.halcones++;
	}
	
	public void crearAguila(String nombre, int edad, String genero, Zona zona) {
		new Ave(nombre, edad, "montanas", genero, zona, "blanco y amarillo");
		Ave.aguilas++;
	}
	
	public String getColorPlumas() {
		return this.colorPlumas;
	}
	
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	public static List<Ave> getListado() {
		return Ave.listado;
	}
}
