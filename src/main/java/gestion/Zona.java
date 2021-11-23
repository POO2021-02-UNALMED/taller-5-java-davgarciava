package gestion;

import zooAnimales.Animal;
import java.util.*;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private List<Animal> animales = new ArrayList<Animal>();
	
	public Zona() {}
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}
	
	public void agregarAnimales(Animal nuevoAnimal) {
		nuevoAnimal.setZona(this);
		animales.add(nuevoAnimal);
	}
	
	public int cantidadAnimales() {
		int cantidadAnimales = 0;
		for(int i = 0; i < animales.size(); i++) {
			cantidadAnimales++;
		}
		return cantidadAnimales;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Zoologico getZoo() {
		return this.zoo;
	}
	
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	
	public List<Animal> getAnimales() {
		return this.animales;
	}
}
