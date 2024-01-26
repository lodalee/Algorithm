import java.util.Arrays;

class Solution {
    public int solution(int[] number) {
            int answer = 0;

            Arrays.sort(number); //-5, -2, 0, 2, 3

            for (int i = 0; i < number.length; i++) {
                int a = number[i];

                for (int j = i+1; j < number.length; j++) {
                    int b = number[j];

                    for(int k = j+1; k < number.length; k++){
                        int c = number[k];

                        if (a+b+c == 0){
                            answer++;
                        }
                    }
                }
            }

            return answer;
    }
}