package dynamic_Programming.knapsack;

/*
0/1 Knapsack top down approach

- create matrix dp[n+1][w+1]
- 2 steps to fill the matrix
    - initialize the matrix
    -convert the recursive calls to iterative version
- base condition is used to initialize the matrix

* */
public class Knapsack_0_1_top_down__DP {

    public static int dp[][] = new int[101][1001] ;
    public static void main( String args[] )
    {

        // no of items , weight and value associated with the items  ;

        int n = 5 ;
        int v[] = new int[] { 60, 100, 120 , 150 , 80};
        int w[] = new int[] { 10, 20, 30 , 15 , 25};
        int W = 50;
        System.out.println(fun( w , v , W));



    }

    public static int fun(int w[] , int v[] , int W )
    {
        for( int i = 1 ; i<w.length+1 ; i++ )
        {
            for( int j = 1 ; j<W+1 ; j++ )
            {
                if( w[i-1] <= j )
                {
                    dp[i][j] = Math.max(v[i-1]+ dp[i-1][j-w[i-1]] , dp[i-1][j]) ;
                }
                else
                {
                    dp[i][j] = dp[i-1][j] ;
                }
            }
        }

        return dp[w.length][W] ;
    }

}
