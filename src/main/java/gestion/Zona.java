package gestion;

import zooAnimales.Animal;
import java.util.*;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private List<Animal> animales;
	
	public Zona() {}
	
	public Zona(String nombre, Zoologico zoo, List<Animal> animales) {
		this.nombre = nombre;
		this.zoo = zoo;
		this.animales = animales;
	}
	
	public void agregarAnimales(String nombre, int edad, String habitat, String genero) {
		Animal nuevoAnimal = new Animal(nombre, edad, habitat, genero, this);
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
