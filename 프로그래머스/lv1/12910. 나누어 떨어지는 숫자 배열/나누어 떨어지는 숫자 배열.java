import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answerList.add(arr[i]);
            }
        }

        if (answerList.isEmpty()) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        Arrays.sort(answer); // 원소를 오름차순으로 정렬

        return answer;
    }
}