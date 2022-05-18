package DataStructure;
import java.util.Scanner;
class Fibonacci {
    int series(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return series(n-1)+series(n-2);
        }
    }
//constructor
    Fibonacci(){
        System.out.print("Input Nth number for your output: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("\nYour Series: ");
        for(int i=0;i<n;i++){
            System.out.print(series(i)+" ");
        }
        System.out.println("\n");
    }
}