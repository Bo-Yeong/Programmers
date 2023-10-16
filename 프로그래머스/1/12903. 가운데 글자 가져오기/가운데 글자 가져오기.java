class Solution {
    public String solution(String s) {
        String[] list = s.split("");
        return list.length % 2 == 0 ?
            list[list.length / 2-1] +list[list.length / 2] 
            : list[list.length / 2];
    }
}