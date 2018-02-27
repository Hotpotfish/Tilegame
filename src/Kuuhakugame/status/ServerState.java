package Kuuhakugame.status;

import java.awt.Graphics;

import Kuuhakugame.basic.Handler;
import Kuuhakugame.observer.ConcreteBackGroundServer;

public class ServerState extends State{
	
	private ConcreteBackGroundServer cbgs = new ConcreteBackGroundServer("server1");
	

	public ServerState(Handler handler) {
		super(handler);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		
		
		
		
		// TODO Auto-generated method stub
		
	}

	public ConcreteBackGroundServer getCbgs() {
		return cbgs;
	}


	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		
	}
	
	

}
