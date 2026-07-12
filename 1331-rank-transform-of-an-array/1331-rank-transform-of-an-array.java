class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
       int arr2[]=arr.clone();
       int k=1;
       Arrays.sort(arr2);
        for(var i:arr2){
            if(map.getOrDefault(i,0)==0){
                map.put(i,k);
                k++;
        }
    }
    k=0;
    for(int i:arr){
        arr[k]=map.get(i);
        k++;
    }
    return arr;
    }
}