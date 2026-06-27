class Solution {
    public boolean digitCount(String num) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(var i:num.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(var i=0;i<num.length();i++){
            if((num.charAt(i)-'0')!=map.getOrDefault((char)(i+'0'),0))return false;
        }
        return true;
    }
}