package Kuuhakugame.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 40, height = 80;
	
	public static BufferedImage dirt,grass,stone,tree,saber,angle,carpet,tomb;
	
	public static BufferedImage[] player_down;
	public static BufferedImage[] player_up;
	public static BufferedImage[] player_left;
	public static BufferedImage[] player_right;
	
	public static void init(){
		
		//SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/aa2065.png"));
		
		player_down = new BufferedImage[2];
		player_down[0] = ImageLoader.loadImage("/textures/aac002.png");
		player_down[1] = ImageLoader.loadImage("/textures/aac003.png");
		
		player_up = new BufferedImage[2];
		player_up[0] = ImageLoader.loadImage("/textures/aac004.png");
		player_up[1] = ImageLoader.loadImage("/textures/aac005.png");
		
		player_left = new BufferedImage[2];
		player_left[0] = ImageLoader.loadImage("/textures/aac006.png");
		player_left[1] = ImageLoader.loadImage("/textures/aac007.png");
		
		player_right = new BufferedImage[2];
		player_right[0] = ImageLoader.loadImage("/textures/aac008.png");
		player_right[1] = ImageLoader.loadImage("/textures/aac009.png");
		
		
		//player_down[0] = sheet.crop(50, 0, 40, 80);
		//player_down[1] = sheet.crop(100, 0, 40, 80);
		
	//	player = ImageLoader.loadImage("/textures/aa2202.png");
		grass = ImageLoader.loadImage("/textures/aa0043.png");
		dirt = ImageLoader.loadImage("/textures/aa0105.png");
		tree = ImageLoader.loadImage("/textures/aa1031.png");
		stone = ImageLoader.loadImage("/textures/aa0141.png");
		saber = ImageLoader.loadImage("/textures/aa2126.png");
		angle = ImageLoader.loadImage("/textures/aa1032.png");
		carpet = ImageLoader.loadImage("/textures/aa0162.png");
		tomb = ImageLoader.loadImage("/textures/aa1253.png");
	}

}
