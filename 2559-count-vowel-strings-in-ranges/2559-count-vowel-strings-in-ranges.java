class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int  arr[]=new int[words.length];
        int t=0;
        var k="aeiou";
        int cout=0;
        for(var i:words){
            if(k.indexOf(i.charAt(0))!=-1&&k.indexOf(i.charAt(i.length()-1))!=-1){
                cout++;
                arr[t++]=cout;
            }
            else arr[t++]=cout;
        }
        int nn[]=new int[queries.length];
        int count=0;
       for(var i=0;i<queries.length;i++){
    var left=queries[i][0];
     var right=queries[i][1];
           
     if (left == 0)
    nn[i] = arr[right];
else
    nn[i] = arr[right] - arr[left - 1];
       }
       return nn;
    }
}