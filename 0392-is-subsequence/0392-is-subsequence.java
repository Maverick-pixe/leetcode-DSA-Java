class Solution {
    public boolean isSubsequence(String s, String t) {
        int a =0,b=0;
        int count = 0;

        for(int i =0;i<t.length();i++){
            while(a<s.length() && b<t.length()){
                if(s.charAt(a)== t.charAt(b)){
                    count++;
                    a++;
                }
                b++;
            }
            }
            if(s.length() ==0 ) return true;
            else if (count == s.length()) return true;
            else return false;
        }
    }
