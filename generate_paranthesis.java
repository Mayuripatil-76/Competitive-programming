// recursive function for generating paranthesis 
/*
input is number of pairs of paranthesis 
output is all the combinations of well formed paranthesis 
*/
class Solution {
    
    public List<String> AllParenthesis(int n)  // the function return list of strings having all the combinations of paranthesis 
    {
        // Write your code here
        List<String> l = new ArrayList<String>() ; 
        String s = "" ; 
        int o = 0 ; // no of opening bracket
        int c = 0 ; // no of closing brackets 
        foo( o , c , l , n , s ) ; 
        return l ; 
        
        
    }
    public void foo( int o , int c , List<String> a , int n , String s )  // recursive function 
    {
        if( s.length() == 2*n ) 
        {
            a.add(s) ; 
            return ;
        }
        if( o<n )
        {
            foo(o+1 , c , a , n , s+"(") ; 
        }
        if( c<o )
        {
            foo( o , c+1 , a , n , s+")" ) ; 
        }
    }
}
