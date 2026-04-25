class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> res = new ArrayList<>();
        int left=0;
        int top=0;
        int right=arr[0].length-1;
        int bottom=arr.length-1;

        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                 res.add(arr[top][i]);
                 
            }
            top++;
            for(int i=top;i<=bottom;i++){
                 res.add(arr[i][right]);
                 
            }
            right--;

            if(!(left<=right && top<=bottom))
            break;

            for(int i=right;i>=left;i--){
                 res.add(arr[bottom][i]);
                 
            }
            bottom--;

            

            for(int i=bottom;i>=top;i--){
                 res.add(arr[i][left]);
                 
            }
            left++;
        }

        return res;
    }
}
