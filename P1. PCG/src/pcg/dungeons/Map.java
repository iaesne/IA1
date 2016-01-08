package pcg.dungeons;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

public abstract class Map{
	
	protected final int width;
	protected final int height;
	protected final Color[][] grid;
	
	final int pixels;
	final BufferedImage canvas;
	
	public Map(int width, int height, int pixels) {
		this.height = height;
		this.width = width;
		this.grid = new Color[width][height];
		
		this.pixels = pixels;
		this.canvas = new BufferedImage(width*pixels,height*pixels,BufferedImage.TYPE_INT_RGB);
	}
	
	abstract protected void PCG();
	
	private void drawCanvas() {
		final Graphics2D g = canvas.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        for (int y=0; y<this.width; y++) {
        	for (int x=0; x<this.height; x++) {
				g.setColor(this.grid[y][x]);
				g.fill(new Rectangle2D.Double(y*pixels, x*pixels, pixels, pixels));
			}
		}
	}
	
	public BufferedImage buildMap() {
		buildMap();
		drawCanvas();
		return canvas;
	}
}
