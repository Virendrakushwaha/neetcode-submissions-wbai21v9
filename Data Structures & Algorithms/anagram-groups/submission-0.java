class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
List<List<String>> res = new ArrayList<>();
        for(String str:strs){
            String newStr = str.toLowerCase();
              char[] ch = newStr.toCharArray();
              Arrays.sort(ch);
              String s = new String(ch);
              List<String> list;
              if(map.containsKey(s))
                list = map.get(s);
              else
                list = new ArrayList<>();
              list.add(str);
              map.put(s,list);
        }
     map.forEach((k, v) -> {
    res.add(v);
});
     return res;
    }
}
