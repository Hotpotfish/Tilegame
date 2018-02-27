package Kuuhakugame.order;

public class order1 extends AbstractOrder{
	private AbstractReceiver  receiver = null;
		public order1(AbstractReceiver receiver) {  
	        this.receiver = receiver;  
	}  



	@Override
	public String execute() {
		
        return receiver.doJob();  
		
	}
	

}
