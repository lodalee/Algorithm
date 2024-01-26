class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();

        // food가 홀수일 때 -1
        for (int i = 1; i < food.length; i++) {
            if (food[i] % 2 != 0){
                food[i] -= 1;
            }
        }

        //왼쪽에 숫자 절반 입력
        for (int i = 1; i < food.length; i++) {
            int mid = food[i]/2;
            while (mid != 0){
                left.append(i);
                mid--;
            }
        }
        String value = left.toString();
        for (int i = value.length() -1; i >=0; i--) {
            right.append(value.charAt(i));
        }

        answer += left;
        answer += 0;
        answer += right;
        return answer;
    }
}