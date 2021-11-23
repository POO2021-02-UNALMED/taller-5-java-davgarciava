package gestion;

import java.util.*;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private List<Zona> zonas = new ArrayList<Zona>();
	
	public Zoologico() {}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public void agregarZonas(Zona nuevaZona) {
		nuevaZona.setZoo(this);
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
	
	public List<Zona> getZona() {
		return this.zonas;
	}
}
