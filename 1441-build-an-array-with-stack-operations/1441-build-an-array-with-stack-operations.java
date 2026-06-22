class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<Integer> list =new ArrayList<>();
        ArrayList<String> list2 =new ArrayList<>();

        for(int i=0;i<target.length;i++){
            list.add(target[i]);
        }
        for(int i=1;i<=target[target.length-1];i++){
            if(list.contains(i))list2.add("Push");
            else{
                list2.add("Push");
                list2.add("Pop");
            }
        }
        return list2;
    }
}