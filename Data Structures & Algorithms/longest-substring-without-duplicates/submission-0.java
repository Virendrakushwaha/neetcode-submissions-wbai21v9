class Solution {
    public int lengthOfLongestSubstring(String s) {
            int l=0;
            int maxLen = 0;
            Set<Character> set = new HashSet<>();
            for(int r=0;r<s.length();r++){
                     char c = s.charAt(r);
                while(set.contains(c)){
                    set.remove(s.charAt(l));
                    l++;
                }
                //set not containing character
                set.add(c);
                maxLen = Math.max(r-l+1,maxLen);
            }
                    return maxLen;
    }
}
