package dynamic_Programming.knapsack.subproblem;

public class SubsetSumTopDown_DP {

    public static void main( String args[] )
    {

        // no of items , weight and value associated with the items  ;

        int n = 6 ;
        int a[] = new int[] {3, 34, 4, 12, 5, 2};
        int sum = 30;
        System.out.println(isSubsetSum(n, a, sum));
    }

    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        Boolean dp[][] = new Boolean[N+1][sum+1] ;
        for( int i = 0 ; i<=N ; i++ )
        {
            for( int j = 0 ; j<=sum ; j++ )
            {
                if(i == 0 )
                {
                    dp[i][j] = false  ;
                }
                if( j == 0 )
                {
                    dp[i][j] = true ;
                }
            }
        }

        for( int i = 1 ; i<= N ; i++ )
        {
            for( int j = 1 ; j<= sum ; j++ )
            {
                if( arr[i-1] <= j)
                {
                    dp[i][j] = dp[i-1][j -arr[i-1]]|| dp[i-1][j] ;
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
