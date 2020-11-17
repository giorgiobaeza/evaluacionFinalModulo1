package cl.awakelab.evaluacion2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ Clase contenedor 
 * @ autores Jorge, Catherine, Yamilet
 * @ versi�n 16/11/2020 7
 */
public class Contenedor {

	private List<Asesoria> listaUsuario = new ArrayList<Asesoria>();
	private List<Capacitacion> listaC = new ArrayList<Capacitacion>();
	Scanner sc = new Scanner(System.in);

	private String buscar;//no se ha utilizado.Eliminar

	/**
	 * Almacenar cliente.
	 *
	 * @param cl valor que se le da a la Interfaz asesoria
	 */

	public void almacenarCliente(Asesoria cl) {
		System.out.println("INFORMACI�N DEL USUARIO");

		int i = 0, telefono = 0, sistemaSalud = 0, edad = 0;
		String nombreUser = "", rutUser = "", rut = "", nombre = "", apellidos = "", afp = "", direccion = "",
				comuna = "", fechaNacimiento = "";
		while (i == 0) {

			System.out.println("Ingrese el nombre del usuario");
			nombreUser = sc.nextLine();
			if (nombreUser.length() >= 10 && nombreUser.length() <= 50) {
				i = 1;
			} else {
				System.out
						.println("Nombre de usuario no cumple, deben ser m�nimo 10 caracteres y m�ximo 50 car�cteres");
			}
		}
		i = 0;
		while (i == 0) {

			System.out.println("Ingrese la fecha de nacimiento del usuario en formato dd/mm/aaaa");
			fechaNacimiento = sc.nextLine();
			String[] parts = fechaNacimiento.split("/");
			String part1 = parts[0];
			String part2 = parts[1];
			String part3 = parts[2];
			int p1 = Integer.parseInt(part1);
			int p2 = Integer.parseInt(part2);
			int p3 = Integer.parseInt(part3);
			if (p1 > 0 && p1 <= 30 && p2 > 0 && p2 <= 12 && p3 > 1900) {
				fechaNacimiento = p1 + "/" + p2 + "/" + p3;
				i = 1;
			} else {
				System.out.println("Fecha mal ingresada debe ingresar formato dd/mm/aaaa");
			}
		}
		i = 0;
		while (i == 0) {
			System.out.println("Ingrese run del usuario sin gui�n y sin d�gito verificador");
			rutUser = sc.nextLine();
			if (Integer.parseInt(rutUser) < 99999999) {
				i = 1;
			} else {
				System.out.println("Run no es v�lido");
			}
		}
		System.out.println("INFORMACI�N DEL CLIENTE");
		i = 0;
		while (i == 0) {
			System.out.println("Ingrese su rut sin gui�n y sin d�gito verificador");
			rut = sc.nextLine();
			if (Integer.parseInt(rut) < 99999999) {
				i = 1;
			} else {
				System.out.println("Rut no es v�lido");
			}
		}
		i = 0;
		while (i == 0) {
			System.out.println("Ingrese su nombre (s�lo nombres)");
			nombre = sc.nextLine();
			if (nombre.length() >= 5 && nombre.length() <= 30) {
				i = 1;
			} else {
				System.out.println("Nombre no cumple, deben ser m�nimo 5 caracteres y m�ximo 30 car�cteres");
			}
		}
		i = 0;
		while (i == 0) {
			System.out.println("Ingrese sus apellidos");
			apellidos = sc.nextLine();
			if (apellidos.length() >= 5 && apellidos.length() <= 30) {
				i = 1;
			} else {
				System.out.println("Apellido no cumple, deben ser m�nimo 5 caracteres y m�ximo 30 car�cteres");
			}
		}
		i = 0;
		while (i == 0) {
			System.out.println("Ingrese su tel�fono");
			telefono = sc.nextInt();
			if (telefono < 99999999 && telefono > 0) {
				i = 1;
			} else {
				System.out.println("tel�fono no es v�lido");
			}
		}
		i = 0;
		while (i == 0) {
			sc.nextLine();
			System.out.println("Ingrese su AFP");
			afp = sc.nextLine();
			if (afp.length() >= 4 && afp.length() <= 30) {
				i = 1;
			} else {
				System.out.println("AFP no cumple, deben ser m�nimo 4 caracteres y m�ximo 30 car�cteres");
			}
		}
		i = 0;
		while (i == 0) {
			System.out.println("Ingrese su sistema de salud");
			System.out.println("1.- FONASA");
			System.out.println("2.- ISAPRE");
			sistemaSalud = sc.nextInt();
			if (sistemaSalud == 1 || sistemaSalud == 2) {
				i = 1;
			} else {
				System.out.println("Ingrese valor de 1 o 2");
			}
		}
		i = 0;
		while (i == 0) {
			sc.nextLine();
			System.out.println("Ingrese su direcci�n");
			direccion = sc.nextLine();
			if (direccion.length() <= 70) {
				i = 1;
			} else {
				System.out.println("Direcci�n no cumple, debe ingrtesar hasta 70 car�cteres");
			}
		}
		i = 0;
		while (i == 0) {
			System.out.println("Ingrese su comuna");
			comuna = sc.nextLine();
			if (comuna.length() <= 50) {
				i = 1;
			} else {
				System.out.println("Comuna no cumple, debe ingresar hasta 50 car�cteres");
			}
		}
		i = 0;
		while (i == 0) {
			System.out.println("Ingrese su edad");
			edad = sc.nextInt();
			if (edad >= 0 && edad <= 150) {
				i = 1;
			} else {
				System.out.println("Edad no cumple, debe ingresar n�mero entre 0 y 150");
			}
		}
		sc.nextLine();

		Cliente clie = new Cliente(nombreUser, fechaNacimiento, rutUser, rut, nombre, apellidos, telefono, afp,
				sistemaSalud, direccion, comuna, edad);
		listaUsuario.add(clie);
	}

	/**
	 * m�todo Almacenar profesional se ingresa la informaci�n del profesional para
	 * ser almacenada
	 *
	 * @param pr valor que se le da a la Interfaz asesoria
	 */
	public void almacenarProfesional(Asesoria pr) {
		System.out.println("INFORMACI�N DEL USUARIO");

		int i = 0;
		String nombreUser = "", fechaNacimiento = "", rutUser = "", titulo = "", fechaIngreso = "";
		while (i == 0) {
			System.out.println("Ingrese el nombre del usuario");
			nombreUser = sc.nextLine();

			if (nombreUser.length() >= 10 && nombreUser.length() <= 50) {
				i = 1;
			} else {
				System.out
						.println("Nombre de ususario no cumple, deben ser m�nimo 10 caracteres y m�ximo 50 car�cteres");
			}
		}
		i = 0;
		while (i == 0) {

			System.out.println("Ingrese la fecha de nacimiento del usuario en formato dd/mm/aaaa");
			fechaNacimiento = sc.nextLine();
			String[] parts = fechaNacimiento.split("/");
			String part1 = parts[0];
			String part2 = parts[1];
			String part3 = parts[2];
			int p1 = Integer.parseInt(part1);
			int p2 = Integer.parseInt(part2);
			int p3 = Integer.parseInt(part3);
			if (p1 > 0 && p1 <= 30 && p2 > 0 && p2 <= 12 && p3 > 1900) {
				fechaNacimiento = p1 + "/" + p2 + "/" + p3;
				i = 1;
			} else {
				System.out.println("Fecha mal ingresada debe ingresar formato dd/mm/aaaa");
			}
		}
		i = 0;
		while (i == 0) {
			System.out.println("Ingrese run del usuario sin gui�n y sin d�gito verificador");
			rutUser = sc.nextLine();
			if (Integer.parseInt(rutUser) < 99999999) {
				i = 1;
			} else {
				System.out.println("Run no es v�lido");
			}
		}
		i = 0;
		while (i == 0) {
			System.out.println("Ingrese su t�tulo");
			titulo = sc.nextLine();
			if (titulo.length() >= 10 && titulo.length() <= 50) {
				i = 1;
			} else {
				System.out.println("T�tulo no cumple, deben ser m�nimo 10 caracteres y m�ximo 50 car�cteres");
			}
		}
		i = 0;
		while (i == 0) {
			System.out.println("Ingrese su fecha de ingreso con el formato dd/mm/aaaa");
			fechaIngreso = sc.nextLine();
			if (fechaIngreso.length() >= 10 && fechaIngreso.length() <= 50) {
				i = 1;
			} else {
				System.out.println("Fecha de ingreso no cumple, formato de fecha incorrecto");
			}
		}
		Profesional pro = new Profesional(nombreUser, fechaNacimiento, rutUser, titulo, fechaIngreso);

		listaUsuario.add(pro);
	}

	/**
	 * m�todo Almacenar administrativo se ingresa la informaci�n del administrativo
	 * para ser almacenada
	 *
	 * @param ad valor que se le da a la Interfaz asesoria
	 */

	public void almacenarAdministrativo(Asesoria ad) {

		System.out.println("INFORMACI�N DEL USUARIO");

		int i = 0;
		String nombreUser = "", fechaNacimiento = "", rutUser = "", area = "", expePrevia = "";
		while (i == 0) {
			System.out.println("Ingrese el nombre del usuario");
			nombreUser = sc.nextLine();

			if (nombreUser.length() >= 10 && nombreUser.length() <= 50) {
				i = 1;
			} else {
				System.out
						.println("Nombre de usuario no cumple, deben ser m�nimo 10 caracteres y m�ximo 50 car�cteres");
			}
		}
		i = 0;
		while (i == 0) {

			System.out.println("Ingrese la fecha de nacimiento del usuario en formato dd/mm/aaaa");
			fechaNacimiento = sc.nextLine();
			String[] parts = fechaNacimiento.split("/");
			String part1 = parts[0];
			String part2 = parts[1];
			String part3 = parts[2];
			int p1 = Integer.parseInt(part1);
			int p2 = Integer.parseInt(part2);
			int p3 = Integer.parseInt(part3);
			if (p1 > 0 && p1 <= 30 && p2 > 0 && p2 <= 12 && p3 > 1900) {
				fechaNacimiento = p1 + "/" + p2 + "/" + p3;
				i = 1;
			} else {
				System.out.println("Fecha mal ingresada debe ingresar formato dd/mm/aaaa");
			}
		}
		i = 0;
		while (i == 0) {
			System.out.println("Ingrese run del usuario sin gui�n y sin d�gito verificador");
			rutUser = sc.nextLine();
			if (Integer.parseInt(rutUser) < 99999999) {
				i = 1;
			} else {
				System.out.println("Run no es v�lido");
			}
		}
		i = 0;
		while (i == 0) {
			System.out.println("Ingrese su �rea");
			area = sc.nextLine();
			if (area.length() >= 5 && area.length() <= 20) {
				i = 1;
			} else {
				System.out.println("Area no cumple, deben ser m�nimo 5 caracteres y m�ximo 20 car�cteres");
			}
		}
		i = 0;
		while (i == 0) {
			System.out.println("Ingrese su experiencia previa");
			expePrevia = sc.nextLine();
			if (expePrevia.length() <= 100) {
				i = 1;
			} else {
				System.out.println("Area no cumple, deben ser m�nimo 5 caracteres y m�ximo 20 car�cteres");
			}
		}
		Administrativo adm = new Administrativo(nombreUser, fechaNacimiento, rutUser, area, expePrevia);

		listaUsuario.add(adm);
	}

	/**
	 * m�todo Almacenar capacitacion se ingresa la informaci�n de la capacitaci�n
	 * para ser almacenada
	 *
	 * @param c valor que se le da a la Interfaz asesoria
	 */
	public void almacenarCapacitacion(Asesoria c) {
		String rut = "", dia = "", hora = "", lugar = "", duracion = "";
		int i = 0, id_capacitacion = 0, cantAsistentes = 0;
		i = 0;
		while (i == 0) {
			System.out.println("Ingrese rut del cliente que solicita la capacitaci�n");
			rut = sc.nextLine();
			if (rut.length() <= 999999999) {
				i = 1;
			} else {
				System.out.println("Area no cumple, deben ser m�nimo 5 caracteres y m�ximo 20 car�cteres");
			}
		}
		i = 0;
		while (i == 0) {
			System.out.println(
					"Seleccione un d�a: 1.-Lunes 2.-Martes 3.-Miercoles 4.-Jueves 5.-Viernes 6.-Sabado 7.-Domingo");
			int sel = sc.nextInt();

			if (sel == 1) {
				dia = "Lunes";
			} else if (sel == 2) {
				dia = "Martes";
			} else if (sel == 3) {
				dia = "Miercoles";
			} else if (sel == 4) {
				dia = "Jueves";
			} else if (sel == 5) {
				dia = "Viernes";
			} else if (sel == 6) {
				dia = "Sabado";
			} else if (sel == 7) {
				dia = "Domingo";
			} else {
				System.out.println("Seleccione una opci�n v�lida");
			}

			if (dia.equals("Lunes") || dia.equals("Martes") || dia.equals("Miercoles") || dia.equals("Jueves")
					|| dia.equals("Viernes") || dia.equals("Sabado") || dia.equals("Domingo")) {
				i = 1;
			} else {
				System.out.println("Area no cumple, deben ser m�nimo 5 caracteres y m�ximo 20 car�cteres");
			}
		}
		i = 0;
		while (i == 0) {
			sc.nextLine();
			System.out.println("Ingrese hora en formato HH:MM");
			hora = sc.nextLine();
			String[] parts = hora.split(":");
			String part1 = parts[0];
			String part2 = parts[1];
			int p1 = Integer.parseInt(part1);
			int p2 = Integer.parseInt(part2);
			if (p1 >= 0 && p1 <= 23 && p2 >= 0 && p2 <= 59) {
				hora = p1 + ":" + p2;
				i = 1;
			} else {
				System.out.println("Hora mal ingresada, debe usar un formato HH:MM");
			}
		}
		i = 0;
		while (i == 0) {
			System.out.println("Ingrese lugar");
			lugar = sc.nextLine();
			if (lugar.length() >= 10 && lugar.length() <= 50) {
				i = 1;
			} else {
				System.out.println("Lugar no cumple, deben ser m�nimo 10 caracteres y m�ximo 50 car�cteres");
			}
		}
		i = 0;
		while (i == 0) {
			System.out.println("Ingrese duraci�n en minutos");
			duracion = sc.nextLine();
			if (duracion.length() <= 70) {
				i = 1;
			} else {
				System.out.println("Duraci�n no cumple, debe tener un m�ximo de 70 car�cteres");
			}
		}
		i = 0;
		while (i == 0) {
			System.out.println("Ingrese cantidad de asistentes");
			cantAsistentes = sc.nextInt();
			if (cantAsistentes <= 1000) {
				i = 1;
			} else {
				System.out.println("M�ximo de asistentes permitidos 1000");
			}
		}

		Capacitacion cap = new Capacitacion(id_capacitacion, rut, dia, hora, lugar, duracion, cantAsistentes);

		listaC.add(cap);
	}

	/**
	 * m�todo Eliminar usuario seg�n rut ingresado elimina la informaci�n de ese
	 * usuario
	 */
	public void eliminarUsuario() {
		// buscar rut a eliminar
		System.out.println("Ingrese el elemento a buscar ");
		buscar = sc.nextLine();
		int pos = -1;

		for (int i = 0; i < listaUsuario.size(); i++) {

			Usuario user = (Usuario) listaUsuario.get(i);
			if (user.getRun().equals(buscar)) {
				pos = i;
			}

		}

		if (pos > -1) {
			System.out.println("dato eliminado");
			listaUsuario.remove(pos);
		} else {
			System.out.println("dato no encontrado");
		}

	}

	/**
	 * m�todo Listar usuario muestra la informaci�n de los usuarios almacenados
	 */
	public void listarUsuario() {
		for (Asesoria A : listaUsuario) {
			A.analizarUsuario();
			System.out.println();
		}
	}

	/**
	 * m�todo Listar usuario por tipo seg�n la selecci�n muestra la informaci�n.
	 */
	public void listarUsuarioPorTipo() {

		System.out.println("Seleccione una categor�a: 1.-Cliente 2.-Profesional 3.-Administrativo");
		int selector = sc.nextInt();
		String categoria = "";
		String clase;

		if (selector == 1) {
			categoria = "Cliente";

		} else if (selector == 2) {
			categoria = "Profesional";
			Profesional pro = new Profesional();

		} else if (selector == 3) {
			categoria = "Administrativo";

		} else {
			System.out.println("Respuesta inv�lida");
		}

		for (Asesoria tmp : listaUsuario) {
			clase = tmp.getClass().getSimpleName();

			if (clase.trim().equals(categoria.trim())) {

				if (clase.equals("Cliente")) {
					tmp.mostrarDetalle();

					System.out.println();

				} else if (clase.equals("Profesional")) {
					tmp.mostrarDetalle();
					System.out.println();

				} else if (clase.equals("Administrativo")) {
					tmp.mostrarDetalle();
					System.out.println();
				}

			}
		}
	}

	/**
	 * m�todo Listar cliente busca la informaci�n seg�n el rut ingresado
	 *
	 * @param buscar
	 */
	public void listarCliente(String buscar) {
		this.buscar = buscar;
		for (int i = 0; i < listaUsuario.size(); i++) {

			Cliente user = (Cliente) listaUsuario.get(i);

			if (user.getRut().equals(buscar)) {

				System.out.println("***DATOS DEL CLIENTE***");
				user.mostrarDetalle();
				break;

			} else {
				System.out.println("Este cliente no tiene asociada capacitaciones");
				break;
			}
		}
	}

	/**
	 * M�todo Listar capacitaciones entrega la informaci�n del cliente y la
	 * capacitaci�n
	 *
	 * @param buscar
	 */
	public void listarCapacitaciones(String buscar) {
		this.buscar = buscar;

		for (int j = 0; j < listaC.size(); j++) {

			Capacitacion cap = listaC.get(j);

			if (cap.getRutCliente().equals(buscar)) {

				System.out.println("***DATOS DE LA CAPACITACI�N***");
				cap.mostrarDetalle();
				break;
			} else {
				System.out.println("La capacitaci�n no est� asociada a ning�n cliente");
				break;
			}
		}

		listarCliente(buscar);

	}
}
