package Kuuhakugame.basic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

//import javax.swing.plaf.nimbus.State;




//import javax.net.ssl.KeyManager;









import Kuuhakugame.display.Display;
import Kuuhakugame.gfx.Assets;
import Kuuhakugame.gfx.GameCamera;
import Kuuhakugame.input.KeyManager;
import Kuuhakugame.input.MouseManager;
import Kuuhakugame.status.GameState;
import Kuuhakugame.status.MenuState;
import Kuuhakugame.status.ServerState;
import Kuuhakugame.status.State;

public class Game implements Runnable{
	
	private Display display;
	private  int width, height;
	public String title;
	
	private boolean running = false;
	
	private Thread thread;
	
	private BufferStrategy bs;
	private Graphics g;
	//states
	public  GameState gameState;
	public  ServerState serverState;
	public  State menuState;
	//Input
	private KeyManager keyManager;
	private MouseManager mouseManager;
	
	//Camera
	private GameCamera gameCamera;
	
	//Handler
	private Handler handler;
	
	
	private static Game game; //= new Game("SAVE THE ANGLE",640,360);
	
	private Game(String title, int width ,int height){
		this.width = width;
		this.height = height;
		this.title = title;
		keyManager = new KeyManager();
		mouseManager = new MouseManager();
	}
	
	private void init(){
		display = new Display(title,width,height);
		display.getFrame().addKeyListener(keyManager);
		display.getFrame().addMouseListener(mouseManager);
		display.getFrame().addMouseMotionListener(mouseManager);
		display.getCanvas().addMouseListener(mouseManager);
		display.getCanvas().addMouseMotionListener(mouseManager);
		Assets.init();
		
		handler = new Handler(this);
		gameCamera = new GameCamera(handler,0 ,0);
		
		
		
		gameState = new GameState(handler);
		menuState = new MenuState(handler);
		serverState = new ServerState(handler);
		serverState.getCbgs().join(handler.getWorld().getEntityManager().getPlayer()); //
		//State.setState(menuState);
		State.setState(gameState);
		
	}
	
	
	
	public ServerState getServerState() {
		return serverState;
	}

	public void setServerState(ServerState serverState) {
		this.serverState = serverState;
	}

	private void tick(){
		keyManager.tick();
		
		if(State.getState() != null){
			State.getState().tick();	
		}
		
		
		
	}
	
	private void render(){
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null){
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		//clear Screen
		g.clearRect(0, 0, width, height);
		//Draw here
		if(State.getState() != null){
			State.getState().render(g);
		}
		
		//End Drawing
		
		bs.show();
		g.dispose();	
		
		
	}
	
	public void run(){
		
		init();
		
		int fps = 60;
		double timePerTick = 1000000000 / fps;  //1ร๋60ึก
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks = 0;
		
		while(running){
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			timer += now - lastTime;
			lastTime = now;
			
			
			if(delta >= 1){
				tick();
				render();
				ticks++;
				delta --;
			}
			if(timer >= 1000000000){
			//	System.out.println(ticks);
				ticks = 0;
				timer = 0;
			}
			
		}
		
		stop();
	}
	
	public KeyManager getKeyManager(){
		return keyManager;
	}
	
	public MouseManager getMouseManager(){
		return mouseManager;
	}
	
	public GameCamera getGameCamera(){
		return gameCamera;
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getHeight(){
		return height;
	}
	
	public synchronized void start(){
		if(running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
		
	}
	
	public synchronized void stop(){
		if(!running)
			return;
		running = false;
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Game getGame(){
		if(game == null)
			game = new Game("SAVE THE ANGLE",640,360);
		return game;
	}
	

}
