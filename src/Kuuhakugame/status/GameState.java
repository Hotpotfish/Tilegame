package Kuuhakugame.status;

import java.awt.Graphics;

import Kuuhakugame.basic.Game;
import Kuuhakugame.basic.Handler;
import Kuuhakugame.entities.creatures.Player;
import Kuuhakugame.entities.statics.Tree;
import Kuuhakugame.gfx.Assets;
import Kuuhakugame.order.AbstractOrder;
import Kuuhakugame.order.Invoker;
import Kuuhakugame.order.Receiver1;
import Kuuhakugame.order.order1;
import Kuuhakugame.tiles.Tile;
import Kuuhakugame.worlds.World;
import Kuuhakugame.worlds.mapMaker;



public class GameState extends State{
	
	//private Player player;
	private World world;
	//private Tree tree;
	
	public GameState(Handler handler){
		super(handler);
		
		Invoker invoker = new Invoker(); // 创建调用者  
        //创建一个具体命令，并指定该命令被执行的具体接收者  
         AbstractOrder command01 = new order1(new Receiver1());  
        //给命令传送者发布一个具体命令  
         invoker.setCommand(command01);  
         //命令传送者执行命令
         invoker.action();  

		
		world = new World(handler, "res/worlds/world1.txt");
		//world = new World(handler,"res/worlds/"+ invoker.action()+".txt");
		handler.setWorld(world);
		
			
	}
	
	public void tick(){
		
		world.tick();
	
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
	
		
	}
}
