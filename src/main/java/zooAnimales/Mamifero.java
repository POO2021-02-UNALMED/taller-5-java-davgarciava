package zooAnimales;

import java.util.*;

public class Mamifero extends Animal {
	private static List<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		this.pelaje = pelaje;
		this.patas = patas;
		Mamifero.listado.add(this);
	}
	
	public static int cantidadMamiferos() {
		int cantidadMamiferos = 0;
		for(int i = 0; i < listado.size(); i++) {
			cantidadMamiferos++;
		}
		return cantidadMamiferos;
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		Mamifero.caballos++;
		return caballo;
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
		Mamifero.leones++;
		return leon;
	}
	
	public boolean isPelaje() {
		return this.pelaje;
	}
	
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return this.patas;
	}
	
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public static List<Mamifero> getListado() {
		return Mamifero.listado;
	}
}
