package pcg.dungeons;

import java.awt.*;
import javax.swing.*;

public class PCGApp{
	
	public static final int width_resolution = 800;
	public static final int heigth_resolution = 600;
	public static final int pixelsPerCell = 20;
	public final JFrame frame;
	public final Map map;
    
	public static void main(String[] args) {
		PCGApp app = new PCGApp();
		app.showMap();
	}

	public PCGApp() {		
		frame = new JFrame("Procedural Content Generation");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width_resolution, heigth_resolution);
		map = new MyDungeon(width_resolution/pixelsPerCell, heigth_resolution/pixelsPerCell, pixelsPerCell);
		
	}
	
	public void showMap() {
		frame.getContentPane().add(new JLabel(new ImageIcon(map.buildMap())), BorderLayout.CENTER);
		frame.setVisible(true);
	}

}
