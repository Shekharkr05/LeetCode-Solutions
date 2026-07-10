class Solution {
    public int myAtoi(String s) {
       char t[]= s.strip().toCharArray();
     
      long sum=0;
      int sign=1;
       for(int i=0;i<t.length;i++){
         if(Character.isDigit(t[i]))sum=sum*10+(t[i]-'0');
       else if((i==0)&&(t[i]=='-'||t[i]=='+'))sign=(t[i]=='-')?-1:1;
       else break;
       if(sign==1&&sum>Integer.MAX_VALUE)return Integer.MAX_VALUE;
       if(sign==-1&&-sum<Integer.MIN_VALUE)return Integer.MIN_VALUE;
        
       }
      
       return (int)sum*sign;
        
    }
}