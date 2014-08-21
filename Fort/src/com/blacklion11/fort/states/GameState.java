package fort.states;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.Graphics;

import fort.world.*;
import fort.input.*;
import fort.Window;

public class GameState extends BasicGameState
{
	
	World world;
	KeyInput keyInput;
	
	public void init(GameContainer gc, StateBasedGame game) throws SlickException
	{
		world = new World();
		world.generateMap();
		keyInput = new KeyInput(Window.HEIGHT);
	}

	public void update(GameContainer gc, StateBasedGame game, int delta) throws SlickException
	{
		keyInput.update(gc,game,delta);
	}
	
	public void render(GameContainer gc, StateBasedGame game, Graphics g) throws SlickException
	{
		world.render(g);
	}
	
	public int getID(){return States.GAME;}
}