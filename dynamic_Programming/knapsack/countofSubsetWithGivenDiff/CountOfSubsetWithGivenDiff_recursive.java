package dynamic_Programming.knapsack.countofSubsetWithGivenDiff;

public class CountOfSubsetWithGivenDiff_recursive {

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

        /*
         s1 - s2 = diff ;
         s1 + s2 = sum ;
         ===============
         2s1 = diff + sum
         s1 = (diff + sum)/2

         */

        int s = (int)Math.ceil((diff+sum)/2.0) ;
        System.out.println(countno_of_subsets_with_given_diff(n, a, s));
    }

    public static int countno_of_subsets_with_given_diff( int n , int a[] , int sum )
    {
        if( n == 0 )
        {
            return 0 ;
        }
        if( sum == 0 )
        {
            return 1 ;
        }
        if( a[n-1] <= sum )
        {
            return countno_of_subsets_with_given_diff(n-1 , a , sum-a[n-1]) + countno_of_subsets_with_given_diff(n-1 , a , sum) ;
        }
        else
        {
            return  countno_of_subsets_with_given_diff(n-1 , a , sum) ;
        }
    }

}
