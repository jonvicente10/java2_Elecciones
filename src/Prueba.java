
// Se importan las librerias necesarias
import com.zubiri.elecciones.*;
import java.util.*;
import java.io.*;

public class Prueba {

	public static void main (String args[]) throws IOException {

			System.out.print("\nHas elegido Leer datos, los datos seran guardados en un ArrayList y despues mostrados en pantalla:\n");
			BufferedReader br = new BufferedReader(new FileReader("/home/jon//proyectosjava/java2_elecciones/archivos/listadoPartidos.txt"));
	   		ArrayList <Partido> array_partidos = new ArrayList <Partido>();			
	   		String linea = br.readLine();
			// Guardar los objetos de tipo partido en array_partidos
				while ((linea!= null)
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

	}

}