package dynamic_Programming.knapsack.countofsubsetsum;

public class CountofSubsetSum_Recursive {

    public static void main( String args[] )
    {

        // no of items , weight and value associated with the items  ;

        int n = 6 ;
        int a[] = new int[] {34, 34, 34, 12, 5, 22};
        int sum = 34 ;
        System.out.println(isSubsetSum(n, a, sum));
    }

    public static int isSubsetSum(int N, int arr[], int sum){
        if( sum == 0 )
        {
            return 1 ;
        }
        if( N == 0 )
        {
            return 0 ;

        }
        if(arr[N-1] <= sum )
        {
            return isSubsetSum(N-1 , arr , sum - arr[N-1] ) + isSubsetSum(N-1 , arr , sum  ) ;
        }
        else
        {
            return isSubsetSum(N-1 , arr , sum  );
        }
    }
}
