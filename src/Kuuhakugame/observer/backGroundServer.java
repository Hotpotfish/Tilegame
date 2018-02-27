package Kuuhakugame.observer;

import java.util.ArrayList;

public abstract class backGroundServer {
	protected String serverName;
	
	protected ArrayList<Observer> players = new ArrayList<Observer>();
	
	public void setServerName(String serverName){
		this.serverName = serverName;
	}
	
	
	
	public String getServerName(){
		if(serverName == null)
			serverName = "GOD server";
		return serverName;
	}	
	
	public void join(Observer obs){
		System.out.println(obs.getName() + "����" + serverName + " !!\n");
		players.add(obs);
	}
	
    public void quit(Observer obs) {  
        System.out.println(obs.getName() + "�˳�" + this.serverName + "!!!\n");  
           players.remove(obs);  
       }  
        
       //��������֪ͨ����  
       public abstract void notifyObserver(String name);  

	

}
