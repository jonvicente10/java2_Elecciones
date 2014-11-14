
// Se importan las librerias necesarias
import com.zubiri.elecciones.*;
import java.util.*;
import java.io.*;

public class Main3 {

	public static void main (String args[]) throws IOException {

		// Declaracion de variables
		String valorintroducido;
		char opcion = 'K';
		Scanner sc = new Scanner(System.in);

		System.out.print("\nElige una opcion: [A]yuntamiento, [E]spacioPublico, [H]abitante, [I]nmueble, [P]artido, [S]alir: ");
		valorintroducido = sc.next();
		opcion = valorintroducido.charAt(0);

		while (opcion != ('S') && opcion != ('s'))
		{

			if (opcion=='A' || opcion=='a')
			{
				System.out.print("\n--------------------------------------------------------------------\n");
				System.out.print("\nHas elegido Ayuntamiento, introduce ahora los datos que quieras:\n");
				int trabajadores_intro;
				String pueblo_intro, direccion_intro;
				Ayuntamiento ayuntamiento1 = new Ayuntamiento();
				// Recoger valores del usuario
					System.out.print("\n- Nombre del pueblo: ");
					pueblo_intro = sc.next();
					System.out.print("- Direccion: ");
					direccion_intro = sc.next();
					System.out.print("- Cantidad de trabajadores: ");
					trabajadores_intro = sc.nextInt();
				// Asignar valores con set
					ayuntamiento1.setTrabajadores(trabajadores_intro);
					ayuntamiento1.setPueblo(pueblo_intro);
					ayuntamiento1.setDireccion(direccion_intro);
				// Mostrar en pantalla los datos utilizando get
					System.out.println("\nDatos del ayuntamiento introducido:\n");
					System.out.println("- Nombre del pueblo introducido = " + ayuntamiento1.getPueblo());
					System.out.println("- Direccion introducida = " + ayuntamiento1.getDireccion());
					System.out.println("- Cantidad de trabajadores introducido = " + ayuntamiento1.getTrabajadores());
				// Volver a preguntar que hacer
					System.out.print("\n--------------------------------------------------------------------\n");
					System.out.print("\nOperacion finalizada.\n");
					System.out.print("\nVuelva a elegir una opcion: [A]yuntamiento, [E]spacioPublico, [H]abitante, [I]nmueble, [P]artido, [S]alir: ");
					valorintroducido = sc.next();
					opcion = valorintroducido.charAt(0);
			}

			else if (opcion=='E' || opcion=='e')
			{
				System.out.print("\n--------------------------------------------------------------------\n");
				System.out.print("\nHas elegido EspacioPublico, introduce ahora los datos que quieras:\n");
				int capacidad_intro;
				String tipo_intro, pueblo_intro, direccion_intro;
				boolean zonawifi_intro;
				EspacioPublico espaciopublico1 = new EspacioPublico();
				// Recoger valores del usuario
					System.out.print("\n- Tipo (plaza, estatua...): ");
					tipo_intro = sc.next();
					System.out.print("- Capacidad: ");
					capacidad_intro = sc.nextInt();
					System.out.print("- Direccion: ");
					direccion_intro = sc.next();
					System.out.print("- Pueblo: ");
					pueblo_intro = sc.next();
					System.out.print("- Zona wifi (true/false): ");
					zonawifi_intro = sc.nextBoolean();
				// Asignar valores con set
					espaciopublico1.setCapacidad(capacidad_intro);
					espaciopublico1.setTipo(tipo_intro);
					espaciopublico1.setPueblo(pueblo_intro);
					espaciopublico1.setDireccion(direccion_intro);
					espaciopublico1.setZonawifi(zonawifi_intro);
				// Mostrar en pantalla los datos utilizando get
					System.out.println("\nDatos del espaciopublico introducido:\n");
					System.out.println("- Tipo (plaza, estatua...) introducido = " + espaciopublico1.getTipo());
					System.out.println("- Capacidad introducida = " + espaciopublico1.getCapacidad());
					System.out.println("- Direccion introducida = " + espaciopublico1.getDireccion());
					System.out.println("- Pueblo introducido = " + espaciopublico1.getPueblo());
					if (espaciopublico1.getZonawifi())
					{  // Si esta en mandato mostrara si, y sino mostrara no.
						System.out.println("- Zona Wifi introducida = si");
					}
					else 
					{
						System.out.println("- Zona Wifi introducida = no");
					}
				// Volver a preguntar que hacer
					System.out.print("\n--------------------------------------------------------------------\n");
					System.out.print("\nOperacion finalizada.\n");
					System.out.print("\nVuelva a elegir una opcion: [A]yuntamiento, [E]spacioPublico, [H]abitante, [I]nmueble, [P]artido, [S]alir: ");
					valorintroducido = sc.next();
					opcion = valorintroducido.charAt(0);
			}

			else if (opcion=='H' || opcion=='h')
			{
				System.out.print("\n--------------------------------------------------------------------\n");
				System.out.print("\nHas elegido Habitante, introduce ahora los datos que quieras:\n");
				int edad_intro;
				String nombre_intro, direccion_intro, telefono_intro, dni_intro;
				Habitante habitante1 = new Habitante();
				// Recoger valores del usuario
					System.out.print("\n- Nombre: ");
					nombre_intro = sc.next();
					System.out.print("- Edad: ");
					edad_intro = sc.nextInt();
					System.out.print("- Direccion: ");
					direccion_intro = sc.next();
					System.out.print("- Telefono: ");
					telefono_intro = sc.next();
					System.out.print("- Dni: ");
					dni_intro = sc.next();
				// Asignar valores con set
					habitante1.setEdad(edad_intro);
					habitante1.setNombre(nombre_intro);
					habitante1.setDireccion(direccion_intro);
					habitante1.setTelefono(telefono_intro);
					habitante1.setDni(dni_intro);
				// Mostrar en pantalla los datos utilizando get
					System.out.println("\nDatos del habitante introducido:\n");
					System.out.println("- Nombre introducido = " + habitante1.getNombre());
					System.out.println("- Edad introducida = " + habitante1.getEdad());
					System.out.println("- Direccion introducida = " + habitante1.getDireccion());
					System.out.println("- Telefono introducido = " + habitante1.getTelefono());
					System.out.println("- Dni introducido = " + habitante1.getDni());
				// Volver a preguntar que hacer
					System.out.print("\n--------------------------------------------------------------------\n");
					System.out.print("\nOperacion finalizada.\n");
					System.out.print("\nVuelva a elegir una opcion: [A]yuntamiento, [E]spacioPublico, [H]abitante, [I]nmueble, [P]artido, [S]alir: ");
					valorintroducido = sc.next();
					opcion = valorintroducido.charAt(0);
			}

			else if (opcion=='I' || opcion=='i')
			{
				System.out.print("\n--------------------------------------------------------------------\n");
				System.out.print("\nHas elegido Inmueble, introduce ahora los datos que quieras:\n");
				int area_intro, plantas_intro, año_intro;
				String direccion_intro, dueño_intro;
				Inmueble inmueble1 = new Inmueble();
				// Recoger valores del usuario
					System.out.print("\n- Direccion: ");
					direccion_intro = sc.next();
					System.out.print("- Area del inmueble: ");
					area_intro = sc.nextInt();
					System.out.print("- Numero de plantas: ");
					plantas_intro = sc.nextInt();
					System.out.print("- Año de construccion: ");
					año_intro = sc.nextInt();
					System.out.print("- Dueño: ");
					dueño_intro = sc.next();
				// Asignar valores con set
					inmueble1.setArea(area_intro);
					inmueble1.setPlantas(plantas_intro);
					inmueble1.setAño(año_intro);
					inmueble1.setDireccion(direccion_intro);
					inmueble1.setDueño(dueño_intro);
				// Mostrar en pantalla los datos utilizando get
					System.out.println("\nDatos del inmueble introducido:\n");
					System.out.println("- Direccion introducida = " + inmueble1.getDireccion());
					System.out.println("- Area del inmueble introducida = " + inmueble1.getArea());
					System.out.println("- Numero de plantas introducidas = " + inmueble1.getPlantas());
					System.out.println("- Año de construccion introducido = " + inmueble1.getAño());
					System.out.println("- Dueño introducido = " + inmueble1.getDueño());
				// Volver a preguntar que hacer
					System.out.print("\n--------------------------------------------------------------------\n");
					System.out.print("\nOperacion finalizada.\n");
					System.out.print("\nVuelva a elegir una opcion: [A]yuntamiento, [E]spacioPublico, [H]abitante, [I]nmueble, [P]artido, [S]alir: ");
					valorintroducido = sc.next();
					opcion = valorintroducido.charAt(0);
			}

			else if (opcion=='P' || opcion=='p')
			{
				// Si la opcion es 'P' o 'p', preguntara de nuevo que hacer
				System.out.print("\n--------------------------------------------------------------------\n");
				System.out.print("\nHas elegido Partido, ¿que quieres hacer ahora? [L]eer datos desde el archivo, [R]ellenar datos y mostrarlos en pantalla: ");
				valorintroducido = sc.next();
				char opcion2 = valorintroducido.charAt(0);
				// Si la opcion es leer, leera los partidos del archivo y los guardara en objetos, para despues guardar estos en objetos.
				if (opcion2=='L' || opcion2=='l')
				{
					System.out.print("\nHas elegido Leer datos, los datos seran guardados en un ArrayList y despues mostrados en pantalla:\n");
					BufferedReader br = new BufferedReader(new FileReader("/home/jon//proyectosjava/java2_elecciones/archivos/listadoPartidos.txt"));
					String linea;
			   		ArrayList <Partido> array_partidos = new ArrayList <Partido>();
					// Guardar los objetos de tipo partido en array_partidos
						while ((linea = br.readLine()) != null)
						{
		  					Partido partido1 = new Partido();
		   					partido1.setNombre(linea);
							array_partidos.add(partido1);
						}
						// Mostrar los datos de los partidos que estan dentro del ArrayList
						int cantidad_partidos =  array_partidos.size();
						// Mostrar cantidad de partidos en el array
						System.out.print("\nNumero de elementos en el ArrayList = " + cantidad_partidos + "\n");
						System.out.print("\nAhora se mostraran los nombres de los partidos dentro del ArrayList:\n");
						int i = 0;
						for (i=0; i<array_partidos.size();i++)
						{
							// Obtendra el nombre de cada objeto de tipo partido dentro del ArrayList
							Partido partido_obtenido = array_partidos.get(i);
							System.out.print(partido_obtenido.getNombre() + "\n");
						}
						// Vaciar el ArrayList
						array_partidos.clear();
						// Numero de partidos despues de vaciar el Arraylist
						System.out.print("\nNumero de elementos en el Arraylist despues de vaciarlo = " + array_partidos.size() + "\n");
						br.close();
					// Volver a preguntar que hacer
						System.out.print("\n--------------------------------------------------------------------\n");
						System.out.print("\nOperacion finalizada.\n");
						System.out.print("\nVuelva a elegir una opcion: [A]yuntamiento, [E]spacioPublico, [H]abitante, [I]nmueble, [P]artido, [S]alir: ");
						valorintroducido = sc.next();
						opcion = valorintroducido.charAt(0);
				}
				// Si la opcion es rellenar, simplemente pedira datos, los guardara en obetos y luego los mostrara en pantalla usando get.
				else if (opcion2=='R' || opcion2=='r')
				{
					System.out.print("\nHas elegido Rellenar datos, introduce ahora los datos que quieras:\n");
					int miembros_intro;
					String nombre_intro, ideologia_intro, candidato_intro;
					boolean mandato_intro;
					Partido partido1 = new Partido();
					// Recoger valores del usuario
						System.out.print("\n- Nombre del partido: ");
						nombre_intro = sc.next();
						System.out.print("- Ideologia: ");
						ideologia_intro = sc.next();
						System.out.print("- Candidato: ");
						candidato_intro = sc.next();
						System.out.print("- Cantidad de miembros: ");
						miembros_intro = sc.nextInt();
						System.out.print("- Actualmente en mandato (true/false): ");
						mandato_intro = sc.nextBoolean();
					// Asignar valores con set
						partido1.setMiembros(miembros_intro);
						partido1.setNombre(nombre_intro);
						partido1.setIdeologia(ideologia_intro);
						partido1.setCandidato(candidato_intro);
						partido1.setMandato(mandato_intro);
					// Mostrar en pantalla los datos utilizando get
						System.out.println("\nDatos del partido introducido:\n");
						System.out.println("- Nombre del partido introducido = " + partido1.getNombre());
						System.out.println("- Ideologia introducida = " + partido1.getIdeologia());
						System.out.println("- Candidato introducido = " + partido1.getCandidato());
						System.out.println("- Cantidad de miembros introducida = " + partido1.getMiembros());
						if (partido1.getMandato())
						{  // Si esta en mandato mostrara si, y sino mostrara no.
							System.out.println("- Actualmente en mandato = si");
						}
						else 
						{
							System.out.println("- Actualmente en mandato = no");
						}
				// Volver a preguntar que hacer
					System.out.print("\n--------------------------------------------------------------------\n");
					System.out.print("\nOperacion finalizada.\n");
					System.out.print("\nVuelva a elegir una opcion: [A]yuntamiento, [E]spacioPublico, [H]abitante, [I]nmueble, [P]artido, [S]alir: ");
					valorintroducido = sc.next();
					opcion = valorintroducido.charAt(0);
				}
				else
				{
					System.out.print("\nElige una opcion correcta!\n");
					System.out.print("\nElige una opcion: [L]eer datos desde el archivo, [R]ellenar datos y mostrarlos en pantalla: ");
					valorintroducido = sc.next();
					opcion2 = valorintroducido.charAt(0);
				}
			}
			
			else
			{
				System.out.print("\nElige una opcion correcta!\n");
				System.out.print("\nElige una opcion: [A]yuntamiento, [E]spacioPublico, [H]abitante, [I]nmueble, [P]artido, [S]alir: ");
				valorintroducido = sc.next();
				opcion = valorintroducido.charAt(0);
			}
		}
	}
}