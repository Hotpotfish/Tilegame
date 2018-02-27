package Kuuhakugame.observer;

public class ConcreteBackGroundServer extends backGroundServer{
	
	public ConcreteBackGroundServer(String serverName){  
        System.out.println(serverName + "服务器创建成功!!!\n");  
        System.out.println("----------------------------");  
        this.serverName = serverName;  
    }  



	@Override
	public void notifyObserver(String name) {
		
		System.out.println(this.serverName + "通知" + 
                name + "正在移动！");
		for(Object obs : players) {  
            
                ((Observer)obs).walk();  
              
        }         


		// TODO Auto-generated method stub
		
	}
	
	
	

}
