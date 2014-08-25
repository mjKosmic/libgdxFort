package com.blacklion11.fort;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.OrthographicCamera;

import com.blacklion11.fort.input.*;
import com.blacklion11.fort.states.*;

public class Core extends ApplicationAdapter{
	
	public static int WIDTH;
	public static int HEIGHT;
	
	public static OrthographicCamera cam;
	
	public GameStateManager gsm;
	
	SpriteBatch batch;
	Texture img;
	
	public Core()
	{}
	
	@Override
	public void create () {
		WIDTH = Gdx.graphics.getWidth();
		HEIGHT = Gdx.graphics.getHeight();
		
		gsm = new GameStateManager();
		gsm.addState(new GameState(), States.GAME);
		gsm.setState(States.GAME);
		
		cam = new OrthographicCamera(WIDTH, HEIGHT);
		cam.translate(WIDTH / 2, HEIGHT / 2);
		cam.update();
		
		//Gdx.input.setInputProcessor(new KeyInput());
	}

	@Override
	public void render () {
	
	////////// update
		gsm.update();
	
	
	
	/////////// render
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		gsm.render();
	}
}
