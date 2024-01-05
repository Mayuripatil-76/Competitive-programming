package dynamic_Programming;
/*
weight array : w[]
value array  : v[]
W : maximum weight that a sack can take

Put the items into the bag such that the sum of profits the maximum .
* */

public class Knapsack_0_1_recursive {
    public static void main( String args[] )
    {

        // no of items , weight and value associated with the items  ;

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
        if( w[n-1] > W )            // if value of the item is greater than total capacity(W) , do not include the item into bag
        {
            return fun( w , v , n-1 , W) ;
        }
        else // find max profit by including or excluding the item
        {
            return Math.max( v[n-1] + fun( w , v , n-1 , W-w[n-1]) ,
                    fun( w , v , n-1 , W)) ;
        }
    }




}
