class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        if(s.length()==0)
        return true;
    
        st.push(s.charAt(0));
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i)== '(' || s.charAt(i)=='['
            || s.charAt(i)=='{')
                st.push(s.charAt(i));
            
            else{

                if(st.isEmpty())
                return false;

            Character top = st.peek();

           if((s.charAt(i)== ')' && top!='('))
               return false;

            else if( (s.charAt(i)== '}' && top!='{') )
                return false;

            else if(s.charAt(i)== ']' && top!='[')
               return false;

               else
               st.pop();

            }
            
        }
            
        if(st.isEmpty())
        return true;
        else
        return false;
    }
}
