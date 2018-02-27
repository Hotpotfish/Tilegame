package Kuuhakugame.tiles;

public interface Iterator<E>{
	
		public E first();
		
		public boolean hasNext();
		
		public E current();
		
		public E next();

}
