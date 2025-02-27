
package OnlineAssignment5;

public class Time {
    private int hrs;
    private int mnt;
    private int sec;
    public Time(int hrs,int mnt,int sec){
        this.hrs=hrs;
        this.mnt =mnt;
        this.sec=sec;
        
    }
    public void add(Time obj){
       int sc=(this.sec+obj.sec)%60;
       int mn=(((this.sec+obj.sec)/60)+this.mnt+obj.mnt)%60;
       int hr=((((this.sec+obj.sec)/60)+this.mnt+obj.mnt)/60)+obj.hrs+this.hrs;
        System.out.println("Added time is "+hr+":"+mn+":"+sc); 
        
    }
    
}
