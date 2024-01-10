package dynamic_Programming.knapsack.equalSumPartition;

public class EqualSumPartition_Recursive {
    public static void main( String args[] )
    {

        // no of items , weight and value associated with the items  ;

        int n = 4 ;
        int a[] = new int[] {1, 5, 11, 6};
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
            System.out.println(isSubsetSum(n, a, sum));
        }

    }

    public static boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        if( sum == 0 )
        {
            return true ;
        }
        if( N== 0 )
        {
            return false ;
        }
        else
        {
            if(arr[N-1] <= sum )
            {
                return isSubsetSum( N-1 , arr , sum-arr[N-1]) || isSubsetSum( N-1 , arr , sum) ;

            }
            else
            {
                return isSubsetSum(N-1 , arr , sum) ;
            }
        }

    }
}
