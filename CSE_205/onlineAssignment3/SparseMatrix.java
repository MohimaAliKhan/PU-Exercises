
package onlineAssignment3;

import java.util.Scanner;
public class SparseMatrix {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int size1,size2,num=0;
        
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
        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                if(array[i][j]==0){
                    num++;
                }
            }
        }
        if(num>size1*size2/2){
            System.out.println("The matrix is sparse");
        }
        else{
            System.out.println("The matrix is not sparse");
        }
    }
}
