package gestion;

import java.util.*;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private List<Zona> zonas;
	
	public Zoologico() {}
	
	public Zoologico(String nombre, String ubicacion, List<Zona> zonas) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.zonas = zonas;
	}
	
	public void agregarZonas(String nombre) {
		Zona nuevaZona = new Zona(nombre, this, null);
		zonas.add(nuevaZona);
	}
	
	public int cantidadTotalAnimales() {
		int totalAnimales = 0;
		for(int i = 0; i < zonas.size(); i++) {
			totalAnimales += zonas.get(i).cantidadAnimales();
		}
		return totalAnimales;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getUbicacion() {
		return this.ubicacion;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public List<Zona> getZonas() {
		return this.zonas;
	}
}
