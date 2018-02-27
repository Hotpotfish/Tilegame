package Kuuhakugame.worlds;

import java.io.File;
import java.io.FileWriter;

public class testMap implements Map{
	
	int width,height;

	@Override
	public void init(String fileName,int width,int height) {
		File file = new File("res/worlds/"+fileName+".txt");
		this.width = width;
		this.height = height;
		try{
			 FileWriter writer = new FileWriter(file, true);
			 for(int i = 0 ; i < height ; i++){
				 if(i!=0)
				 writer.write("\n");
				 for(int y = 0 ; y < width ; y++){
					 if(i == 0 || i == height - 1){
						 writer.write("2");
					 }else if(y == 0 || y == width - 1){
						 writer.write("2");
					 }else{
						 writer.write("1");
					 }
					 
				 }
			 }
			 writer.close();
			 
		}catch(Exception e){
			
		}
		
	}

}
