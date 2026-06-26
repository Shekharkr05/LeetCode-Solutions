class Solution {
    public List<String> stringSequence(String target) {
        List<String> list=new ArrayList<>();
        StringBuilder b=new StringBuilder();
        for(char i:target.toCharArray()){
            
            for(char l='a';l<=i;l++){
                b.append(l);
                list.add(b+"");
                if(l!=i)b.deleteCharAt(b.length()-1);
            }
        }
        return list;
    }
}