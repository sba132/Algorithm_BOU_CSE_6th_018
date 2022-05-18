package DataStructure;
import java.util.LinkedList;
import java.util.Scanner;
public class Linked {
    LinkedList<String> ll=new LinkedList<String>();
    Scanner sc=new Scanner(System.in);
    public void linked_display(){
      while(true){
        System.out.println("Choose one operation: \n1. Add element\n2.Remove element\n3.display LinkedList\n4.Exit operation");
        int x=sc.nextInt();
        switch(x){
            case 1:
                System.out.println("Type your element");
                String y=sc.next();
                ll.add(y);
                break;
            case 2:
                ll.remove();
                break;
            case 3:
                System.out.println(ll);
                break;
            default:
                System.out.println("Invalid choice");               
        }
      }
    }
}