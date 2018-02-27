package Kuuhakugame.speedChange;

import Kuuhakugame.basic.Handler;
import Kuuhakugame.entities.creatures.Creature;

public class tiredSpeed implements changeSpeed{

	int count;
	public void change(Handler h,Creature c) {
		if(h.getKeyManager().down && h.getKeyManager().left /*|| h.getKeyManager().right || h.getKeyManager().up*/){
			c.setSpeed(2);
		}else{
			c.setSpeed(Creature.DEFULT_SPEED);
		}
		
		
	}

}
