package Kuuhakugame.entities;

import java.util.HashMap;

//import Kuuhakugame.basic.Game;
//import Kuuhakugame.basic.Handler;
//import Kuuhakugame.entities.creatures.Player;
//import Kuuhakugame.entities.statics.Tree;
import Kuuhakugame.tiles.DirtTile;
import Kuuhakugame.tiles.GrassTile;
import Kuuhakugame.tiles.RockTile;
import Kuuhakugame.tiles.Tile;

public class entityFactory {
	private HashMap map = new HashMap();
	private static entityFactory eft;
	public entityFactory(){
		map.put("grassTile",new GrassTile(0));
		map.put("dirtTile",new DirtTile(1));
		map.put("rockTile",new RockTile(2));
	}
	
	
	
	public static  entityFactory getEft(){
		if(eft == null){
			return new entityFactory();
		}
		return eft;
	}
	
	
	
	public Tile getEntity(String name){
		return (Tile)map.get(name);
		
	}

}
