package dynamic_Programming.knapsack.subproblem;

public class SubsetSumRecursive {

    public static void main( String args[] )
    {

        // no of items , weight and value associated with the items  ;

        int n = 6 ;
        int a[] = new int[] {3, 34, 4, 12, 5, 2};
        int sum = 34 ;
        System.out.println(isSubsetSum(n, a, sum));
    }

    public static boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        if( sum == 0 )
        {
            return true ;
        }
        if( N== 0 )
        {
            return false ;
        }
        else
        {
            return isSubsetSum( N-1 , arr , sum-arr[N-1]) || isSubsetSum( N-1 , arr , sum) ;
        }

    }
}
