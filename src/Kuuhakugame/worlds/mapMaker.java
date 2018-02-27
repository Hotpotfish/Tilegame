package Kuuhakugame.worlds;

public class mapMaker implements abstractFactory{
	
	public static mapConfig mpc = null;
	public static Map m = null;
	static int width;
	static int height;
	String fileName;
	
	public static String makeMap(){
		mapMaker mm = new mapMaker();
		mm.createMapConfig(1);
		mm.createMap(1);
		prepare(); //准备类型
		
		return mpc.getFileName();
		
	}
	
	private static void prepare(){
		
		
		//mpc =createMapConfig(configType);
		//m = mapFactory.createMap(mapType);
		//mpc.makeFile(mpc.getClass().getName() + "_" + m.getClass().getName());
		 
		m.init(mpc.getFileName(), width, height);
	}

	public void createMapConfig(int type) {
		// TODO Auto-generated method stub
		
		mpc = mapCofigFactory.createMapConfig(type);
		width = mpc.getWidth();
		height = mpc.getHeight();
	}

	public void createMap(int type) {
		// TODO Auto-generated method stub
		m = mapFactory.createMap(type);
	}

}
