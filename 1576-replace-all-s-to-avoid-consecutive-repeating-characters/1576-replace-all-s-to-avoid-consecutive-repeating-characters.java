class Solution {
    public String modifyString(String s) {
        StringBuilder b=new StringBuilder(s);
        int t=s.length();
        if (t == 1 && b.charAt(0) == '?') return "a";
        for(int i=0;i<t;i++){
            if(b.charAt(i)=='?'){
                if(i==0)b.setCharAt(i,pro('?',b.charAt(i+1)));
                else if(i==t-1)b.setCharAt(i,pro(b.charAt(i-1),'?'));
                else b.setCharAt(i,pro(b.charAt(i-1),b.charAt(i+1)));
            }
           
        }
        return b+"";
    }
    char pro(char f,char s){
        char m='?';
        if(f=='?'){
          for(char x='a';x<='z';x++){
            if(x!=s){
                m=x;
            break;
            }
          }
        }
       else if(s=='?'){
          for(char x='a';x<='z';x++){
            if(x!=f){
                m=x;
            break;
            }
          }
        }
        else{
            for(char x='a';x<='z';x++){
            if(f!=x && s!=x){
                m=x;
            break;
            }
          }
        }

        return m;
    }
}