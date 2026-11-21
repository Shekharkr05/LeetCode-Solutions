class Solution {
    public int numDifferentIntegers(String word) {
        HashSet<String> set=new HashSet<>();
        StringBuilder b=new StringBuilder();
        for(var i:word.toCharArray()){
            if(Character.isDigit(i))b.append(i+"");
            else {
                if(b.length()!=0){
                    set.add(removeZero(b));
                    b.setLength(0);
            }

        }
        }
        if(b.length()!=0)set.add(removeZero(b));
        return set.size();
        
    }
     String removeZero(StringBuilder sb) {
        int i = 0;
        while (i < sb.length() - 1 && sb.charAt(i) == '0')i++;
        return sb.substring(i);
    }
}