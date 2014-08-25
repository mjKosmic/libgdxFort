package com.blacklion11.fort;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;


public class Main {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Fort";
		config.width = 1200;
		config.height = 768;
		config.resizable = false;
		new LwjglApplication(new Core(), config);
		
	}
}
