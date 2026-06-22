class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> set=new HashSet<>();
        int n=A.length;
       int  count=0,t=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            set.add(B[i]);
            for(int j=0;j<=i;j++){
                if(set.contains(A[j]))count++;
                arr[t]=count;
            }
          t++;  
         count=0;
        }
        return arr;
    }
}