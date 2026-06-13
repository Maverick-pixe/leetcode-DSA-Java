class Solution {
    public String reverseWords(String s) {
     StringBuilder result = new StringBuilder();
     int i = s.length()-1;
      
      while(i>=0){
        while(i >=0 && s.charAt(i) == ' ') i--; //for space
        if( i<0) break;

        int end =i;
        while(i>=0 && s.charAt(i) !=' ') i--;  // start of a word

        if(result.length() >0) result.append(' '); 
        result.append(s,i+1,end+1);        //append words to result
      }
      return result.toString();
    }
}