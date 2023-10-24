class Solution {
    public int solution(int n) {
        int answer = 0, f1 = 1, f2 = 1;

        for (int i = 3; i <= n; i++) {
            answer = f2%1234567 + f1%1234567;
            f1 = f2;
            f2 = answer;
        }
        return answer%1234567;
    }
}