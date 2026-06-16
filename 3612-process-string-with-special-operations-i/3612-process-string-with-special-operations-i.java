class Solution {
    public String processStr(String s) {
        char arr[]=s.toCharArray();
        int n=arr.length;
        StringBuilder b=new StringBuilder();
       
        for(int i=0;i<n;i++){
            if(Character.isLetter(arr[i])&&Character.isLowerCase(arr[i]))b.append(arr[i]);
           else if(arr[i]=='*'&&b.length()-1>=0)b.deleteCharAt(b.length()-1);
           else if(arr[i]=='#')b.append(b+"");
           else if(arr[i]=='%')b.reverse();
        }
        return b+"";
    }
}