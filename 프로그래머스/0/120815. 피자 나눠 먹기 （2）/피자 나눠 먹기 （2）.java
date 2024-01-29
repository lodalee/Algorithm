class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= 100; i++) {
            if (n > 6 * i) {
                if (n % 6 * i == 0 && !(n / 6 * i == 1)) {
                    answer = n / 6 * 1;
                    break;
                } else if (n % 6 * i == 0 && n / 6 * i == 1) {
                    answer = i;
                    break;
                }
            } else {
                if (6 * i % n == 0) {
                    answer = i;
                    break;
                }
            }
        }
        return answer;
    }
}