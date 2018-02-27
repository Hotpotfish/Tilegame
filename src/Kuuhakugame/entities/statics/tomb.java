package Kuuhakugame.entities.statics;

import java.awt.Graphics;

import Kuuhakugame.basic.Handler;
import Kuuhakugame.gfx.Assets;
import Kuuhakugame.tiles.Tile;

public class tomb extends StaticEntity {
	
	public tomb(Handler handler,float x,float y){
		super(handler,x,y,Tile.TILEWIDTH,Tile.TILEHEIGHT * 2);
	}

	@Override
	public void tick() {
		
		
	}

	@Override
	public void render(Graphics g) {
		
		g.drawImage(Assets.tomb, (int)(x - handler.getGameCamera().getxOffset()), 
				(int)(y - handler.getGameCamera().getyOffset()),
				width, height, null);
		
		
	}

}
