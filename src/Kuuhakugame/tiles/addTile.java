package Kuuhakugame.tiles;

public class addTile {
	
	private static addTile at;
	public static  addTile getAddTile(){
		if(at == null)
			return new addTile();
		return at;
		
	}
	static Aggregate<Tile> aggregate = new ConcreteAggregate<Tile>();
	public static Tile grassTile = new GrassTile(0);
	public static Tile dirtTile = new DirtTile(1);
	public static Tile rockTile = new RockTile(2);
	
	
	public addTile(){
		aggregate.add(new GrassTile(0));
		aggregate.add(new DirtTile(1));
		aggregate.add(new RockTile(2));
	}
	
	
	
	public static void add(){
		Iterator<Tile> it= aggregate.createIterator();
		for(Tile t=it.first() ; it.hasNext() ; t = it.next()){
			Tile.tiles[t.getId()] = t;
		}
	}
	
	

}
