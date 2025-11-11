package Actividad;
/**
 * @author Maria Stefanie Bermudez 
 * 
 * clase estudiante 
 */

public class Estudiante {
	
	//atributos
	private String nombre;
	
	private int edad;
	
	private int nota;
//costructor
	public Estudiante(String nombre, int edad, int nota) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nota = nota;
	}
	//getter y setters
	public Estudiante() {
		
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String toString() {
		return "[nombre=" + nombre + ", edad=" + edad + ", nota=" + nota + "]";
	}
	
	
	
	
	
	
	
	

}
