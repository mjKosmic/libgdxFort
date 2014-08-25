package com.blacklion11.fort.states;


import com.blacklion11.fort.world.*;
import com.blacklion11.fort.input.*;
import com.blacklion11.fort.Window;

public class GameState extends BasicGameState
{
	
	World world;
	KeyInput keyInput;
	
	public void init()
	{
		world = new World();
		world.generateMap();
		//keyInput = new KeyInput();
	}

	public void update()
	{
		//keyInput.update();
	}
	
	public void render()
	{
		
		world.render();
	}
	
	public int getID(){return States.GAME;}
}