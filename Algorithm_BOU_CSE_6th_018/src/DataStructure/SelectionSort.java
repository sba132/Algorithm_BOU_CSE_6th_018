package DataStructure;
class SelectionSort {
    void selection_sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int k;
                if(arr[i]<arr[j]){
                    k=arr[i];
                    arr[i]=arr[j];
                    arr[j]=k;
                }
            }
        }
        System.out.print("Your sorted data is: ");
        for(int p=0;p<n;p++){
            System.out.print(" "+arr[p]);
        }
    }
}