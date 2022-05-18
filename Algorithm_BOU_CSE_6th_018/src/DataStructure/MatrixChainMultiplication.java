package DataStructure;

class MatrixChainMultiplication {
    // Matrix Ai has dimension p[i-1] x p[i] for i = 1..n
    public MatrixChainMultiplication(){
         int arr[] = new int[] { 10, 2, 30, 4, 3 };
        int n = arr.length;
        System.out.print("Given array is: ");
        for(int number: arr){
            System.out.print(number+" ");
        }
        System.out.println(" ");
        System.out.println("Minimum number of multiplications is "+ MatrixChainOrder(arr, 1, n - 1));
    }
    static int MatrixChainOrder(int p[], int i, int j)
    {
        if (i == j)
            return 0;

        int min = Integer.MAX_VALUE;

        for (int k = i; k < j; k++)
        {
            int count = MatrixChainOrder(p, i, k) + MatrixChainOrder(p, k + 1, j) + p[i - 1] * p[k] * p[j];

            if (count < min)
                min = count;
        }

        // Return minimum count
        return min;
    }   
}