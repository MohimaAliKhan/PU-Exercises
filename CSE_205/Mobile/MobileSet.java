
package Mobile;

public class MobileSet implements Mobile {
    
    private String brand;
    private int sound=0;

    public MobileSet(String brand) {
        this.brand=brand;
    }
    
    public void call(String number){
        System.out.println("Calling to "+number+" by "+brand);
    }
    public void massage(String number){
        System.out.println("Sending your massage to "+number+" by "+brand);
    }
    public void soundSystem(char change){
        if(change=='+'){
            if(sound<5){
                sound++;
                System.out.println("Your sound level is "+sound+".");
            } 
            else {
                System.out.println("Your sound level is already 5. That is the highest.\nYour can't increase any more.");
            }
        }
        else if(change=='-'){
            if(sound>0){
                sound--;
                System.out.println("Your sound level is "+sound+".");
            } 
            else {
                System.out.println("Your sound level is already 0. That is the lowest.\nYour can't decrease any more.");
            }
        }
        else {
            System.out.println("Invalid entry.\n Please try again!");
        }
    }
}
