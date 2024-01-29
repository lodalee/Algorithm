import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] -1;
            int end = commands[i][1];
            int target = commands[i][2] -1;

            int[] slicedArr = Arrays.copyOfRange(array, start, end);

            if (slicedArr.length == 1){
                answer[i] = slicedArr[0];
            } else if (slicedArr.length >= 2){
                Arrays.sort(slicedArr);
                answer[i] = slicedArr[target];
            }
        }
        return answer;
    }
}