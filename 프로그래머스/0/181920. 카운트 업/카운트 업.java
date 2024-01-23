class Solution {
    public int[] solution(int start_num, int end_num) {
        int length = end_num - start_num + 1;
        int[] answer = new int[length];

        //순회하며 start num ~ end num 까지 순서대로 출력
        for (int i = 0; i <length ; i++) {
            answer[i] = start_num + i;
        }


        return answer;
    }
}