package Kuuhakugame.entities.creatures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

//import java.util.Observer;
import Kuuhakugame.basic.Game;
import Kuuhakugame.basic.Handler;
import Kuuhakugame.gfx.Animation;
import Kuuhakugame.gfx.Assets;
import Kuuhakugame.observer.backGroundServer;
import Kuuhakugame.speedChange.tiredSpeed;



public class Player extends Creature implements Kuuhakugame.observer.Observer{
	
//	Animations
	private Animation animDown,animUp,animLeft,animRight;
	private String name;
	//private Game game;
	
	public Player(Handler handler,float x, float y,String name) {
		super(handler,x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		// TODO Auto-generated constructor stub
		bounds.x = 16;
		bounds.y = 32;
		bounds.width = 32;
		bounds.height = 32;
		//Animations
		animDown = new Animation(500,Assets.player_down);
		animUp = new Animation(500,Assets.player_up);
		animLeft = new Animation(500,Assets.player_left);
		animRight = new Animation(500,Assets.player_right);
		this.name = name;
		
	}
	//public Player(){};
	
	

	@Override
	public void tick() {
		tiredSpeed ts = new tiredSpeed();
		ts.change(this.handler, this);
//		Strategy ps = new aStrategy();
//		ps.setSpeed(handler.getWorld(), this);
		//Animations
		animDown.tick();
		animUp.tick();
		animLeft.tick();
		animRight.tick();
		//movement;
		getInput();
		move();
		handler.getGameCamera().centerOnEntity(this);
		
		
	}
	private void getInput(){
		xMove = 0;
		yMove = 0;
		if(handler.getKeyManager().up){
			this.gameTips(handler.getGame().getServerState().getCbgs());
			yMove = -speed;
		}
			
		if(handler.getKeyManager().down){
			this.gameTips(handler.getGame().getServerState().getCbgs());
			yMove = speed;
		}
			
		if(handler.getKeyManager().left){
			this.gameTips(handler.getGame().getServerState().getCbgs());xMove = -speed;
		}
			
		if(handler.getKeyManager().right){
			this.gameTips(handler.getGame().getServerState().getCbgs());xMove = speed;
		}
			
		
		
			
			
		
	}

	@Override
	public void render(Graphics g) {
		
		g.drawImage(getCurrentAnimationFrame(), (int)(x - handler.getGameCamera().getxOffset()) , 
				(int)(y - handler.getGameCamera().getyOffset()) , width, height, null);
//		g.setColor(Color.red);
//		g.fillRect((int)(x + bounds.x - handler.getGameCamera().getxOffset()),
//				(int)(y + bounds.y - handler.getGameCamera().getyOffset()),
//				bounds.width,bounds.height);
	}
	
	private BufferedImage getCurrentAnimationFrame(){
		if(xMove < 0){
			return animLeft.getCurrentFrame();
		}else if(xMove > 0){
			return animRight.getCurrentFrame();
		}else if(yMove < 0){
			return animUp.getCurrentFrame();
		}else {
			return animDown.getCurrentFrame();
		}
		
	}



	@Override
	public String getName() {
		return this.name;
	}



	@Override
	public void setName(String name) {
		this.name = name;
		
	}



	@Override
	public void walk() {
		System.out.println("[  ] is walking");
		
	}



	@Override
	public void gameTips(backGroundServer bgs) {
		System.out.println("ÌבÊ¾:");
		// TODO Auto-generated method stub
		bgs.notifyObserver(name);
		
	}
	

}
