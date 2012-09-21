package tbsgame.tiles;

import org.newdawn.slick.Image;

import tbsgame.ResourceManager;

public class Tile {
	private Image img;
	
	public Tile(Terrain t) {
		img = ResourceManager.INSTANCE.getImage(t.getKey());
	}
	
	public void drawTile(int x, int y) {
		img.draw(x, y);
	}
	
}
