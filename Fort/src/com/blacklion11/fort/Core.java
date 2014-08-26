package com.blacklion11.fort;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.FPSLogger;

import com.blacklion11.fort.input.*;
import com.blacklion11.fort.states.*;

public class Core extends ApplicationAdapter{
	
	public static int WIDTH;
	public static int HEIGHT;
	
	private FPSLogger fpsLogger;
	
	public static OrthographicCamera cam;
	
	public GameStateManager gsm;
	
	
	public Core()
	{}
	
	@Override
	public void create () {
		WIDTH = Gdx.graphics.getWidth();
		HEIGHT = Gdx.graphics.getHeight();
		
		fpsLogger = new FPSLogger();
		
		gsm = new GameStateManager();
		gsm.addState(new GameState(), States.GAME);
		gsm.setState(States.GAME);
		
		cam = new OrthographicCamera(WIDTH, HEIGHT);
		cam.translate(WIDTH / 2, HEIGHT / 2);
		cam.update();
		
	}

	@Override
	public void render () {
	///////////FPS Logger
		fpsLogger.log();
	
	////////// update
		gsm.update();
	
	
	
	/////////// render
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		gsm.render();
	}
}
