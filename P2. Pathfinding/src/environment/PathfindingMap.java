package environment;

import environment.Map;

public class PathfindingMap extends Map{
	private int []start; // Coordenadas {y,x} del punto de inicio de la ruta
	private int []end; // Coordenadas {y,x} del punto de final de la ruta
	

	public PathfindingMap(int width, int height, MapApp app) {
		super(width, height, app);
		// Speed: Propiedad de la clase Map. Permite ajustar la velocidad en la que avanza el pathfinding
		// this.speed = 10; // Retardo de 10ms entre cada paso
	
	}
	
	public void pathfind(int []start, int []end) {
		this.start = start;
		this.end = end;
		
		// TODO Implementar algoritmo de busqueda aquí. Se pueden utilizar funciones auxiliares.
		// Se debe llamar a la función step de la clase Map cada vez que se visite una nueva celda
		// step(y,x)
		
		// Se debe actualizar el valor del array this.path con la ruta obtenida entre los dos puntos. 
		// Se le asignará un valor true a cada celda pertenciente a la ruta obtenida.
		// Cada celda de this.path se pintará de color cyan.
		
		// this.reachable indica la posibilidad de acceder a una celda del mapa
		// true indica que la celda es accesible 
		// false indica que la celda no es accesible dado que es una pared
		
		
	}
	
}
