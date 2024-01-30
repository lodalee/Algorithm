import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        int len = answer.length;

        if (answer[len-3] < answer[len-2])
            answer[len-1] = answer[len-2] - answer[len-3];

        else if (answer[len-3] >= answer[len-2])
            answer[len-1] = answer[len-2]*2;

            return answer;
    }
}