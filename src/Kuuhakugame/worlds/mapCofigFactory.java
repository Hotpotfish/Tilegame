package Kuuhakugame.worlds;

public class mapCofigFactory {
	
	
	public static mapConfig createMapConfig(int type){
		 mapConfig mpc = null;
		
		if(type == 1){
			mpc = new testMapConfig();
			mpc.makemapConfig();
		}	
		return mpc;
		
	} 
	
	

}
