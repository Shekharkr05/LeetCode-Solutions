class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(var i:s.toCharArray())map.put(i,map.getOrDefault(i,0)+1);
        int oddmax=0,evenmin=Integer.MAX_VALUE;
        for(var i:map.keySet()){
            var temp=map.get(i);
            if(temp%2==0)evenmin=Math.min(evenmin,temp);
            else oddmax=Math.max(oddmax,temp);
        }
        return oddmax-evenmin;
    }
}