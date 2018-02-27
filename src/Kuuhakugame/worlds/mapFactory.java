package Kuuhakugame.worlds;

public class mapFactory {
	
	public static Map createMap(int type){
		Map m = null;
		if(type == 1){
			m = new testMap();
		}
		return m;
		
	}

}
