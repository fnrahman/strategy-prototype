package tbsgame;

import tbsgame.tiles.Terrain;
import tbsgame.tiles.Tile;

public class Level {
	private int width, height;
	private int xOffset, yOffset;
	public Tile[][] tiles;
	
	public Level(int xOffset, int yOffset, int width, int height) {
		this.xOffset = xOffset;
		this.yOffset = yOffset;
		this.width = width;
		this.height = height;
		tiles = new Tile[height][width];
	}
	
	public Level(int width, int height) {
		this(0, 0, width, height);
	}
	
	public void fillLevel(Terrain t) {
		for (int r=0; r<height; r++) {
			for (int c=0; c<width; c++) {
				tiles[r][c] = new Tile(t);
			}
		}
	}
	
	public void setTile(int x, int y, Tile tile) {
		tiles[y][x] = tile;
	}
	
	public void setXOffset(int xOffset) {
		this.xOffset = xOffset;
	}
	
	public void setYOffset(int yOffset) {
		this.yOffset = yOffset;
	}
	
	public void drawTiles() {
		for (int r=0; r<height; r++) {
			for (int c=0; c<width; c++) {
				//TODO: Remove numbers, make them constants or something.
				tiles[r][c].drawTile(xOffset + (c*32), yOffset + (r*32));
			}
		}
	}
}
