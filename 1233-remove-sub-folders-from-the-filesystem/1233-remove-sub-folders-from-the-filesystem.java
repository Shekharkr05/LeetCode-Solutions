class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String> list=new ArrayList<>();
        Arrays.sort(folder);
        if(folder.length==0)return list;
        list.add(folder[0]);
        for(String i:folder){
            if(!i.startsWith(list.get(list.size()-1)))list.add(i);
            else if( i.length()>list.get(list.size()-1).length()&&i.charAt(list.get(list.size()-1).length())!='/')list.add(i);
        }
        return list;
    }
}