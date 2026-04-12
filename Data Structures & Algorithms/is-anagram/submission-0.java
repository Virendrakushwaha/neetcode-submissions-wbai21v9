class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
            return false;
        int a[] = new int[120];
        s = s.toLowerCase();
        t = t.toLowerCase();

        for(int i=0;i<s.length();i++){
            ++a[s.charAt(i)-65];

        }

        for(int i=0;i<t.length();i++){
            --a[t.charAt(i)-65];
        }

        for(int i=0;i<120;i++){
            if(a[i]!=0)
                return false;
        }
        return true;
    }
}
