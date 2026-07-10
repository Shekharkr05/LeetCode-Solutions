class Solution {
    public boolean areNumbersAscending(String s) {
       String arr[]= s.split("\\s+");
       ArrayList<Integer> list=new ArrayList<>();
       for(var i:arr){
        if(i.matches("[+-]?\\d+"))list.add(Integer.parseInt(i));
       }
      if(list.size()==1)return true;
        for(var i=0;i<list.size()-1;i++)if(list.get(i)>=list.get(i+1))return false;
        return true;
    }
}