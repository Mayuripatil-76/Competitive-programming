package dynamic_Programming.knapsack.countofsubsetsum;

import java.util.Arrays;

public class CountofSubsetSum_Memoization {

    public static void initilizearray(int dp[][])
    {
        for(int[] arr1 : dp)
            Arrays.fill(arr1, -1);
    }
    public static void main( String args[] )
    {

        // no of items , weight and value associated with the items  ;

        int n = 6 ;
        int a[] = new int[] {34, 34, 34, 12, 5, 22};
        int sum = 34;
        int dp[][]= new int[n+1][sum+1] ;
        initilizearray(dp);
        System.out.println(fun(n, a , sum , dp  ));
    }

    static int fun( int N , int a[] , int sum , int dp[][] ){
        if( sum == 0 )
        {
            return 1 ;
        }
        if( N == 0 )
        {
            return 0 ;
        }
        if(dp[N][sum] != -1 )
        {
            return dp[N][sum];
        }
        else
        {
            if(a[N-1] <= sum )
            {
                return dp[N][sum]=fun(N-1 , a , sum - a[N-1], dp ) + fun(N-1 , a , sum , dp  ) ;
            }
            else
            {
                return dp[N][sum]=fun(N-1 , a , sum  , dp );
            }
        }
    }
}
