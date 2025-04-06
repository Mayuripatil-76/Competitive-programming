// https://leetcode.com/problems/search-a-2d-matrix/description/?envType=problem-list-v2&envId=binary-search

class SearchIn2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rowIndex = findRowIndex(matrix , target , 0 , matrix.length-1 );

        if(rowIndex < 0 ){
            return false ; 
        }
        if(matrix[rowIndex][0] == target ){
            return true ; 
        }
        else {
            return binarySearch(matrix , target , 0 , matrix[rowIndex].length-1 , rowIndex ); 
        }
        
    }

    public boolean binarySearch( int[][] matrix , int target , int start , int end , int ri  ){
        while(start <= end ){
            int mid = start + (end-start)/2 ; 

            if(matrix[ri][mid] == target ){
                return true ; 
            }
            else if(matrix[ri][mid] > target ){
                end = mid-1 ; 
            }
            else{
                start = mid+1 ; 
            }
        }


        return false ; 
    }

    public int findRowIndex( int[][] matrix , int target , int start , int end  ){
        while(start <= end ){
            int mid = start + (end - start )/2 ; 

            if(matrix[mid][0] == target ){
                return mid ; 
            }
            else if(matrix[mid][0] > target ){
                end = mid-1 ; 
            }
            else{
                start = mid+1 ; 
            }
        }

        return end  ; 
    }
}
