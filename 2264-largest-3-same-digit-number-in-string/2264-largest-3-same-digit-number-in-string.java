class Solution {
    public String largestGoodInteger(String num) {
        String str="";
        int max=-1;
        for(int i=0;i<num.length()-2;i++){
            if(num.charAt(i)==num.charAt(i+1)&&num.charAt(i+2)==num.charAt(i)){
                if(max<num.charAt(i)-'0'){
                    str=num.substring(i,i+3);
                    max=num.charAt(i)-'0';
            }
        }
        }
        return str;
    }
}