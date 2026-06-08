class Solution {
    public boolean isSubsequence(String s, String t) {
    int i=0,j=0;
    while(i<s.length()&&j<t.length()){
        if(s.charAt(i)== t.charAt(j)){  //O(n+m) The pointer j moves through every character of t, and i moves at most n times.
            i++;
        }
    j++;
    }
    return i ==s.length();   // If i is equal to the length of s, all characters of s were found in t
    }
    }
