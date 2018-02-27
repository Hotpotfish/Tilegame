package Kuuhakugame.UI;

import javax.swing.JFrame;

public class Proxy extends JFrame{
	
	begin b;
	public void screen(){
		if(b == null){
			b = (begin)begin.getBeginInstence();
		}
		
		
	}
	public void main(String[] args){
		Proxy p = new Proxy();
		p.screen();
		
	}

}