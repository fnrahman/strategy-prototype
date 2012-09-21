package tbsgame.states;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import tbsgame.Level;
import tbsgame.LevelBuilder;
import tbsgame.ResourceManager;
import tbsgame.tiles.Terrain;

public class GameplayTest extends BasicGameState {
	private int stateID;
	private Level level;
	
	public GameplayTest(int stateID) {
		this.stateID = stateID;
	}

	@Override
	public void init(GameContainer gc, StateBasedGame game)
			throws SlickException {
		SpriteSheet tiles = new SpriteSheet("res/tileset.png", 32, 32);
		ResourceManager.INSTANCE.putImage("no_image", tiles.getSubImage(0, 0));
		ResourceManager.INSTANCE.putImage(Terrain.PLAINS.getKey(), tiles.getSubImage(1, 0));
		ResourceManager.INSTANCE.putImage(Terrain.MOUNTAINS.getKey(), tiles.getSubImage(2,0));
		ResourceManager.INSTANCE.putImage(Terrain.FORREST.getKey(), tiles.getSubImage(3, 0));
		ResourceManager.INSTANCE.putImage("blue_highlight", tiles.getSubImage(3, 2));
		ResourceManager.INSTANCE.putImage("red_highlight", tiles.getSubImage(4, 2));

		level = LevelBuilder.readLevelFile("res/testLevel.txt");
	}

	@Override
	public void render(GameContainer gc, StateBasedGame game, Graphics g)
			throws SlickException {
		level.drawTiles();

	}

	@Override
	public void update(GameContainer gc, StateBasedGame game, int delta)
			throws SlickException {
		// TODO Auto-generated method stub

	}

	@Override
	public int getID() {
		return stateID;
	}

}
