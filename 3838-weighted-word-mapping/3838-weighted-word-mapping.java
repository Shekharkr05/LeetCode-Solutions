class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int n=words.length;
        StringBuilder b=new StringBuilder();
        for(int i=0;i<n;i++){
           b.append((char) ('z'-wei(weights,words[i])));
        }
        return b+"";
    }
    int wei(int []weight,String word){
        int n=word.length();
        int sum=0;
       for(int i=0;i<n;i++){
         sum+=weight[word.charAt(i)-'a'];
       }
        return sum%26;
    }
}