package dynamic_Programming.knapsack.mimimumSubsetSum;

public class MinimumSubsetSumDiff_Top_Down_DP {

    public static void main( String args[] )
    {

        // no of items , weight and value associated with the items  ;

        int n = 4 ;
        int a[] = new int[] {1, 6, 11, 5};
//        int sum = 34 ;
        int sum = 0 ;
        for( int i = 0 ; i<n ; i++ )
        {
            sum+= a[i] ;
        }
        System.out.println(minSubsetSumDifference(n, a, sum));
    }

    public static int minSubsetSumDifference( int n , int a[] , int sum )
    {
        boolean dp[][] = new boolean[n+1][sum+1] ;
        for( int i = 0 ; i<= n ; i++ )
        {
            for( int j = 0 ; j<=sum ; j++ )
            {
                if( i == 0 )
                {
                    dp[i][j] = false ;
                }
                if( j == 0 ){
                    dp[i][j] = true ;
                }
            }
        }

        for( int i = 1 ; i<= n ; i++ )
        {
            for( int j = 0 ; j<=sum ; j++ )
            {
                if( a[i-1] <= j )
                {
                    dp[i][j] = dp[i-1][j-a[i-1]] || dp[i-1][j] ;
                }
                else
                {
                    dp[i][j] = dp[i-1][j] ;
                }
            }
        }
        int min = Integer.MAX_VALUE ;
        for( int i = n , j = 0 ; j<=sum/2 ; j++ )
        {
            if( dp[i][j] && (sum - 2*j) < min )
            {
                min = sum - 2*j ;
            }
        }
        return min  ;
    }

}
