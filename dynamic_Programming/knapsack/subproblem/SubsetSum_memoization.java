package dynamic_Programming.knapsack.subproblem;

public class SubsetSum_memoization {

    public static void main( String args[] )
    {

        // no of items , weight and value associated with the items  ;

        int n = 6 ;
        int a[] = new int[] {3, 34, 4, 12, 5, 2};
        int sum = 30;
        Boolean dp[][]= new Boolean[100][100001] ;
        System.out.println(fun(n, a , sum , dp  ));
    }
    static Boolean fun( int N , int a[] , int sum , Boolean dp[][] ){

        if(sum == 0 )
        {
            return true ;
        }
        if( N == 0 )
        {
            return false ;
        }
        if( dp[N][sum] != null )
        {
            return dp[N][sum] ;
        }
        else
        {
            if( a[N-1] <= sum )
            {
                return dp[N][sum]=fun(N-1 , a , sum-a[N-1], dp) || fun( N-1 , a , sum , dp) ;
            }
            else
            {
                return dp[N][sum]=fun( N-1 , a , sum , dp);
            }

        }

    }
}
