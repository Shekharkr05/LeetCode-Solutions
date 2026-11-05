class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        var x=0;
        for(int i=0;i<arr1.length;i++){
            boolean safe=true;
            for(int j=0;j<arr2.length;j++){
                if(Math.abs(arr1[i]-arr2[j])<=d){
                    safe=false;
                    break;
                }
                
            }
            if(safe)x++;
        }
        return x;
    }
}