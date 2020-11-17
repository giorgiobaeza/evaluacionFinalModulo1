package cl.awakelab.evaluacion2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/* *
 * @ Clase hija Profesional
 * @ autores Jorge, Catherine, Yamilet
 * @ versi�n 16/11/2020 7
 * 
 */
public class Profesional extends Usuario {

	/** Atributos de la clase encapsulados */
	private String titulo;
	private String fechaIngreso;

	/**
	 * Constructor vac�o profesional.
	 */
	public Profesional() {
		super();
	}

	/**
	 * Constructor con los atributos de la clase profesional y de la clase padre usuario
	 *
	 * @param nombreUser the nombre user
	 * @param fechaNacimiento the fecha nacimiento
	 * @param run the run
	 * @param titulo the titulo
	 * @param fechaIngreso the fecha ingreso
	 */
	public Profesional(String nombreUser, String fechaNacimiento, String run, String titulo, String fechaIngreso) {
		super(nombreUser, fechaNacimiento, run);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	/**
	 * Gets the titulo.
	 *
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Sets the titulo.
	 *
	 * @param titulo the new titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Gets the fecha ingreso.
	 *
	 * @return the fecha ingreso
	 */
	public String getFechaIngreso() {

		return fechaIngreso;

	}

	/**
	 * Sets the fecha ingreso.
	 *
	 * @param fechaIngreso the new fecha ingreso
	 */
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	/**
	 * m�todo To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + "]";
	}

	/**
	 * m�todo Analizar usuario  muestra informaci�n de la clase padre y la informaci�n de la clase hija.
	 */
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("T�tulo  " + this.titulo);
		DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaIngreso = LocalDate.parse(this.getFechaIngreso(), date);//no se utiliza
		LocalDate fechaActual = LocalDate.now();//no se utiliza
		Period periodo = Period.between(fechaIngreso, fechaActual);//no se utiliza
		System.out.println("Fecha de ingreso " + this.getFechaIngreso());
	}

	/**
	 * m�todo Mostrar detalle muestra la informaci�n del profesional
	 */
	@Override
	public void mostrarDetalle() {

		System.out.println("T�tulo  " + this.titulo);
		System.out.println("Fecha de ingreso " + this.getFechaIngreso());
	}

}
