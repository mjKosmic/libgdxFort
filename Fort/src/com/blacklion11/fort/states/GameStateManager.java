package com.blacklion11.fort.states;


import java.util.Hashtable;

public class GameStateManager
{

	private Hashtable<Integer, BasicGameState> states;
	
	private Integer current;
	
	public GameStateManager()
	{
		states = new Hashtable();
	}
	
	public void update()
	{
		if(current != null)
		{
			states.get(current).update();
		}
	}
	
	public void render()
	{
		if(current != null)
		{
			states.get(current).render();
		}
	}
	
	
	
	
	public void setState(int state){current = new Integer(state);}

	public void addState(BasicGameState state, int key){
		states.put(new Integer(key), state);
		state.init();
	}
	
	public int getCurrentState(){return current.intValue();}

}