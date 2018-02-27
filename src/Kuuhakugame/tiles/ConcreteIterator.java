package Kuuhakugame.tiles;

public class ConcreteIterator<E> implements Iterator<E>{

	
    private Aggregate<E> aggregate;  
    
    private int currentIndex = 0; //±éÀú×´Ì¬  
    
    public ConcreteIterator(Aggregate<E> aggregate){
    	this.aggregate = aggregate;   
    }
    	
	public E first() {
		currentIndex = 0;  
        if(hasNext()){  
            return aggregate.get(currentIndex);  
        }
        else{
        	return null;       
        } 
              
        
	}

	@Override
	public boolean hasNext() {
        return (currentIndex < aggregate.length());  

	}

	@Override
	public E current() {
		return aggregate.get(currentIndex);  
	}
	
	public E next(){
		currentIndex++;  
        if(hasNext()){  
            return aggregate.get(currentIndex);  
        }
        else{
        	return null;  
        }  

	}

}
