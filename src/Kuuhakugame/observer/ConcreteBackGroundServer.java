package Kuuhakugame.observer;

public class ConcreteBackGroundServer extends backGroundServer{
	
	public ConcreteBackGroundServer(String serverName){  
        System.out.println(serverName + "�����������ɹ�!!!\n");  
        System.out.println("----------------------------");  
        this.serverName = serverName;  
    }  



	@Override
	public void notifyObserver(String name) {
		
		System.out.println(this.serverName + "֪ͨ" + 
                name + "�����ƶ���");
		for(Object obs : players) {  
            
                ((Observer)obs).walk();  
              
        }         


		// TODO Auto-generated method stub
		
	}
	
	
	

}
