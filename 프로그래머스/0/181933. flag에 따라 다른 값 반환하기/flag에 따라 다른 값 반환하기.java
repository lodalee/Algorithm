class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;

        //boolean 값에 따라 연산
        if (flag){
            answer = a+b;
        } else {
            answer = a-b;
        }
        return answer;
    }
}