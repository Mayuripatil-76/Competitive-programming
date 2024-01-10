package dynamic_Programming.knapsack.countofsubsetsum;

public class CountofSubsetSum_top_down_DP {

    public static void main( String args[] )
    {

        // no of items , weight and value associated with the items  ;

        int n = 6 ;
        int a[] = new int[] {34, 34, 34, 12, 5, 22};
        int sum = 34;
        System.out.println(isSubsetSum(n, a, sum));
    }

    static int isSubsetSum(int N, int arr[], int sum){
        int dp[][] = new int[N+1][sum+1] ;
        for( int i = 0 ; i<=N ; i++ )
        {
            for( int j = 0 ; j<=sum ; j++ )
            {
                if(i == 0 )
                {
                    dp[i][j] = 0  ;
                }
                if( j == 0 )
                {
                    dp[i][j] = 1 ;
                }
            }
        }

        for( int i = 1 ; i<= N ; i++ )
        {
            for( int j = 1 ; j<= sum ; j++ )
            {
                if( arr[i-1] <= j)
                {
                    dp[i][j] = dp[i-1][j -arr[i-1]] + dp[i-1][j] ;
                }
                else
                {
                    dp[i][j] = dp[i-1][j] ;
                }

            }
        }
        return dp[N][sum] ;
    }
}
