package zooAnimales;

import gestion.Zona;
import java.util.*;

public class Pez extends Animal {
	private static List<Pez> listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {}
	
	public Pez(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int cantidadAletas) {
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		setZona(zona);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		Pez.listado.add(this);
	}
	
	public static int cantidadPeces() {
		int cantidadPeces = 0;
		for(int i = 0; i < listado.size(); i++) {
			cantidadPeces++;
		}
		return cantidadPeces;
	}
	
	public String movimiento() {
		return "nadar";
	}
	
	public void crearSalmon(String nombre, int edad, String genero, Zona zona) {
		new Pez(nombre, edad, "oceano", genero, zona, "rojo", 6);
		Pez.salmones++;
	}
	
	public void crearBacalao(String nombre, int edad, String genero, Zona zona) {
		new Pez(nombre, edad, "oceano", genero, zona, "gris", 6);
		Pez.bacalaos++;
	}
	
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return this.cantidadAletas;
	}
	
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	public static List<Pez> getListado() {
		return Pez.listado;
	}
}
