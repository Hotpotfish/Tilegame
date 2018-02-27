package Kuuhakugame.order;

import Kuuhakugame.worlds.mapMaker;

public class Receiver1 extends AbstractReceiver{

	@Override
	public String doJob() {
		return mapMaker.makeMap();
		
	}

}
