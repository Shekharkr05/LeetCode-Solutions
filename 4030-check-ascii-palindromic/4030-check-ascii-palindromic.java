class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder b=new StringBuilder();
        for(var i:s.toCharArray()){
            String binary = Integer.toBinaryString(i);
            while (binary.length() < 8) {
    binary = "0" + binary;
}
        b.append(binary);
}
        int i=0,j=b.length()-1;
        while(i<j){
            if(b.charAt(i++)!=b.charAt(j--))return false;
        }
        return true;
        
    }
}