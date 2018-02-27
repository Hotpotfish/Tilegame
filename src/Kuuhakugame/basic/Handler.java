package Kuuhakugame.basic;

import Kuuhakugame.gfx.GameCamera;
import Kuuhakugame.input.KeyManager;
import Kuuhakugame.input.MouseManager;
import Kuuhakugame.worlds.World;

public class Handler extends handlerFather{
	
	
	private Game game;
	private World world;
	
	public  Handler(Game game){
		this.game = game;
	}
	
	
	
	public GameCamera getGameCamera(){
		return game.getGameCamera();
	}
	
	public int getWidth(){
		return game.getWidth();
	}
	
	public int getHeight(){
		return game.getHeight();
	}
	
	public KeyManager getKeyManager(){
		return game.getKeyManager();
	}
	
	public MouseManager getMouseManager(){
		return game.getMouseManager();
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}

}
