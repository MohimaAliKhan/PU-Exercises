
package onlineAssignment3;

import java.util.Scanner;
public class SumOf2Darray {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int size1,size2;
        
        System.out.print("Enter the size of both array:");
        size1=input.nextInt();
        size2=input.nextInt();
        
        int array1[][]=new int[size1][size2];
        System.out.print("Enter the elements of 1st array:");
        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                array1[i][j]=input.nextInt();
            }
        }
        int array2[][]=new int[size1][size2];
        System.out.print("Enter the elements of 2nd array:");
        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                array2[i][j]=input.nextInt();
            }
        }
        int array3[][]=new int[size1][size2];
        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                array3[i][j] = array1[i][j]+ array2[i][j];
                
            }
        }
        
        System.out.println("The sum of these two array :");
        for(int i=0;i<size1;i++){
            System.out.print("\t");
            for(int j=0;j<size2;j++){
                System.out.print(array3[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
