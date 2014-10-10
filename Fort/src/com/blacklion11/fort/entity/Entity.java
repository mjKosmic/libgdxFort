package com.blacklion11.fort.entity;

import java.awt.Point;
import java.awt.Color;

public abstract class Entity
{
	

	protected float x, y;
	
	protected Color color;
	
	
	public float getX(){return x;}
	public float getY(){return y;}
	public Point getCoord(){return new Point((int) x, (int) y);}
	public Color getColor(){return color;}
	
	public void setX(float x){this.x = x;}
	public void setY(float y){this.y = y;}
	public void setCoord(Point p)
	{
		this.x = p.x;
		this.y = p.y;
	}
	public void setColor(Color c){color = c;}
	
		
}