class Solution {
    public String defangIPaddr(String address) {
        StringBuilder b=new StringBuilder();
        for(var i:address.toCharArray()){
           if(i=='.')b.append("[.]");
           else b.append(i);
        }
        return b+"";
    }
}