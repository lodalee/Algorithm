class Solution {
    public int solution(int n) {
    int answer = 0;
        //n 의 홀짝판별
        if (n % 2 == 0){
            // 짝수면 n 이하의 짝수 모두 더하기
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0){
                    answer += i*i;
                }
            }
        } else if (n % 2 == 1) {
            for (int i = 1; i <= n ; i++) {
                if (i % 2 == 1){
                    answer += i;
                }
            }
        } else {
            answer = -1;
        }
        return answer;
    }
}