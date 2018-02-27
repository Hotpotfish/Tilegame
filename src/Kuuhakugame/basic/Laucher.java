package Kuuhakugame.basic;

import Kuuhakugame.display.Display;
import Kuuhakugame.worlds.mapMaker;

public class Laucher {
	
private static Laucher laucher;
	
	public static void run(){
		Game game =Game.getGame();
		game.start();
	}
	
	public static Laucher getLaucherInstence(){
		if(laucher == null){
			return laucher = new Laucher();
		}
		return laucher;
		
	}

}
 