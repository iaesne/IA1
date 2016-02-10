package environment;

public class App {

	public static void main(String[] args) {
		final int pixelsPerCell = 20;
		final int speed = 10;
		MapApp app = new MapApp(pixelsPerCell, Neighborhood.NEUMANN, speed);
		//Ejecuta como generacion procedural de mapas un algoritmo de busqueda en profundidad
		//app.pcg(new pcg.DFS());

		//Ejecuta como generacion procedural de mapas un algoritmo aleatorio
		//app.pcg(new pcg.Random());

		//Resetea el mapa de modo que las variables de las celdas vuelvan a los valores iniciales
		//app.map().resetMap();

		// Reinicializa las variables usadas para realizar el pathfinding de modo que se puede ejecutar
		// otro algoritmo de pathfinding sobre el mismo mapa dejando la ruta obtenida anteriormente.
		//app.map().resetPathfinding();

		// Asigna el tipo de color en que se mostrara la ruta optima de Terrain.PATH1 a Terrain.PATH2
		// Por defecto tiene valor Terrain.PATH1
		//app.map().pathfindingTerrain(Terrain.PATH2);


		app.pcg(new pcg.Random());
		app.pathfinding(new pathfinding.DFS(), null);
	}

}
