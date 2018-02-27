package Kuuhakugame.worlds;

import java.io.File;
import java.io.FileWriter;

public class testMapConfig implements mapConfig{

	File file;
	int width,height;
	int BX,BY;
	String fileName;
	
	
	
	
	public void makeFile(String fileName) {
		File file = new File("res/worlds/"+fileName+".txt");
		this.file = file;
		this.fileName = fileName;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public void setSize(int width1, int height1) {
		width = width1;
		height = height1;
		try{
			FileWriter writer = new FileWriter(file, true);
			writer.write(width + "\n" + height + "\n");
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
	}

	@Override
	public void setBorn(int x, int y) {
		this.BX = x;
		this.BY = y;
		try{
			FileWriter writer = new FileWriter(file, true);
			writer.write(x + "\n" + y + "\n");
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		
	}

	@Override
	public String getFileName() {
		
		return fileName;
	}

	@Override
	public void makemapConfig() {
		makeFile("testMapConfig");
		setSize(30,30);
		setBorn(300,300);
	}

}
