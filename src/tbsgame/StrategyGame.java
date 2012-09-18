package tbsgame;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import tbsgame.states.GameplayTest;

public class StrategyGame extends StateBasedGame {

	public StrategyGame() {
		super("Strategy Game Prototype");
		
	}

	@Override
	public void initStatesList(GameContainer gc) throws SlickException {
		this.addState(new GameplayTest(0));

	}
	
	public static void main(String[] args) throws SlickException {
		AppGameContainer app = new AppGameContainer(new StrategyGame());
			app.setDisplayMode(800, 600, false);
			app.start();
	}

}
