class Solution {
     public String minWindow(String s, String t) {
          Map<Character,Integer> haveMap = new HashMap<>();
        Map<Character,Integer> needMap = new HashMap<>();
        for(int i= 0;i<t.length();i++)
            needMap.put(t.charAt(i),needMap.getOrDefault(t.charAt(i), 0) + 1);

int minLen = Integer.MAX_VALUE;   // start at "infinity"
        int needed = needMap.size();
        int satisfied=0;
        int l=0;
        int minStart = 0;
        for(int r =0;r<s.length();r++){
            //Expand
            char c = s.charAt(r);
            haveMap.put(c,haveMap.getOrDefault(c,0)+1);

            if(needMap.containsKey(c) && needMap.get(c).intValue()==haveMap.get(c).intValue())
                satisfied++;

            //shrink
            while(satisfied==needed){
                if(minLen > r-l+1){
                    minLen= r-l+1;
                    minStart = l;
                }
                char m = s.charAt(l);
                haveMap.put(m,haveMap.get(m)-1);

                if(needMap.containsKey(m) && haveMap.get(m)<needMap.get(m))
                    satisfied--;
                l++;
            }

        }
return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);


     }
           
}
