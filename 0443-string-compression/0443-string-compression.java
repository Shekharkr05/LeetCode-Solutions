class Solution {
    public int compress(char[] chars) {
     if(chars.length==1)return 1;
     int n=chars.length;
     int count=1;
     StringBuilder b=new StringBuilder();
     for(int i=1;i<n;i++){
        if(chars[i]==chars[i-1])count++;
        else{
            b.append(chars[i-1]);
            if(count>1)b.append(count+"");
            count=1;
        }
     }
     b.append(chars[n-1]);
     if(count>1)b.append(count+"");
     for(int i=0;i<b.length();i++){
         chars[i]=b.charAt(i);
     }
     return b.length();
    }
}