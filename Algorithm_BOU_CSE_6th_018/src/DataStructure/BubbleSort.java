package DataStructure;

public class BubbleSort {

    public void bubble_sort(int arr[]) {
        int n = arr.length;
        int step = 1;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            /* This shows the pass by pass output.
            System.out.print("\nPass "+step+": "); //step numbers
            step++; 
            for(int k=0;k<n;k++){
                System.out.print(arr[k]+" "); //printing all element of each step
            }
             */
        }
        System.out.println();
        System.out.println("Final sorted data: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void bubble_sort2(int arr[]) {
        //This is pass by pass and step by step detailed output.
        int n = arr.length;
        int pass = 1;
        int step = 1;
        for (int i = 0; i < n - 1; i++) {
            System.out.print("\nPass " + pass + ":\n");
            pass++;
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  step " + step + ":");
                step++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.print("Swap   : ");
                } else {
                    System.out.print("No swap: ");
                }

                for (int k = 0; k < n; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            step = 1;

        }
        System.out.println();
        System.out.println("Final sorted data: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
