import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String alpabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<skip.length();i++){
            alpabet = alpabet.replace(String.valueOf(skip.charAt(i)), "");
        }
        for(int i=0;i<s.length();i++){
            sb.append(alpabet.charAt(
                (alpabet.indexOf(s.charAt(i))+index)%alpabet.length()));
        }
        return sb.toString();
    }
}