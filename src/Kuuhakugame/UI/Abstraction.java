package Kuuhakugame.UI;

import javax.swing.JFrame;

public class Abstraction {
	
	protected JFrame jf;
	public void SetFrame(JFrame jf){
		this.jf = jf;
	}
	public void sentToScreen(){
		jf.show();
	}

}
