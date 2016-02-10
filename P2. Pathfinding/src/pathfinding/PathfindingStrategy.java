/**
 * 
 */
package pathfinding;

import environment.Cell;
import environment.MapApp;

/**
 * @author Pablo Ramos
 *
 */
//Speed: Propiedad de la clase Map. Permite ajustar la velocidad en la que avanza el pathfinding
		// this.speed = 10; // Retardo de 10ms entre cada paso

public interface PathfindingStrategy {
	// Implementar heuristicas manhattan, chebyshev y euclidea
	// Ejemplo de implementacion de la interfaz heuristica con una funcion lambda que devuelve coste 0.0
	public final static HeuristicStrategy manhattan = (start,end) -> 0.0;
	
	public final static HeuristicStrategy chebyshev = (start,end) -> 0.0;
	
	public final static HeuristicStrategy euclidea = (start,end) -> 0.0;
	
	public void pathfind(Cell start, Cell end, HeuristicStrategy h, MapApp app);
	// A implementar en cada una de las estrategias de busqueda (AStar.java, Dijkstra.java, etc)
	// Implementar algoritmo de busqueda en esta funcion en su correspondiente clase.
	//Se pueden utilizar funciones auxiliares.
	
	// Se debe llamar a la funcion step de la clase app cada vez que se visite una nueva celda
	// Esta funcion asignara el orden en que las celdas son visitadas en el pathfinding
	// app.step(celda_visitada);
	
	// Se debe actualizar el valor path de cada celda perteneciente a la ruta con la siguiente
	// celda de la ruta obtenida entre los dos puntos. 
	// celda.path(celda_siguiente)
	
	// celda.reachable() indica la posibilidad de acceder a una celda del mapa
	// true indica que la celda es accesible 
	// false indica que la celda no es accesible dado que es una pared
	
	// celda.visited() indica si la celda has sido visitada o no
	// -1 indica que la celda no fue visitada
	// >=0 indica que la celda ya fue visitada
	
	// celda.neighborhood() devuelve una lista con el conjunto de vecinos de una celda
	// Se devuelven todos los vecinos independientemente de si son alacanzbles o no
	
	// Existen funciones adicionales que pueden ser utiles para el desarrollo de la practica
	// Vease la documentacion javadoc para el las librerias que se aportan.
}
