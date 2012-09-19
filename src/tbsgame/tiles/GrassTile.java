package tbsgame.tiles;

import org.newdawn.slick.Image;

import tbsgame.ResourceManager;

public class GrassTile extends Tile {

	public GrassTile() {
		super(ResourceManager.INSTANCE.getImage("tile_grass"));
	}

}
