class Solution {
    public boolean isValid(String s) {
        String o="({[";
       // String c=")}]";
        Stack<Character> st=new Stack<>();

        for(char i:s.toCharArray()){
       /* if(o.indexOf(i)>-1)st.push(i);
        if(c.indexOf(i)>-1){
            if(st.isEmpty())return false;
            char k=st.pop();
            if(k=='('&&i!=')')return false;
            if(k=='{'&&i!='}')return false;
            if(k=='['&&i!=']')return false;
        }
        }*/
       
        if(o.indexOf(i)!=-1)st.push((i=='(')?')':(i=='{')?'}':']');
        else{ if(st.isEmpty()||st.pop()!=i)return false;}
       
        }
         return st.isEmpty();
    }
}