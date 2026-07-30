class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(var i:word.toCharArray())map.put(i,map.getOrDefault(i,0)+1);
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((a,b)->a.getValue()-b.getValue());
         var count=0;
         for(var i=0;i<list.size();i++){
            count+=((i/8)+1)*list.get(i).getValue();
         }
       
        return count;
    }
}