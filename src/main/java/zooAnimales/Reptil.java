package zooAnimales;

import java.util.*;

public class Reptil extends Animal {
	private static List<Reptil> listado = new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		Reptil.listado.add(this);
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		Reptil.listado.add(this);
	}
	
	public static int cantidadReptiles() {
		int cantidadReptiles = 0;
		for(int i = 0; i < listado.size(); i++) {
			cantidadReptiles++;
		}
		return cantidadReptiles;
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		Reptil.iguanas++;
		return iguana;
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil serpiente = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		Reptil.serpientes++;
		return serpiente;
	}
	
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return this.largoCola;
	}
	
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
	public static List<Reptil> getListado() {
		return Reptil.listado;
	}
}
