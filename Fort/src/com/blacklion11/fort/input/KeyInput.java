package fort.input;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.Input;
import fort.Window;

public class KeyInput
{

	Input input;
	
	public KeyInput(int height)
	{
		input = new Input(height);
	}
	
	public void update(GameContainer gc, StateBasedGame game, int delta)
	{
		if(input.isKeyDown(Input.KEY_LEFT))Window.X -= 20;
		if(input.isKeyDown(Input.KEY_RIGHT))Window.X += 20;
		if(input.isKeyDown(Input.KEY_UP))Window.Y -= 20;
		if(input.isKeyDown(Input.KEY_DOWN))Window.Y+= 20;
		
	}

}