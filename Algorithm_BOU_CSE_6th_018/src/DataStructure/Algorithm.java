/**
 * Name: Shofiul Basher
 * ID: 18052801018
 */
package DataStructure;

import java.util.Scanner;
import GraphAlgorithms.*;

public class Algorithm {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("----------------------------\n"
                    + "  ***Computer Algorithm*** \n"
                    + "----------------------------\n"
                    + "1. Data Structure\n"
                    + "2. Algorithms");
            System.out.println("Type your choice: ");
            int choice = s.nextInt();
            if (choice == 1) {
                System.out.println("------------------\n"
                        + " *Data Structure* \n"
                        + "------------------\n"
                        + "1. Linear Search\n"
                        + "2. Binary Search\n"
                        + "3. Bubble Sort\n"
                        + "4. Insertion Sort\n"
                        + "5. Selection Sort\n"
                        + "6. Merge Sort\n"
                        + "7. Quick Sort\n"
                        + "8. Counting Sort\n"
                        + "9. Radix Sort\n"
                        + "10. Bucket Sort\n"
                        + "11. Shell Sort\n"
                        + "12. Stack\n"
                        + "13. Queue\n"
                        + "14. Linked List\n"
                        + "15. Heap Sort\n"
                        + "16. Binary Search Tree\n"
                        + "17. Fibonacci Numbers\n"
                        + "18. Euclidean GCD & LCM Algorithm\n"
                        + "19. Univsersal Hashing\n"
                        + "20. Naive String Matching\n"
                        + "21. Matrix Chain Multiplication");
                System.out.println("\n");
                System.out.println("Enter Your Data Structure choice: ");
                int n1 = s.nextInt();
                switch (n1) {
                    case 1:
                        System.out.println("Sorry. This code is not available yet!!");
                        break;
                    case 2:
                        System.out.println("Sorry. This code is not available yet!!");
                        break;
                    case 3:
                        BubbleSort b = new BubbleSort();
                        Input in = new Input();
                        System.out.println("Choose what to display:\n1. Sorting\n2. Sorting with Each Pass and Steps");
                        int op3 = s.nextInt();
                        if (op3 == 1) {
                            b.bubble_sort(in.sort_input());
                        } else {
                            b.bubble_sort2(in.sort_input());
                        }
                        break;
                    case 4:
                        System.out.println("Sorry. This code is not available yet!!");
                        break;
                    case 5:
                        SelectionSort ss = new SelectionSort();
                        Input in5 = new Input();
                        ss.selection_sort(in5.sort_input());
                        break;
                    case 6:
                        MergeSort ms = new MergeSort();
                        Input in6 = new Input();
                        ms.merge_sort(in6.sort_input());
                        break;
                    case 7:
                        QuickSort qs = new QuickSort();
                        Input in7 = new Input();
                        qs.quick_sort(in7.sort_input());
                        break;
                    case 8:
                        System.out.println("Sorry. This code is not available yet!!");
                        break;
                    case 9:
                        RadixSort rs = new RadixSort();
                        Input in9 = new Input();
                        rs.radix_sort(in9.sort_input());
                        break;
                    case 10:
                        System.out.println("Sorry. This code is not available yet!!");
                        break;
                    case 11:
                        System.out.println("Sorry. This code is not available yet!!");
                        break;
                    case 12:
                        System.out.println("Sorry. This code is not available yet!!");
                        break;
                    case 13:
                        System.out.println("Sorry. This code is not available yet!!");
                        break;
                    case 14:
                        Linked lk = new Linked();
                        lk.linked_display();
                        break;
                    case 15:
                        System.out.println("Sorry. This code is not available yet!!");
                        break;
                    case 16:
                        System.out.println("Sorry. This code is not available yet!!");
                        break;
                    case 17:
                        Fibonacci fib = new Fibonacci();
                        break;
                    case 18:
                        Euclid_GCD_LCM e = new Euclid_GCD_LCM();
                        e.gcd();
                        break;
                    case 19:
                        System.out.println("Sorry. This code is not available yet!!");
                        break;
                    case 20:
                        NaiveStringMatching nsm = new NaiveStringMatching();
                        break;
                    case 21:
                        MatrixChainMultiplication mcm = new MatrixChainMultiplication();
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            } else if (choice == 2) {
                System.out.println("-------------\n"
                        + " *Algorithm* \n"
                        + "-----------------\n"
                        + "1. Graph Representation\n"
                        + "2. BFS\n"
                        + "3. DFS\n"
                        + "4. TOPOLOGICAL SORT\n"
                        + "5. KRUSHKAL\n"
                        + "6. PRIM'S\n"
                        + "7. DIJKASTRA\n"
                        + "8. BELMEN FORD\n"
                        + "9. FLOYED-WARSHALL\n");
                System.out.println("Choose your Algorithm choice: ");
                int n2 = s.nextInt();
                switch (n2) {
                    case 1:
                        GraphRepresent gr = new GraphRepresent();
                        break;
                    case 2:
                        System.out.println("Sorry. This code is not available yet!!!");
                        break;
                    case 3:
                        System.out.println("Sorry. This code is not available yet!!!");
                        break;
                    case 4:
                        System.out.println("Sorry. This code is not available yet!!!");
                        break;
                    case 5:
                        System.out.println("Sorry. This code is not available yet!!!");
                        break;
                    case 6:
                        System.out.println("Sorry. This code is not available yet!!!");
                        break;
                    case 7:
                        Graph_Dijkstra dij = new Graph_Dijkstra();
                        break;
                    case 8:
                        System.out.println("Sorry. This code is not available yet!!!");
                        break;
                    case 9:
                        System.out.println("Sorry. This code is not available yet!!!");
                        break;
                    default:
                        System.out.println("Invalid choice!!");
                }
            }
        }
    }
}
