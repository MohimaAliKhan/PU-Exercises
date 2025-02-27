
package javapresentations;

import java.util.Scanner;
public class All_implements implements Rectangle,Triangle,Circle {
   private String shape;
   private int hight;
   private int baseOrWidth;
   private int radius;
  
   All_implements(String shape,int hight,int baseOrWidth){
       this.shape=shape;
       this.hight=hight;
       this.baseOrWidth=baseOrWidth;
   }

     All_implements(String shape,int radius){
       this.shape=shape;
       this.radius=radius;
    } 

    public String getShape() {
        return shape;
    }
    public void setHight(int hight) {
        this.hight = hight;
    }
    public int getHight() {
        return hight;
    }
    public void setBaseOrWidth(int baseOrWidth) {
        this.baseOrWidth = baseOrWidth;
    }
    public int getBaseOrWidth() {
        return baseOrWidth;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }
    
    
    public double area(){
        if(shape=="Triangle"){
            return 0.5*hight*baseOrWidth;
        }
        else if(shape=="Rectangle"){
            return hight*baseOrWidth;
        }
        else{
            return pi*radius*radius;
        }
    }
    public double perimeter(){
        
       if(shape=="Triangle"){
          Scanner input=new Scanner(System.in); 
         System.out.print("Enter other two sides of triangle: ");
         int side1=input.nextInt();
         int side2=input.nextInt();
        return side1+side2+baseOrWidth;
    }
        else if(shape=="Rectangle"){
            return 2*(hight+baseOrWidth);
        }
        else{
            return 2*pi*radius;
        }
    }
}
