
package javapresentations;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        All_implements[] shape= new All_implements[100];
        int i=0;
        int shapeNo;
        int option;
        
        while(true){
            System.out.println("\n---Shapes---\n\t1.Rectangle\n\t"
                    + "2.Triangle\n\t3.Circle\n\t"
                    + "4.Set or Get shapes\n\t5.Measurement\n\t6.Exit\n");
            System.out.print("Enter your choice:");
            int choice=input.nextInt();
            
            if(choice==1||choice==2||choice==3){
                if (choice==1){
                    System.out.println("  Shape no."+i);
                    System.out.print("Enter length then width of rectangle:");
                    shape[i]= new All_implements("Rectangle",input.nextInt(),input.nextInt());
                }
                else if (choice==2){
                    System.out.println("  Shape no."+i);
                    System.out.print("Enter Hight then width of triangle:");
                     shape[i]= new All_implements("Triangle",input.nextInt(),input.nextInt());
                }
                else  {
                    System.out.println("  Shape no."+(i));
                    System.out.print("Enter radius of circle:");
                    shape[i]= new All_implements("Circle",input.nextInt());
                }
                i++;
            }
            
            else {
                if(choice==4){
                   System.out.print("Enter shape no.: ");
                   shapeNo=input.nextInt();
                   System.out.println("This ia a "+shape[shapeNo].getShape()+"."
                           + "\n What do you want to do?");
                   
                   if(shape[shapeNo].getShape()=="Rectangle"||shape[shapeNo].getShape()=="Triangle"){
                        System.out.println("\t1.Set length\\hight");
                        System.out.println("\t2.Set width\\base");
                        System.out.println("\t3.Get length\\hight");
                        System.out.println("\t4.Get width\\base");
                        option=input.nextInt();
                       if(option==1){
                           System.out.print("Enter new length\\hight:");
                           shape[shapeNo].setHight(input.nextInt());
                        }
                       else if(option==2){
                           System.out.print("Enter new width\\base:");
                           shape[shapeNo].setBaseOrWidth(input.nextInt());
                        }
                        else if(option==3){
                            System.out.println("Length\\Hight:"+shape[shapeNo].getHight());
                        }
                        else{
                            System.out.println("Width\\Base:"+shape[shapeNo].getBaseOrWidth());
                        }
                    }
                   
                   else {
                       System.out.println("\t1.Set radius");
                       System.out.println("\t2.Get radius");
                       option=input.nextInt();
                       if(option==1){
                           System.out.print("Enter new radius:");
                           shape[shapeNo].setRadius(input.nextInt());
                        }
                        else {
                           System.out.println("Radius:"+shape[shapeNo].getRadius());
                       }
                    }
                }
                else if(choice==5){
                    System.out.print("Enter shape no.: ");
                    shapeNo=input.nextInt();
                    System.out.println("This ia a "+shape[shapeNo].getShape());
                    System.out.println("What do you want to measure?\n\t1.Area\n\t2.Perimeter\n\t");
                    option=input.nextInt();
                    if(option==1){
                       System.out.println("\tArea:"+shape[shapeNo].area());
                    }
                    else {
                       System.out.println("\tPerimeter:"+shape[shapeNo].perimeter());
                    }
                }
                else { break; }
            }
        } System.out.println("You have created "+i+" shapes succesfully.");
    }
}
