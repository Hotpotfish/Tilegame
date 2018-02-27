package Kuuhakugame.tiles;

import Kuuhakugame.gfx.Assets;

public class RockTile extends Tile{
	
	public RockTile(int id){
		super(Assets.stone,id);
	}
	
	public boolean isSolid(){
		return true;
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		
	}

}
