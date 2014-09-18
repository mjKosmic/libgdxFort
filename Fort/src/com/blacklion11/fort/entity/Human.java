package com.blacklion11.fort.entity;

import com.badlogic.gdx.graphics.Texture;


public class Human extends Entity
{
	
	float x,y;
	
	Texture image;
	
	// empty constructor
	public Human(){}
	
	public Human(float x, float y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Human(float x, float y, Texture image)
	{
		this.x = x;
		this.y = y;
		this.image = image;
	}
	
	public void render()
	{
		
		
		
	}
}