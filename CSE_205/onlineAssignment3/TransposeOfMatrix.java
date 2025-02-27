
package onlineAssignment3;
import java.util.Scanner;

public class TransposeOfMatrix {
     public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int size1,size2;
        
        System.out.print("Enter the size of array:");
        size1=input.nextInt();
        size2=input.nextInt();
        
        int array[][]=new int[size1][size2];
        System.out.print("Enter the elements of array:");
        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                array[i][j]=input.nextInt();
            }
        }
        int array2[][]=new int[size2][size1];
        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
               array2[j][i]=array[i][j];
               
            }
        }
         System.out.println("The transpose matrix:");
         for(int i=0;i<size2;i++){
            for(int j=0;j<size1;j++){
                System.out.print(array2[i][j]+" ");
            }
             System.out.println("");
        }
     }
    
}
