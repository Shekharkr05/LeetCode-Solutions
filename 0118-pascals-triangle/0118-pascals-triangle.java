class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        for(var i=0;i<numRows;i++){
            List<Integer> list2=new ArrayList<>();
            for(var j=0;j<=i;j++){
             if(j==0||j==i)list2.add(1);
             else{
                int left=list.get(i-1).get(j-1);
                int right=list.get(i-1).get(j);
                list2.add(left+right);
             }
             
            }
            list.add(list2);
        }
        return list;
    }
}