class Solution {
    public int getKth(int lo, int hi, int k) {
        
       List<int []> list=new ArrayList<>();
        for(int i=lo;i<=hi;i++){
          list.add(new int[]{pow(i),i});
        }
       Collections.sort(list,(a,b)->
       {
        if(a[0]==b[0])return a[1]-b[1];
        return a[0]-b[0];
       });
        return list.get(k-1)[1];
        
    }
    int pow(int n){
        int count=0;
        while(n!=1){
            if(n%2==0)n/=2;
            else n=(3*n)+1;
            count++;
        }
        return count;
    }
}