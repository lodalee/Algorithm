class Solution {
    public int[] solution(int n, int k) {
        int len = (int) n / k;
        int[] answer = new int[len];

        for (int i = 0; i < len; i++) {
            answer[i] = (i + 1) * k;
        }

        return answer;
    }
}