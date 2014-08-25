package com.blacklion11.fort.input;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.Gdx;

import com.blacklion11.fort.Window;

public class KeyInput extends InputAdapter
{
	
	public KeyInput()
	{}
	
	
	public void update()
	{
		if(Gdx.input.isKeyPressed(Keys.UP))Window.Y -= 10;
		if(Gdx.input.isKeyPressed(Keys.DOWN))Window.Y += 10;
		if(Gdx.input.isKeyPressed(Keys.LEFT))Window.X += 10;
		if(Gdx.input.isKeyPressed(Keys.RIGHT))Window.X -= 10;
	}
	
	public boolean keyDown(int key)
	{
	
		
	
		/*
		switch(key)
		{
			case Keys.UP:
				Window.Y -= 10;
				break;
			case Keys.DOWN:
				Window.Y += 10;
				break;
			case Keys.LEFT:
				Window.X += 10;
				break;
			case Keys.RIGHT:
				Window.X -= 10;
				break;
		}
		*/
		
		return true;
	}
	
	public boolean keyUp(int key)
	{
		
		return true;
	}

}