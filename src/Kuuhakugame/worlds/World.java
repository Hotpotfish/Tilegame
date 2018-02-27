package Kuuhakugame.worlds;

import java.awt.Graphics;

//import Xiaotang.tilegame.Game;












import Kuuhakugame.basic.Handler;
import Kuuhakugame.entities.Entity;
import Kuuhakugame.entities.EntityManager;
import Kuuhakugame.entities.entityFactory;
import Kuuhakugame.entities.creatures.Player;
import Kuuhakugame.entities.statics.Tree;
import Kuuhakugame.entities.statics.angle;
import Kuuhakugame.entities.statics.saber;
import Kuuhakugame.entities.statics.tomb;
import Kuuhakugame.tiles.Tile;
//import Xiaotang.tilegame.tiles.addTile;
import Kuuhakugame.utils.Utils;

public class World {
	
	private Handler handler;
	
	private int width, height ; //5x5
	
	private int spawnX, spawnY;
	
	private int[][] tiles;
	
	private EntityManager entityManager;
	
	public World(Handler handler,String path){
		this.handler = handler;
		
		entityManager = new EntityManager(handler,new Player(handler,100,100,"[  ]"));
		entityManager.addEntity(new Tree(handler, 50 ,250));
		entityManager.addEntity(new Tree(handler, 100 ,250));
		entityManager.addEntity(new Tree(handler, 150 ,250));
		entityManager.addEntity(new Tree(handler, 200 ,250));
		entityManager.addEntity(new Tree(handler, 200 ,300));
		entityManager.addEntity(new Tree(handler, 200 ,350));
		entityManager.addEntity(new Tree(handler, 200 ,400));
		entityManager.addEntity(new Tree(handler, 400 ,375));
		entityManager.addEntity(new saber(handler, 100 ,350));
		entityManager.addEntity(new saber(handler, 100 ,350));
		entityManager.addEntity(new angle(handler, 575 ,1075));
		entityManager.addEntity(new tomb(handler, 1125 ,440));
		loadWorld(path);
		
		entityManager.getPlayer().setX(spawnX);
		entityManager.getPlayer().setY(spawnY);
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void tick(){
		entityManager.tick();
		
		
	}
	
	public void render(Graphics g){
		int xStart =(int)Math.max(0, handler.getGameCamera().getxOffset() / Tile.TILEWIDTH);
		int xEnd = (int)Math.min(width, (handler.getGameCamera().getxOffset() + handler.getWidth()) / Tile.TILEWIDTH + 1);
		int  yStart = (int)Math.max(0, handler.getGameCamera().getyOffset() / Tile.TILEHEIGHT);
		int yEnd = (int)Math.min(height, (handler.getGameCamera().getyOffset() + handler.getHeight()) / Tile.TILEHEIGHT + 1);
		
		for(int y = yStart;y < yEnd; y++){
			for(int x = xStart ; x < xEnd ; x++){
				getTile(x,y).render(g, (int)(x * Tile.TILEWIDTH - handler.getGameCamera().getxOffset()),
						(int)(y * Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()));
			}
		}
		
		entityManager.render(g);
		
	}
	
	public Tile getTile(int x , int y){
		if(x < 0 || y < 0 || x >= width || y >= height){
			//addTile.getAddTile();
			return  entityFactory.getEft().getEntity("grassTile");
			//return addTile.grassTile;
		}
			
			
		
		
		Tile t = Tile.tiles[tiles[x][y]];
		if(t == null) {
			//addTile.getAddTile();
			return  entityFactory.getEft().getEntity("dirtTile");
			//return addTile.dirtTile;
		}
		return t;
	}
	
	private void loadWorld(String path){
		
		String file = Utils.lodaFileAsString(path);
		String[] tokens = file.split("\n");
		width = Utils.parseInt(tokens[0]);
		height = Utils.parseInt(tokens[1]);
		spawnX = Utils.parseInt(tokens[2]);
		spawnY = Utils.parseInt(tokens[3]);
		
		tiles = new int[width][height];
		for(int y = 4 ; y < height + 4; y++) {
			String s = tokens[y];
			for(int x = 0 ; x < width ; x++)
			{
				tiles[x][y - 4] = s.charAt(x) - '0';
			}
		}
	}
	public int getWidth(){
		return width;
	}
	
	public int getHeight(){
		return height;
	}

}
