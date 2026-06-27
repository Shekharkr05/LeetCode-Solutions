class Solution {
    public int passwordStrength(String password) {
       /* int sum=0;
StringBuilder b=new StringBuilder();
        for(var i:password.toCharArray()){
            if(Character.isLetter(i)&&Character.isLowerCase(i)&&b.indexOf(i+"")==-1){
                sum+=1;
                b.append(i);
            }
            else if(Character.isLetter(i)&&Character.isUpperCase(i)&&b.indexOf(i+"")==-1){
            sum+=2;
            b.append(i);
            }
            else if(Character.isDigit(i)&&b.indexOf(i+"")==-1){
                sum+=3;
                b.append(i);
            }
            else if(b.indexOf(i+"")==-1){
            sum+=5;
            b.append(i);
            }
        }
            return sum;*/
            HashSet<Character> set=new HashSet<>();
            for(var i:password.toCharArray()){
                set.add(i);
            }
           var sum=0;
            for(var i:set){
            if(i>='a'&&i<='z')sum+=1;
            else if(i>='A'&&i<='Z')sum+=2;
            else if(Character.isDigit(i))sum+=3;
            else sum+=5;
            }
           return sum;
    }
}