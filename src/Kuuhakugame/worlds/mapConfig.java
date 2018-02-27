package Kuuhakugame.worlds;

public interface mapConfig {
	
	//static int width = 0,height = 0;;//height;
	
//	int width = 0;
//	int height = 0;
    public int getWidth();
    
    public int getHeight();
	
	public String getFileName();
	
	public void makemapConfig();
	
	public void makeFile(String fileName);
	
	public void setSize(int width,int height);
	
	public void setBorn(int x, int y);
	
	

}
