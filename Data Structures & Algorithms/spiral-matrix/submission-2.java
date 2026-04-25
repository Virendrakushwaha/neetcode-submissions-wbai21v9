class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> res = new ArrayList<>();
        int left=0;
        int top=0;
        int right=arr[0].length;
        int bottom=arr.length;

        while(left<right && top<bottom){
            for(int i=left;i<right;i++){
                 res.add(arr[top][i]);
                 
            }
            top++;
            for(int i=top;i<bottom;i++){
                 res.add(arr[i][right-1]);
                 
            }
            right--;

            if(!(left<right && top<bottom))
            break;

            for(int i=right-1;i>=left;i--){
                 res.add(arr[bottom-1][i]);
                 
            }
            bottom--;

            

            for(int i=bottom-1;i>=top;i--){
                 res.add(arr[i][left]);
                 
            }
            left++;
        }

        return res;
    }
}
