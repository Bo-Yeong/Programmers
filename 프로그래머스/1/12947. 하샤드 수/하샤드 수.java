class Solution {
    public boolean solution(int x) {
        int sum = 0;
        String[] str = String.valueOf(x).split("");
        for(String num : str){
            sum += Integer.parseInt(num);
        }
        return x%sum == 0? true : false;
    }
}