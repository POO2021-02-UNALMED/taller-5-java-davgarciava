package zooAnimales;

import gestion.Zona;
import java.util.*;

public class Reptil extends Animal {
	private static List<Reptil> listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {}
	
	public Reptil(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int largoCola) {
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		setZona(zona);
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
	
	public void crearIguana(String nombre, int edad, String genero, Zona zona) {
		new Reptil(nombre, edad, "humedal", genero, zona, "verde", 3);
		Reptil.iguanas++;
	}
	
	public void crearSerpiente(String nombre, int edad, String genero, Zona zona) {
		new Reptil(nombre, edad, "jungla", genero, zona, "blanco", 1);
		Reptil.serpientes++;
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
