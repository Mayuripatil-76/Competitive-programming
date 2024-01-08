package dynamic_Programming.knapsack;


import java.util.Arrays;

/*
*
* 0/1 Knapsack memoization
*
* memoization :It basically stores the previously calculated result of the subproblem
*  and uses the stored result for the same subproblem. This removes the extra effort
* to calculate again and again for the same problem.
*
* drawback : function call increases ( function stack increase )
* */
public class Knapsack_0_1_memoization {


    // n<=100
    // W<=1000

    // create a matrix dp to store the values
    public static int dp[][] = new int[101][1001] ;
    public static void initilizearray(int dp[][])
    {
        for(int[] arr1 : dp)
            Arrays.fill(arr1, -1);
    }

    public static void main( String args[] )
    {

        // no of items , weight and value associated with the items  ;

        initilizearray(dp);
        int n = 5 ;
        int v[] = new int[] { 60, 100, 120 , 150 , 80};
        int w[] = new int[] { 10, 20, 30 , 15 , 25};
        int W = 50;
        System.out.println(fun( w , v , n , W));



    }


    public static int fun( int w[] , int v[] , int n , int W )
    {
        if(n == 0 || W == 0 )           // if no of items is 0 or if total capacity of the bag is 0 , then maximum profit is also 0
        {
            return 0 ;
        }
        if( dp[n][W] != -1 )
        {
            return dp[n][W] ;
        }
        if( w[n-1] > W )            // if value of the item is greater than total capacity(W) , do not include the item into bag
        {
            return dp[n][W]= fun( w , v , n-1 , W) ;
        }
        else // find max profit by including or excluding the item
        {
            return dp[n][W]= Math.max( v[n-1] + fun( w , v , n-1 , W-w[n-1]) ,
                    fun( w , v , n-1 , W)) ;
        }
    }
}
