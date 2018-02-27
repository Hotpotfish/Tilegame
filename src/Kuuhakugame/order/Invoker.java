package Kuuhakugame.order;

public class Invoker {  
    private AbstractOrder command = null;  
    public void setCommand(
    		AbstractOrder  command) {  
          this.command = command;  
      }  
     public String action() {  
                return  command.execute();  
      }  
  } 
