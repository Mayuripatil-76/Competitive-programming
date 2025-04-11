class RemovingStarsFromString {
    public String removeStars(String st) {
        Stack<Character> s = new Stack<>() ; 

        for(int i = 0 ; i<st.length() ; i++ ){
            if(st.charAt(i) == '*'){
                if(!s.isEmpty()){
                    s.pop() ; 
                }
            }
            else{
                s.push(st.charAt(i)); 
            }
        }
        String s2 = "" ; 
        while(!s.isEmpty()){
            s2 = s.pop() + s2 ; 
        }
        return s2 ; 
    }
}
