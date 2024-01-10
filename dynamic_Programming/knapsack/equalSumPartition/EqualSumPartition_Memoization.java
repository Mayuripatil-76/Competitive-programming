package dynamic_Programming.knapsack.equalSumPartition;

public class EqualSumPartition_Memoization {
    public static void main( String args[] )
    {

        // no of items , weight and value associated with the items  ;

        int n = 4 ;
        int a[] = new int[] {1, 5, 11, 5};
        int sum = 0 ;
        for( int i = 0 ; i<n ; i++ )
        {
            sum+=a[i] ;
        }
        if( sum%2 != 0 )
        {
            System.out.println("false");
        }
        else
        {
            sum/=2 ;
            Boolean dp[][]= new Boolean[100][100001] ;
            System.out.println(fun(n, a, sum , dp));
        }

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
