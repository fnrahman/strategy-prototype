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
		ResourceManager.INSTANCE.putImage("tile_grass", tiles.getSubImage(0, 0));
		ResourceManager.INSTANCE.putImage("blue_highlight", tiles.getSubImage(2, 2));
		ResourceManager.INSTANCE.putImage("red_highlight", tiles.getSubImage(3, 2));

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
