package DataStructure;

import java.util.Scanner;

public class Input {
    int num,i,j;
    Scanner input=new Scanner(System.in);

//=====>>>>>> For taking one value only: (unused)
    public int sort(){
        return 0;
    }
 //====>>>>>> Taking input for full array for Sorting:  
    public int[] sort_input(){
        System.out.println("Enter the number of integer to sort: ");
        num= input.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter "+num+" integer: ");
        
        for(i=0;i<num;i++){
            arr[i]=input.nextInt();
        }
        return arr; 
    }
//=====>>>> Taking input for Search or Matching (unused): 
    public int single_input(){
        System.out.println("Your");
        return 0;
    }
}