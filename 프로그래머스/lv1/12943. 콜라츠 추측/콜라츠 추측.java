class Solution {
    public int solution(int num) {
        int answer = 0;
        
         while (answer != 480) {
            if (num != 1) {
                if (num % 2 == 0) {
                    num = num / 2;
                    ++answer;
                } else {
                    num = num * 3 + 1;
                    ++answer;
                }
            } else {
                break;
            }
        
        }
        if (answer >=480  && num!=1){
            answer = -1;
        }
        return answer;
    }
}