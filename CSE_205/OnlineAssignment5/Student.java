
package OnlineAssignment5;


public class Student {
    private String name;
    private int rollNo;
    private int math;
    private int physics;
    public Student(String name,int rollNo,int math,int physics){
        this.name=name;
        this.rollNo=rollNo;
        this.math=math;
        this.physics=physics;
    }
    public void display(){
         System.out.println("---Details---");
         System.out.println("\tName: "+name+"\n\tRoll No.: "+rollNo+"\n\tPhysics: "+physics+"\n\tMath: "+math);
    }
    public void result(){
        float per=(math+physics)/2;
        if (per<40)
         {System.out.println("Your grade=F\nPercentage="+per);}
        else if(per<60)
         { System.out.println("Your grade=E\nPercentage="+per);}
        else if(per<70)
          { System.out.println("Your grade=D\nPercentage="+per);}
        else if(per<80)
          {  System.out.println("Your grade=C\nPercentage="+per);}
        else if(per<90)
          { System.out.println("Your grade=B\nPercentage="+per);}   
       else
       { System.out.println("Your grade=A\nPercentage="+per); } 
    }
    
}
