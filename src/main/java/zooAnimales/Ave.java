package zooAnimales;

import java.util.*;

public class Ave extends Animal {
	private static List<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave() {}
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
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
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		Ave.halcones++;
		return halcon;
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave aguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		Ave.aguilas++;
		return aguila;
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
