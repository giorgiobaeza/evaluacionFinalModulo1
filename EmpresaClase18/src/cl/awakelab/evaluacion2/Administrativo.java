package cl.awakelab.evaluacion2;

/* *
 * @ Clase administrativo
 * @ autores Jorge, Catherine, Yamilet
 * @ versi�n 16/11/2020 7
 * 
 */
public class Administrativo extends Usuario {
	
	/** Atributos de la clase encapsulados */
	private String area;
	private String expePrevia;
	
	
	/**
	 * Construtor de la clase vac�o
	 */
	public Administrativo() {
		super();
	}


	/**
	 * Constructor con los atributos de la clase administrativo y de la clase padre usuario
	 *
	 * @param nombreUser the nombre user
	 * @param fechaNacimiento the fecha nacimiento
	 * @param run the run
	 * @param area the area
	 * @param expePrevia the expe previa
	 */
	public Administrativo(String nombreUser, String fechaNacimiento, String run, String area, String expePrevia) {
		super(nombreUser, fechaNacimiento, run);
		this.area = area;
		this.expePrevia = expePrevia;
	}

	/**
	 * Gets the area.
	 *
	 * @return the area
	 */
	public String getArea() {
		return area;
	}


	/**
	 * Sets the area.
	 *
	 * @param area the new area
	 */
	public void setArea(String area) {
		this.area = area;
	}


	/**
	 * Gets the expe previa.
	 *
	 * @return the expe previa
	 */
	public String getExpePrevia() {
		return expePrevia;
	}


	/**
	 * Sets the expe previa.
	 *
	 * @param expePrevia the new expe previa
	 */
	public void setExpePrevia(String expePrevia) {
		this.expePrevia = expePrevia;
	}


	/**
	 * m�todo To string.
	 *
	 * @return un string
	 */
	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", expePrevia=" + expePrevia + "]";
	}


	/**
	 * m�todo Analizar usuario  muestra informaci�n de la clase padre y la informaci�n de la clase hija.
	 */
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Area:  " + this.area);
		System.out.println("A�os de Experiencia previa: " + this.expePrevia);
	}


	/**
	 * m�todo Mostrar detalle muestra la informaci�n del administrativo
	 */
	@Override
	public void mostrarDetalle() {

		System.out.println("Area: " + this.area);
		System.out.println("A�os de Experiencia previa: " + this.expePrevia + " a�os");
		
	}
	
	
	

}
