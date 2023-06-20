class Solution {
    public int solution(long num) {
        int answer = 0;
        
         while (answer != 500) {
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
        if (answer >=500  && num!=1){
            answer = -1;
        }
        return answer;
    }
}