package tbsgame.tiles;

import org.newdawn.slick.Image;

public abstract class Tile {
	private Image img;
	
	public Tile(Image img) {
		this.img = img;
	}
	
	public void drawTile(int x, int y) {
		img.draw(x, y);
	}
	
}
