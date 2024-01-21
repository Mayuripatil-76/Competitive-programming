package dynamic_Programming.knapsack.countofSubsetWithGivenDiff;

import java.util.Arrays;

public class CountOfSubsetSumWithGivenDiff_Memoization {


    public static void initialize_array(int dp[][])
    {
        for( int[] arr: dp )
        {
            Arrays.fill(arr , -1 );
        }
    }

    public static void main( String args[] )
    {

        // no of items , weight and value associated with the items  ;

        int n = 4 ;
        int a[] = new int[] {1 , 1 , 1 , 1};
        int diff = 0;
        int sum = 0 ;
        for( int i = 0 ; i<n ; i++ )
        {
            sum+= a[i] ;
        }
        int s = (int)Math.ceil((diff+sum)/2.0) ;
        int dp[][] = new int[n+1][s+1] ;
        initialize_array(dp);
        /*

        find the count of subsets whose difference is given

         s1 - s2 = diff ;
         s1 + s2 = sum ;
         ===============
         2s1 = diff + sum
         s1 = (diff + sum)/2

         */


        System.out.println(countno_of_subsets_with_given_diff(n, a, s, dp ));
    }

    public static int countno_of_subsets_with_given_diff( int n , int a[] , int s , int dp[][])
    {
        if( s == 0 )
        {
            return 1 ;
        }
        if( n == 0 )
        {
            return 0 ;
        }

        if(dp[n][s] != -1 )
        {
            return dp[n][s] ;
        }
        if( a[n-1] <= s )
        {
            return dp[n][s] = countno_of_subsets_with_given_diff(n-1 , a , s-a[n-1] , dp ) +
                    countno_of_subsets_with_given_diff(n-1 , a , s , dp) ;
        }
        else
        {
            return dp[n][s] = countno_of_subsets_with_given_diff(n-1 , a , s , dp) ;
        }
    }



}
